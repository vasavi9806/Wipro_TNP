import java.util.*;

class Employee {

    int empId;
    String empName;

    Employee(int empId, String empName) {
        this.empId = empId;
        this.empName = empName;
    }

    public String toString() {
        return empId + " " + empName;
    }
}

public class VectorIteratorEnumeration {

    public static void main(String[] args) {

        Vector<Employee> employees = new Vector<>();

        employees.add(new Employee(101, "Cherry"));
        employees.add(new Employee(102, "Rahul"));
        employees.add(new Employee(103, "Priya"));

        System.out.println("Using Iterator");

        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        System.out.println("Using Enumeration");

        Enumeration<Employee> enumeration = employees.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(enumeration.nextElement());
        }
    }
}