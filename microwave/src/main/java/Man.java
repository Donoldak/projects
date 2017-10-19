import java.util.InputMismatchException;
import java.util.Scanner;

public class Man {

    int choice = 0;
    Scanner scanner = new Scanner(System.in);
    Microwave microwave = new Microwave();
    void printMenu() {
        System.out.println("1 - открыть микроволновку");
        System.out.println("2 - закрыть микроволновку");
        System.out.println("3 - положить еду");
        System.out.println("4 - взять еду");
        System.out.println("5 - включить микроволновку");
        System.out.println("6 - показать состояние миероволновки");
    }
    void makeChoice() {
        Scanner scanner = new Scanner(System.in);
        try {
            choice = scanner.nextInt();

            if (choice != 1 & choice != 2 & choice != 3 & choice != 4 & choice != 5 & choice != 6){
                throw new InputMismatchException();
            }
        } catch (InputMismatchException e) {
            System.out.println("Вы нажали что-то не то");
            choice = 0;
            this.printMenu();
            this.makeChoice();
        }
    }

    void letsGo(){
        switch (choice){
            case 1:
                microwave.openDoor();
                this.printMenu();
                break;
            case 2:
                microwave.closeDoor();
                this.printMenu();
                break;
            case 3:
                try {
                    microwave.putFood();
                }catch (Microwave.ExceptionDoorIsClose exceptionDoorIsClose){
                    exceptionDoorIsClose.getMassege();
                }
                this.printMenu();
                break;
            case 4:
                try {
                    microwave.takeFood();
                }catch (Microwave.ExceptionNoFood exceptionNoFood){
                    exceptionNoFood.getMassege();
                }catch (Microwave.ExceptionDoorIsClose exceptionDoorIsClose){
                    exceptionDoorIsClose.getMassege();
                }
                this.printMenu();
                break;
            case 5:
                try {
                    microwave.microwaveOn();
                    System.out.println("Вы успешно подогрели еду");
                    String c = scanner.next();
                    System.exit(0);
                }catch (Microwave.ExceptionNoFood exceptionNoFood){
                    exceptionNoFood.getMassege();
                    this.printMenu();
                }catch (Microwave.ExceptionDoorIsOpen exceptionDoorIsOpen){
                    exceptionDoorIsOpen.getMassege();
                    this.printMenu();
                }
                break;
            case 6:
                microwave.getState();
                this.printMenu();
        }
        choice = 0;
        this.makeChoice();
        this.letsGo();
    }

}
