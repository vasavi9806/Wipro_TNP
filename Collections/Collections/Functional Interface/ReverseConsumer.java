import java.util.*;
import java.util.function.Consumer;

public class ReverseConsumer {

    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Spring");
        words.add("Oracle");
        words.add("HTML");
        words.add("CSS");
        words.add("React");
        words.add("Docker");
        words.add("Cloud");
        words.add("Wipro");

        Consumer<ArrayList<String>> reverse = list -> {

            for(int i=0;i<list.size();i++){

                String rev = new StringBuilder(list.get(i))
                        .reverse()
                        .toString();

                list.set(i, rev);
            }
        };

        reverse.accept(words);

        System.out.println("Reversed Words");

        words.forEach(System.out::println);
    }
}