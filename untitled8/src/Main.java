import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(metod(3, 3));

    }


    public static List<Integer> metod(int a, int b){
        List<Integer> list = new LinkedList<>();
        int sqrt = a*b;
        if (a == b){
            return null;
        }
        while (sqrt !=0){
            if (a>b){
                list.add(b);
                sqrt = sqrt - b*b;
                a = a-b;
            }
            if (b>a) {
                list.add(a);
                sqrt = sqrt - a * a;
                b = b - a;
            }
            if (a == b){
                list.add(a);
                break;
            }
        }
        return list;
    }
}
