// Calculator.java
public class Calculator {
    public static int powerInt(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }
    public static double powerDouble(double num1, int num2) {
        return Math.pow(num1, num2);
    }
    public static void main(String[] args) {
        int resultInt = Calculator.powerInt(2, 5);
        System.out.println("2 power 5 (Integer): " + resultInt);
        double resultDouble = Calculator.powerDouble(3.5, 3);
        System.out.println("3.5 power 3 (Double): " + resultDouble);
    }
}