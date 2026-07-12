public class Test {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide an integer as a command line argument.");
            System.out.println("Example: java Test 20");
            return;
        }
        try {
            int number = Integer.parseInt(args[0]);
            System.out.println("Given Number :" + number);
            System.out.println("Binary equivalent :" + Integer.toBinaryString(number));
            System.out.println("Octal equivalent :" + Integer.toOctalString(number));
            System.out.println("Hexadecimal equivalent :" + Integer.toHexString(number));
            
        } catch (NumberFormatException e) {
            System.out.println("Error: The provided argument '" + args[0] + "' is not a valid integer.");
        }
    }
}