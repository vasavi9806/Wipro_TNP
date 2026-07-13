import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name");
        String fileName = scanner.nextLine();
        System.out.println("Enter the character to be counted");
        char targetChar = scanner.next().charAt(0);
        char targetLower = Character.toLowerCase(targetChar);

        int count = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = reader.read()) != -1) {
                if (Character.toLowerCase((char) ch) == targetLower) {
                    count++;
                }
            }
            System.out.println("File '" + fileName + "' has " + count + " instances of letter '" + targetChar + "'.");

        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}