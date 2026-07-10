import java.util.*;

public class StudentAverage {

    public static void validate(int mark) throws NegativeMarksException, OutOfRangeException {
        if (mark < 0)
            throw new NegativeMarksException("Negative marks are not allowed");
        if (mark > 100)
            throw new OutOfRangeException("Marks should be between 0 and 100");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 1; i <= 2; i++) {

                System.out.print("Enter Student Name: ");
                String name = sc.next();

                int total = 0;

                System.out.println("Enter 3 Subject Marks:");

                for (int j = 1; j <= 3; j++) {

                    int mark = Integer.parseInt(sc.next());

                    validate(mark);

                    total += mark;
                }

                double avg = total / 3.0;

                System.out.println("Student : " + name);
                System.out.println("Average : " + avg);
            }

        } catch (NumberFormatException e) {
            System.out.println("Only integer values are allowed.");
        } catch (NegativeMarksException | OutOfRangeException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}