package task1;

import java.util.concurrent.*;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();

        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);
        executor.scheduleAtFixedRate(consumer, 5, 5, TimeUnit.SECONDS);
        executor.scheduleAtFixedRate(producer, 1, 1, TimeUnit.SECONDS);

        Thread.sleep(20000);
        executor.shutdown();
    }
}
