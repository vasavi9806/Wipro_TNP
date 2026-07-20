public class EvenOddJoinDemo {
    public static void main(String[] args) {
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 20; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        });
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 20; i += 2) {
                System.out.print(i + " ");
            }
            System.out.println();
        });
        evenThread.start();

        try {
            evenThread.join();
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        oddThread.start();
    }
}