import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String text = FileWorker.readFile("C:\\book1.txt");
        String[] slova = text.trim().split("\\s+");
            HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
            for (int i = 0; i < slova.length; i++) {
                if (hashMap.containsKey(slova[i])) {
                    hashMap.replace(slova[i], hashMap.get(slova[i]) + 1);
                } else {
                    hashMap.put(slova[i], 1);
                }
            }
            String s = null;
            int p = 0;

        for (int i = 0; i < 20; i++) {
            for (String w: hashMap.keySet()){
                if (p < hashMap.get(w)) {
                    p = hashMap.get(w);
                    s = w;
                }
            }
            System.out.println("Слово: " + s + " Встретилось " + hashMap.get(s) + " раз");
            for (Map.Entry<String, Integer> e: hashMap.entrySet()){
                if (e.getValue().equals(s)){
                    hashMap.remove(e.getKey());
                }
            }
        }

    }
}