@FunctionalInterface
interface Factorial {
    int calculate(int n);
}

class MathOperations {

    public int factorial(int n) {

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact;
    }
}

public class FactorialMethodReference {

    public static void main(String[] args) {

        MathOperations obj = new MathOperations();

        Factorial f = obj::factorial;

        int result = f.calculate(5);

        System.out.println("Factorial = " + result);

    }
}