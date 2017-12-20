import java.util.Arrays;
import java.util.OptionalDouble;

public class Main {
    public static void main(String[] args) {
        int [] elements = {5, 5, 100, 5, 5, 200, 5 ,5 , 5};

        OptionalDouble average1 = Arrays.stream(elements).average();
        average1.ifPresent(averageValue -> Arrays.stream(elements)
                    .filter(x -> x > averageValue)
                    .forEach(System.out::println));
    }


}
