import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {
//        Map<String, Integer> hashmap = new HashMap<>();
//        Map<String, Integer> map = new TreeMap<>();
//        hashmap.put("abc", 1);
//        hashmap.put("c", 3);
//        hashmap.put("bb", 2);
//
//        map.put("aaa", 1);
//        map.put("c", 3);
//        map.put("bb", 2);
//        System.out.println(hashmap);
//        System.out.println(map);

        PersonalInfo p1 = new PersonalInfo("123abc", "Iosi", 25);
        PersonalInfo p2 = new PersonalInfo("dsfdsf", "Ora", 54);

        Map<String, PersonalInfo> map = new TreeMap<>();
        map.put(p1.passportNumb, p1);
        map.put(p2.passportNumb, p2);
        System.out.println(map.get("123abc"));
    }
}
