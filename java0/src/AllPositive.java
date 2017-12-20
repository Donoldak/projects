import java.util.Arrays;

public class AllPositive {
    public static void main(String[] args) {
        int[] elements = {1,1,1,2,2,3,4,5,6,5};
        final boolean allPositive = Arrays.stream(elements)
                .allMatch(x -> x > 0);
        System.out.println(allPositive);
    }
}
