import java.util.*;

public class HashMapDemo {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();

        map.put("India", "Delhi");
        map.put("Japan", "Tokyo");
        map.put("USA", "Washington");
        map.put("Australia", "Canberra");

        // Check Key
        System.out.println("Contains Key India : "
                + map.containsKey("India"));

        // Check Value
        System.out.println("Contains Value Tokyo : "
                + map.containsValue("Tokyo"));

        // Iterator

        System.out.println("\nUsing Iterator");

        Iterator<Map.Entry<String, String>> it =
                map.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, String> entry = it.next();

            System.out.println(entry.getKey()
                    + " -> "
                    + entry.getValue());

        }

    }
}