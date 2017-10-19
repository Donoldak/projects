import java.util.Scanner;

public class Main {

    String revers(String string){
        string = new StringBuffer(string).reverse().toString();
        return string;
    }
    public static void main(String[] args) {
        Main stroka = new Main();
        String str = new String();
        Scanner scanner = new Scanner(System.in);
        str = scanner.next();
        System.out.println(stroka.revers(str));
    }
}
