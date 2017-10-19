import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Man man = new Man();
       Microwave microwave = new Microwave();
       microwave.getState();
       man.printMenu();
       man.makeChoice();
       man.letsGo();

    }
}
