import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    public Employee() {
    }

    public Employee(String name, Date dateOfBirth, String department, String designation, double salary) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee Details:\n" +
               "Name: " + name + "\n" +
               "DOB: " + dateOfBirth + "\n" +
               "Department: " + department + "\n" +
               "Designation: " + designation + "\n" +
               "Salary: " + salary;
    }
}

public class EmployeeSerializationDemo {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", new Date(), "IT", "Software Engineer", 75000.0);

        String fileName = "data";
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName))) {
            out.writeObject(emp);
            System.out.println("Object has been serialized and saved to file: " + fileName);
        } catch (IOException e) {
            System.err.println("Serialization Error: " + e.getMessage());
        }

        System.out.println("--------------------------------------------");
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName))) {
            Employee deserializedEmp = (Employee) in.readObject();
            System.out.println("Object successfully deserialized from file.");
            System.out.println(deserializedEmp);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Deserialization Error: " + e.getMessage());
        }
    }
}