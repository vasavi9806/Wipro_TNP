package Multi threading;

public import java.util.Random;

public class ColorDisplayRunnable implements Runnable {
    private final String[] colors = {"white", "blue", "black", "green", "red", "yellow"};
    private final Random random = new Random();

    @Override
    public void run() {
        while (true) {
            int index = random.nextInt(colors.length);
            String selectedColor = colors[index];
            System.out.println("Selected Color: " + selectedColor);
            if ("red".equalsIgnoreCase(selectedColor)) {
                System.out.println("Matched 'red'. Stopping thread execution.");
                break;
            }
            try {
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }

    public static void main(String[] args) {
        ColorDisplayRunnable runnable = new ColorDisplayRunnable();
        Thread colorThread = new Thread(runnable);
        colorThread.start();
    }
} 