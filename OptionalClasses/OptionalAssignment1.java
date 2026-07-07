import java.util.Optional;

public class OptionalAssignment1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        
        // Wrap the potentially null element in an Optional container
        Optional<String> checkNull = Optional.ofNullable(names[0]);
        
        // Check if a value is present before calling .length()
        if (checkNull.isPresent()) {
            System.out.print(names[0].length());
        } else {
            System.out.println("Value is not present.");
        }
    }
}