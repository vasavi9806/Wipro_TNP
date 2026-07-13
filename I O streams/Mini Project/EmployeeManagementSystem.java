import java.io.*;
import java.util.Scanner;
class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String name;
    private int age;
    private double salary;

    public Employee(int id, String name, int age, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + salary;
    }
}
public class EmployeeManagementSystem {
    private static final String FILE_NAME = "employees.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Main Menu");
            System.out.println("1. Add an Employee");
            System.out.println("2. Display All");
            System.out.println("3. Exit");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    addEmployee(scanner);
                    break;
                case 2:
                    displayAllEmployees();
                    break;
                case 3:
                    System.out.println("Exiting the System");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        } while (choice != 3);

        scanner.close();
    }
    private static void addEmployee(Scanner scanner) {
        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Employee Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Employee Salary: ");
        double salary = scanner.nextDouble();

        Employee emp = new Employee(id, name, age, salary);

        File file = new File(FILE_NAME);
        boolean append = file.exists();
        try (FileOutputStream fos = new FileOutputStream(file, true);
             ObjectOutputStream oos = append ? new AppendableObjectOutputStream(fos) : new ObjectOutputStream(fos)) {
            
            oos.writeObject(emp);
        } catch (IOException e) {
            System.out.println("Error saving employee: " + e.getMessage());
        }
    }
    private static void displayAllEmployees() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            System.out.println("---- Report -----");
            System.out.println("---- End of Report -----");
            return;
        }

        System.out.println("---- Report -----");
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            while (true) {
                Employee emp = (Employee) ois.readObject();
                System.out.println(emp);
            }
        } catch (EOFException e) {
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading report: " + e.getMessage());
        }
        System.out.println("---- End of Report -----");
    }
}
class AppendableObjectOutputStream extends ObjectOutputStream {
    public AppendableObjectOutputStream(OutputStream out) throws IOException {
        super(out);
    }

    @Override
    protected void writeStreamHeader() throws IOException {
        reset();
    }
}