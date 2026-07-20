public class ThreadPriorityDemo implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        int priority = Thread.currentThread().getPriority();
        for (int i = 1; i <= 3; i++) {
            System.out.println(threadName + " (Priority: " + priority + ") is executing loop " + i);
            Thread.yield(); 
        }
        System.out.println(">> " + threadName + " COMPLETED <<");
    }

    public static void main(String[] args) {
        ThreadPriorityDemo target = new ThreadPriorityDemo();

        Thread t1 = new Thread(target, "Max-Priority-Thread");
        Thread t2 = new Thread(target, "Min-Priority-Thread");
        Thread t3 = new Thread(target, "Norm-Priority-Thread");

        t1.setPriority(Thread.MAX_PRIORITY);  // 10
        t2.setPriority(Thread.MIN_PRIORITY);  // 1
        t3.setPriority(Thread.NORM_PRIORITY); // 5

        t1.start();
        t2.start();
        t3.start();
    }
}