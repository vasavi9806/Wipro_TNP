import java.util.ArrayList;

public class OddLengthLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("HTML");
        al.add("CSS");
        al.add("Spring");
        al.add("React");
        al.add("Oracle");
        al.add("Cloud");
        al.add("Docker");
        al.add("AI");

        System.out.println("Strings with Odd Length:");

        al.forEach(s -> {

            if (s.length() % 2 != 0)
                System.out.println(s);

        });

    }
}