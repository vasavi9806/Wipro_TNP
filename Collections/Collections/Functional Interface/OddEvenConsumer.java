import java.util.*;
import java.util.function.Consumer;

public class OddEvenConsumer {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(5);
        numbers.add(8);
        numbers.add(11);
        numbers.add(14);
        numbers.add(17);
        numbers.add(20);
        numbers.add(23);
        numbers.add(26);
        numbers.add(29);

        Consumer<Integer> check = n -> {

            if (n % 2 == 0)
                System.out.println(n + " Even");
            else
                System.out.println(n + " Odd");

        };

        numbers.forEach(check);
    }
}