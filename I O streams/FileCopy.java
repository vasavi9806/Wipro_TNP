import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the input file name");
        String inputFile = scanner.nextLine();
        System.out.println("Enter the output file name");
        String outputFile = scanner.nextLine();
        try (FileInputStream in = new FileInputStream(inputFile);
             FileOutputStream out = new FileOutputStream(outputFile)) {
            
            int byteData;
            while ((byteData = in.read()) != -1) {
                out.write(byteData);
            }
            System.out.println("File is copied.");

        } catch (IOException e) {
            System.err.println("An error occurred during file copying: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}