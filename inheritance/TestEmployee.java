// 1. Person Class
class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

// 2. Employee Class
class Employee extends Person {
    private double annualSalary;
    private int yearStarted; 
    private String nationalInsuranceNumber;

    // Necessary constructor
    public Employee(String name, double annualSalary, int yearStarted, String nationalInsuranceNumber) {
        super(name); 
        this.annualSalary = annualSalary;
        this.yearStarted = yearStarted;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    // Getter and setter methods
    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public int getYearStarted() {
        return yearStarted;
    }

    public void setYearStarted(int yearStarted) {
        this.yearStarted = yearStarted;
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

// 3. Main Testing Class
public class TestEmployee {
    public static void main(String[] args) {
        // Create an instance of Employee
        Employee emp = new Employee("Alice Smith", 85000.50, 2021, "QQ123456C");

        // Test and display the attributes using getters
        System.out.println("--- Employee Details ---");
        System.out.println("Name: " + emp.getName());
        System.out.println("Annual Salary: $" + emp.getAnnualSalary());
        System.out.println("Year Started: " + emp.getYearStarted());
        System.out.println("National Insurance Number: " + emp.getNationalInsuranceNumber());

        // Test setter methods to modify data
        System.out.println("\n--- Updating Employee Details ---");
        emp.setAnnualSalary(92000.00);
        emp.setName("Alice Jones");

        // Display updated details
        System.out.println("Updated Name: " + emp.getName());
        System.out.println("Updated Salary: $" + emp.getAnnualSalary());
    }
}