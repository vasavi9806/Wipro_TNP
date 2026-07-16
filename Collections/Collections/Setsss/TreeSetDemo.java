import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

    public static void main(String[] args) {

        TreeSet<String> ts = new TreeSet<>();

        ts.add("Java");
        ts.add("Python");
        ts.add("C");
        ts.add("C++");
        ts.add("HTML");

        System.out.println("Original TreeSet:");
        System.out.println(ts);

        System.out.println("\nReverse Order:");
        System.out.println(ts.descendingSet());

        System.out.println("\nUsing Iterator:");

        Iterator<String> it = ts.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("\nContains Java? " + ts.contains("Java"));
        System.out.println("Contains PHP? " + ts.contains("PHP"));
    }
}