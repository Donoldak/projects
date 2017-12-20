import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Map_ {
    public static void main(String[] args) throws IOException {
        Map<String, Double> milkProducts = new HashMap<>();
        milkProducts.put("молоко", 2.5);
        milkProducts.put("молоко", 3.5);
        milkProducts.put("кефир", 2.5);
        milkProducts.put("творог", 15.0);

        System.out.println("Введите название продукта: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        System.out.println("Содержание жира: " + milkProducts.get(input));
    }
}
