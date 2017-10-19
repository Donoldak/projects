import java.util.Scanner;

public class KolVoSlov {

    int chek(String string){
        String[] words = string.split(" ");
        System.out.println(words.length);
        return words.length;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String string = scanner.nextLine();
        KolVoSlov kolVoSlov = new KolVoSlov();
        System.out.println(kolVoSlov.chek(string));
    }
}
