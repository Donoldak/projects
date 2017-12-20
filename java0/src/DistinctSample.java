import java.util.Arrays;

public class DistinctSample {

    public static void main(String[] args) {
        int[] elements = {1,1,1,2,2,3,4,5,6,5};
        Arrays.stream(elements)
                .distinct()
                .forEach(System.out::println);
    }
}
