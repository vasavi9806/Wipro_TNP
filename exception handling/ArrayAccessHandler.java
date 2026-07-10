import java.util.Scanner;

public class ArrayAccessHandler {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(String.in);

        try {
           
            System.out.println("Enter the number of elements in the array");
            String sizeInput = scanner.nextLine();
            int size = Integer.parseInt(sizeInput);

            int[] array = new int[size];
            System.out.println("Enter the elements in the array");
            for (int i = 0; i < size; i++) {
                String elementInput = scanner.nextLine();
                array[i] = Integer.parseInt(elementInput);
            }

            System.out.println("Enter the index of the array element you want to access");
            String indexInput = scanner.nextLine();
            int index = Integer.parseInt(indexInput);

            System.out.println("The array element at index " + index + " = " + array[index]);
            System.out.println("The array element successfully accessed");

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("java.lang.ArrayIndexOutOfBoundsException");
            
        } catch (NumberFormatException e) {
            System.out.println("java.lang.NumberFormatException");
            
        } finally {
            scanner.close();
        }
    }
}