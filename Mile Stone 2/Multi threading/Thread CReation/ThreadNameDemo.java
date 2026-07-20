public class ThreadNameDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            System.out.println("Running thread: " + Thread.currentThread().getName());
        });
        Thread thread2 = new Thread(() -> {
            System.out.println("Running thread: " + Thread.currentThread().getName());
        });
        thread1.setName("Scooby");
        thread2.setName("Shaggy");
        thread1.start();
        thread2.start();
        System.out.println("Thread 1 Name: " + thread1.getName());
        System.out.println("Thread 2 Name: " + thread2.getName());
    }
}