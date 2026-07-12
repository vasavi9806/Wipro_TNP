class Employee implements Cloneable {
    int id;
    String name;
    String department;
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + department);
    }
}
public class CloneTest {
    public static void main(String[] args) {
        try {
            Employee original = new Employee(101, "Alice", "Engineering");
            System.out.println("--- Before Modification ---");
            System.out.print("Original: ");
            original.displayDetails();
            Employee cloned = (Employee) original.clone();
            System.out.print("Cloned:   ");
            cloned.displayDetails();
            original.id = 102;
            original.name = "Bob";
            original.department = "Marketing";
            System.out.println("\n--- After Modifying Original Object ---");
            System.out.print("Original: ");
            original.displayDetails();
            System.out.print("Cloned:   ");
            cloned.displayDetails();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}