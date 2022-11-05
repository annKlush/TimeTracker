package task1;

import java.util.concurrent.BlockingQueue;

public class Producer extends Thread {
    private BlockingQueue<String> sharedQueue;
    int currValue;

    public Producer(BlockingQueue<String> aQueue) {
        super("PRODUCER");
        this.sharedQueue = aQueue;
    }

    @Override
    public void run() {
        try {
            sharedQueue.put("note #" + currValue);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        currValue++;
        System.out.println("currValue = " + currValue);
    }
}

