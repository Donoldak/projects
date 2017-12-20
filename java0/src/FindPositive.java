import java.util.Arrays;
import java.util.OptionalInt;

public class FindPositive {
    public static void main(String[] args) {
        int[] elements = {-1,-1,-1,-2,-2,-3,4,-5,-6,-5};
        final OptionalInt firstPositive = Arrays.stream(elements)
                .filter(x -> x > 0)
                .findFirst();
        System.out.println(firstPositive);
    }
}
