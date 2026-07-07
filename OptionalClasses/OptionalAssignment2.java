import java.util.Optional;

public class OptionalAssignment2 {
    public static void printAddress(String address) {
        // Fall back to "India" if address is null
        String finalAddress = Optional.ofNullable(address).orElse("India");
        System.out.println(finalAddress);
    }

    public static void main(String[] args) {
        printAddress("123 Baker Street"); // Output: 123 Baker Street
        printAddress(null);               // Output: India
    }
}