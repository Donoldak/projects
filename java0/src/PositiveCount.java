import java.util.Arrays;

public class PositiveCount {

    public static void main(String[] args) {
        int[] elements = {1, -2,-3,-4,-5};

        final long count = Arrays.stream(elements)
                .filter(x -> x>0)
                .count();
        System.out.println(count);
    }
}
