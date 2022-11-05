package task2;

public class Fizz extends Thread implements MyProducer {
    int n;
    boolean updated = false;

    @Override
    public void setN(int n) {
        this.n = n;
        updated = true;
    }

    @Override
    public boolean isUpdated() {
        return updated;
    }


    @Override
    public synchronized void run() {
        while (n < 16) {
            try {
                if (updated) {
                    updated = false;
                    if (n % 3 == 0 && n % 5 != 0) {
                        System.out.println("Fizz");
                        notifyAll();
                    }
                }
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
