package task2;

public class Buzz extends Thread implements MyProducer {
    int n;
    boolean updated = false;
    boolean stop = false;

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
    public void run()  {
        while (n<16) {
            try {
                if (updated) {
                    updated = false;
                    if (n % 5 == 0 && n % 3 != 0) {
                        System.out.println("Buzz");
                    }
                }
                Thread.sleep(100);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
