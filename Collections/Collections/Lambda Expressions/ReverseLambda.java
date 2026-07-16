import java.util.ArrayList;
import java.util.Collections;

public class ReverseLambda {

    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<>();

        al.add("Java");
        al.add("Python");
        al.add("HTML");
        al.add("CSS");
        al.add("Spring");
        al.add("React");
        al.add("SQL");
        al.add("Oracle");
        al.add("Cloud");
        al.add("Docker");

        Collections.reverse(al);

        al.forEach(s -> System.out.println(s));

    }
}