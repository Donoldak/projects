import java.util.Scanner;

public class Podstroka {

    int chek(String stroka, String podStroka){
        int iter = 0;
        for (int i = 0; i < stroka.length() - podStroka.length() ; i++) {
            if (stroka.indexOf(podStroka, i) != -1){
                iter++;
                i = stroka.indexOf(podStroka, i);
            }
        }
        return iter;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.next();
        String podString = scanner.next();
        Podstroka podstroka = new Podstroka();
        System.out.println(podstroka.chek(string, podString));

    }
}
