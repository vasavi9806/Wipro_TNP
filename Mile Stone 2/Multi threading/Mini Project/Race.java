class RaceRunner implements Runnable {
    private static boolean winnerFound = false;

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();

        for (int meters = 1; meters <= 100; meters++) {
            if (winnerFound) {
                break;
            }

            System.out.println(threadName + " ran " + meters + " meters.");
            if (threadName.equalsIgnoreCase("Hare") && meters == 60) {
                try {
                    System.out.println("\n--- Hare is taking a nap at 60 meters... ---\n");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("Hare was interrupted during sleep.");
                }
            }
            if (meters == 100 && !winnerFound) {
                winnerFound = true;
                System.out.println("\n==========================================");
                System.out.println("  " + threadName.toUpperCase() + " WINS THE RACE!");
                System.out.println("==========================================\n");
            }
        }
    }
}

public class Race {
    public static void main(String[] args) {
        RaceRunner raceTask = new RaceRunner();
        Thread hare = new Thread(raceTask, "Hare");
        Thread tortoise = new Thread(raceTask, "Tortoise");
        hare.setPriority(Thread.MAX_PRIORITY);  // Priority 10
        tortoise.setPriority(Thread.MIN_PRIORITY); // Priority 1

        System.out.println("--- Race Started ---\n");
        hare.start();
        tortoise.start();
    }
}