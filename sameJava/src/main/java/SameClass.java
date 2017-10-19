import java.util.Scanner;

public class SameClass {
    public double division(double a, double b){
        return a/b;
    }
    public void changeArray(int[] array){
        array[0] = -999;
    }
    public int userInput(){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        return input++;
    }
}
