import java.util.HashSet;
import java.util.Iterator;

public class EmployeeHashSet {

    public static void main(String[] args) {

        HashSet<String> employees = new HashSet<>();

        employees.add("Cherry");
        employees.add("Rahul");
        employees.add("Priya");
        employees.add("Anitha");
        employees.add("Kiran");

        Iterator<String> it = employees.iterator();

        System.out.println("Employee Names:");

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}