import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NegativeEvenNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(-10);
        list.add(15);
        list.add(-8);
        list.add(20);
        list.add(-3);
        list.add(-6);
        list.add(12);
        list.add(-14);
        list.add(5);

        List<Integer> result = list.stream()
                .filter(n -> n < 0 && n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Negative Even Numbers:");
        result.forEach(System.out::println);
    }
}