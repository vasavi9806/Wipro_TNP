import java.util.Vector;

class Employee {

    int empId;
    String empName;
    String email;
    String gender;
    float salary;

    Employee(int empId, String empName, String email,
             String gender, float salary) {

        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    void getEmployeeDetails() {

        System.out.println("--------------------------");
        System.out.println("Employee ID : " + empId);
        System.out.println("Employee Name : " + empName);
        System.out.println("Email : " + email);
        System.out.println("Gender : " + gender);
        System.out.println("Salary : " + salary);
    }
}

class EmployeeDB {

    Vector<Employee> list = new Vector<>();

    boolean addEmployee(Employee e) {
        return list.add(e);
    }

    boolean deleteEmployee(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {
                list.remove(e);
                return true;
            }
        }

        return false;
    }

    String showPaySlip(int empId) {

        for (Employee e : list) {

            if (e.empId == empId) {

                return "Pay Slip\nEmployee ID : " + e.empId
                        + "\nEmployee Name : " + e.empName
                        + "\nSalary : " + e.salary;
            }
        }

        return "Employee Not Found";
    }

    void displayEmployees() {

        for (Employee e : list) {
            e.getEmployeeDetails();
        }
    }
}

public class EmployeeVector {

    public static void main(String[] args) {

        EmployeeDB db = new EmployeeDB();

        db.addEmployee(new Employee(
                101,
                "Cherry",
                "cherry@gmail.com",
                "Male",
                50000));

        db.addEmployee(new Employee(
                102,
                "Rahul",
                "rahul@gmail.com",
                "Male",
                60000));

        System.out.println("Employee Details");

        db.displayEmployees();

        System.out.println();

        System.out.println(db.showPaySlip(101));

        System.out.println();

        db.deleteEmployee(102);

        System.out.println("After Deletion");

        db.displayEmployees();
    }
}