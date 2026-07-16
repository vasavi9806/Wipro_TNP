import java.util.*;
import java.util.function.Function;

class Employee {

    int id;
    String name;
    String location;
    double salary;

    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class EmployeeLocationFunction {

    public static void main(String[] args) {

        ArrayList<Employee> list = new ArrayList<>();

        list.add(new Employee(101, "Cherry", "Hyderabad", 50000));
        list.add(new Employee(102, "Rahul", "Pune", 60000));
        list.add(new Employee(103, "Priya", "Chennai", 55000));
        list.add(new Employee(104, "Kiran", "Bangalore", 70000));
        list.add(new Employee(105, "Anitha", "Pune", 65000));

        Function<ArrayList<Employee>, ArrayList<String>> fun = empList -> {

            ArrayList<String> locations = new ArrayList<>();

            for (Employee e : empList) {
                locations.add(e.location);
            }

            return locations;
        };

        System.out.println("Employee Locations:");
        System.out.println(fun.apply(list));
    }
}