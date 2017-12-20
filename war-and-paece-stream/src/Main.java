import java.io.InputStream;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> frequncies = getFrequncies(getWordsStream());

        System.out.println(frequncies);

        frequncies.entrySet().stream()
                .sorted((pair1, pair2) ->  pair2.getValue() - pair1.getValue())
                .limit(20)
                .forEach(System.out::println);
    }

    public static Stream<String> getWordsStream(){

        return Arrays.stream(new String[]{"a", "b", "a","a" ,"c", "b"});
    }

    public static Map<String, Integer> getFrequncies(Stream<String> words){
        words
                .collect(Collectors.groupingBy(x -> x));
    }
}
