import java.util.Scanner;

public class VideoLauncher {
    public static void main(String[] args) {
        VideoStore videoStore = new VideoStore();
        Scanner scanner = new Scanner(System.穎n == null ? System.in : System.in); 
        int choice = 0;

        do {
            System.out.println("\nMAIN MENU");
            System.out.println("=========");
            System.out.println("1. Add Videos :");
            System.out.println("2. Check Out Video :");
            System.out.println("3. Return Video :");
            System.out.println("4. Receive Rating :");
            System.out.println("5. List Inventory :");
            System.out.println("6. Exit :");
            System.out.print("Enter your choice (1..6) : ");
            
            if (scanner.hasNextInt()) {
                choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline character
            } else {
                System.out.println("Invalid input. Please enter a number between 1 and 6.");
                scanner.nextLine(); // Clear the invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the video you want to add : ");
                    String addName = scanner.nextLine();
                    videoStore.addVideo(addName);
                    break;
                case 2:
                    System.out.print("Enter the name of the video you want to check out : ");
                    String checkoutName = scanner.nextLine();
                    videoStore.doCheckout(checkoutName);
                    break;
                case 3:
                    System.out.print("Enter the name of the video you want to Return : ");
                    String returnName = scanner.nextLine();
                    videoStore.doReturn(returnName);
                    break;
                case 4:
                    System.out.print("Enter the name of the video you want to Rate : ");
                    String rateName = scanner.nextLine();
                    System.out.print("Enter the rating for this video : ");
                    int rating = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    videoStore.receiveRating(rateName, rating);
                    break;
                case 5:
                    videoStore.listInventory();
                    break;
                case 6:
                    System.out.println("Exiting...!! Thanks for using the application.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a number between 1 and 6.");
            }
        } while (choice != 6);

        scanner.close();
    }
}