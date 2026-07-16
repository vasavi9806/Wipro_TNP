import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContactList {

    public static void main(String[] args) {

        HashMap<String, Integer> contacts = new HashMap<>();

        contacts.put("Cherry", 987654321);
        contacts.put("Rahul", 987654322);
        contacts.put("Priya", 987654323);
        contacts.put("Anitha", 987654324);

        // Check Key
        System.out.println("Contains Cherry : "
                + contacts.containsKey("Cherry"));

        // Check Value
        System.out.println("Contains Number 987654323 : "
                + contacts.containsValue(987654323));

        System.out.println("\nContact List");

        Iterator<Map.Entry<String, Integer>> it =
                contacts.entrySet().iterator();

        while (it.hasNext()) {

            Map.Entry<String, Integer> entry = it.next();

            System.out.println(entry.getKey()
                    + " : "
                    + entry.getValue());

        }

    }
}