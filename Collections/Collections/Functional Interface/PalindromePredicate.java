import java.util.*;
import java.util.function.Predicate;

public class PalindromePredicate {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("madam");
        words.add("java");
        words.add("level");
        words.add("wipro");
        words.add("radar");
        words.add("hello");
        words.add("refer");
        words.add("world");
        words.add("noon");
        words.add("chat");

        Predicate<String> palindrome =
                word -> word.equalsIgnoreCase(
                        new StringBuilder(word).reverse().toString());

        System.out.println("Palindrome Words:");

        words.stream()
                .filter(palindrome)
                .forEach(System.out::println);

    }
}