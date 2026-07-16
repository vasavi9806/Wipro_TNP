import java.util.*;
import java.util.function.Predicate;

class Employee {

    private int id;
    private String name;
    private double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }
}

public class SalaryPredicate {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101,"Cherry",9000));
        list.add(new Employee(102,"Rahul",12000));
        list.add(new Employee(103,"Priya",8000));
        list.add(new Employee(104,"Kiran",15000));
        list.add(new Employee(105,"Anitha",7000));

        Predicate<Employee> p = e -> e.getSalary() < 10000;

        System.out.println("Employees with Salary < 10000");

        list.stream()
            .filter(p)
            .forEach(e -> System.out.println(e.getName()));
    }
}