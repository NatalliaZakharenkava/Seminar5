import java.util.*;
public class Main {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
        hm.put("one", "first value");
        hm.put("two", "second value");
        hm.put("three", "third value");
        hm.put("four", "fourth value");
        hm.put("five", "fifth value");
        hm.put("six", "sixth value");
        System.out.println(hm.values());

        hm.forEach((key,value)-> {
            hm.put(key, value.concat("!"));
        });
        System.out.println(hm.values());

        HashMap<String, String> hm2 = new HashMap<>();
        hm2.put("one", "value one");
        hm2.put("tree", "value three");
        hm2.put("five", "value five");
        hm2.put("seven", "value seven");
        hm2.put("eight", "value eight");
        hm2.put("nine", "value nine");
//        hm2.forEach((key, value) -> {
//            hm.merge(key, value, (v1, v2) -> v1.concat(", ").concat(v2));
//        });
//        System.out.println(hm);

        hm2.forEach((key, value) -> {
            if (hm.containsKey(key)) {
                String newValue = hm.get(key).concat(", ").concat(value);
                hm.put(key, newValue);
            }
            else  {
                hm.put(key, value);
            }
        });
        System.out.println(hm);


    }
}