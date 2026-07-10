package live;

// Define the functional interface
interface TestInterface {
    int myFunction(int a, int b, int c);
}

public class Test {
    public static void main(String[] args) {
        
        // Lambda expression to add three integer parameters
        TestInterface t1 = (a, b, c) -> a + b + c;
        
        // Lambda expression to multiply three integer parameters
        TestInterface t2 = (a, b, c) -> a * b * c;
        
        // Test values
        int x = 5;
        int y = 4;
        int z = 3;
        
        // Call myFunction using t1 and t2 reference variables
        int additionResult = t1.myFunction(x, y, z);
        int multiplicationResult = t2.myFunction(x, y, z);
        
        // Print the results
        System.out.println("--- Testing Lambda Expressions ---");
        System.out.println("Input Values: " + x + ", " + y + ", " + z);
        System.out.println("Result of Addition (t1): " + additionResult);
        System.out.println("Result of Multiplication (t2): " + multiplicationResult);
    }
}