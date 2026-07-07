import java.util.ArrayList;
import java.util.StringJoiner;

public class StringJoinerAssignment1 {
    public static String formatNames(ArrayList<String> names) {
        // Initialize StringJoiner with comma delimiter, prefix '{', and suffix '}'
        StringJoiner sj = new StringJoiner(", ", "{", "}");
        
        // Use forEach to add each name to the StringJoiner
        names.forEach(name -> sj.add(name));
        
        return sj.toString();
    }

    public static void main(String[] args) {
        // Example Usage:
        ArrayList<String> nameList = new ArrayList<>();
        nameList.add("Alice");
        nameList.add("Bob");
        nameList.add("Charlie");

        String result = formatNames(nameList);
        System.out.println(result); // Output: {Alice, Bob, Charlie}
    }
}