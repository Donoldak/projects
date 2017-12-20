import java.util.Arrays;

public class AnyNegativePrZero {
    public static void main(String[] args) {
        int[] elements = {1,1,1,2,2,3,4,5,6,5};
        final boolean anyNegativeOrZero = Arrays.stream(elements)
                .anyMatch(x -> x<= 0);
        System.out.println(anyNegativeOrZero);
    }
}
