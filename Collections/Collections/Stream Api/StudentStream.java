import java.util.ArrayList;

class Student {

    int rollNo;
    String name;
    int mark;

    Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return rollNo + " " + name + " " + mark;
    }
}

public class StudentStream {

    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

        list.add(new Student(1, "Cherry", 75));
        list.add(new Student(2, "Rahul", 42));
        list.add(new Student(3, "Priya", 90));
        list.add(new Student(4, "Kiran", 60));
        list.add(new Student(5, "Anitha", 35));

        long count = list.stream()
                .filter(s -> s.mark >= 50)
                .count();

        System.out.println("Students Passed:");

        list.stream()
                .filter(s -> s.mark >= 50)
                .forEach(System.out::println);

        System.out.println("\nPass Count = " + count);
    }
}