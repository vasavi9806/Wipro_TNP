import java.util.Optional;

// User-defined exception class
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Dummy Employee Class
class Employee {
    private String name;
    public Employee(String name) { this.name = name; }
}

public class OptionalAssignment3 {
    public static void checkEmployee(Employee emp) {
        // Throw custom exception if the employee object is null
        Employee validEmp = Optional.ofNullable(emp)
            .orElseThrow(() -> new InvalidEmployeeException("InvalidEmployeeException: Employee data cannot be null"));
        
        System.out.println("Employee is valid.");
    }

    public static void main(String[] args) {
        try {
            checkEmployee(null); // This will trigger the exception
        } catch (InvalidEmployeeException e) {
            System.out.println(e.getMessage());
        }
    }
}