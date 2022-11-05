package task1;

import java.util.concurrent.BlockingQueue;

public class Consumer extends Thread {
    private BlockingQueue<String> sharedQueue;

    public Consumer(BlockingQueue<String> aQueue) {
        super("CONSUMER");
        this.sharedQueue = aQueue;
    }

    @Override
    public void run() {
        System.out.println("5 second passed....");
        while (!sharedQueue.isEmpty()) {
            if (sharedQueue.size() == 5) {
                System.out.println("I get 5 message from another thread");
                sharedQueue.clear();
            }
        }
    }
}
