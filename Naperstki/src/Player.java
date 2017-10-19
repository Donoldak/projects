import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    public int resultPlayer = 0;

    public void playerMakeChoice(){
        resultPlayer = 0;
        Scanner scn = new Scanner(System.in);
        System.out.println("Выберите номер стакана(1-3)");
        while (resultPlayer == 0) {
            try {
                resultPlayer = scn.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Вы выбрали несуществующий стакан :с");
                this.playerMakeChoice();
            }
        }
        if (resultPlayer == 1 | resultPlayer == 2 | resultPlayer == 3){

        }else {
            System.out.println("Вы выбрали несуществующий стакан :с");
            this.playerMakeChoice();
        }
    }

}
