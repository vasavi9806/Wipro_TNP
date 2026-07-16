import java.util.ArrayList;

public class NumberArrayList {

    public static void main(String[] args) {

        ArrayList<Number> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(25.5);
        numbers.add(100L);
        numbers.add(12.75f);
        numbers.add(50);

        System.out.println("Numbers in ArrayList:");

        for (Number n : numbers) {
            System.out.println(n);
        }
    }
}