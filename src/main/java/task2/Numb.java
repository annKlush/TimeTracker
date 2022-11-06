package task2;

public class Numb extends Thread implements MyProducer {
    int n;
    boolean updated = false;
    boolean stop = false;

    @Override
    public void setN(int n) {
        this.n = n;
        updated = true;
    }

    @Override
    public void inter(boolean bool) {
        this.stop = bool;
    }

    @Override
    public boolean isUpdated() {
        return updated;
    }

    @Override
    public synchronized void run() {

        while (!stop) {
            try {
                if (updated) {
                    updated = false;
                    if (n % 3 != 0 && n % 5 != 0) {
                        System.out.println(n);
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
