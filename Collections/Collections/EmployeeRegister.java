import java.util.*;

class Employee implements Comparable<Employee> {

    private String firstName;
    private String lastName;
    private String mobile;
    private String email;
    private String address;

    Employee(String firstName, String lastName,
             String mobile, String email, String address) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.mobile = mobile;
        this.email = email;
        this.address = address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMobile() {
        return mobile;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public int compareTo(Employee e) {
        return this.firstName.compareToIgnoreCase(e.firstName);
    }
}

public class EmployeeRegister {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Employee> list = new ArrayList<>();

        System.out.println("Enter the Number of Employees");

        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {

            System.out.println("\nEnter Employee " + i + " Details:");

            System.out.println("Enter the Firstname");
            String first = sc.nextLine();

            System.out.println("Enter the Lastname");
            String last = sc.nextLine();

            System.out.println("Enter the Mobile");
            String mobile = sc.nextLine();

            System.out.println("Enter the Email");
            String email = sc.nextLine();

            System.out.println("Enter the Address");
            String address = sc.nextLine();

            list.add(new Employee(first, last, mobile, email, address));
        }

        Collections.sort(list);

        System.out.println("\nEmployee List\n");

        System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                "FirstName", "LastName", "Mobile", "Email", "Address");

        for (Employee e : list) {

            System.out.printf("%-15s %-15s %-15s %-30s %-15s%n",
                    e.getFirstName(),
                    e.getLastName(),
                    e.getMobile(),
                    e.getEmail(),
                    e.getAddress());
        }

        sc.close();
    }
}