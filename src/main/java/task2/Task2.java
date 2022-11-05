package task2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

        MyProducer numb = new Numb();
        MyProducer fizz = new Fizz();
        MyProducer buzz = new Buzz();
        MyProducer fizzbuzz = new FizzBuzz();

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.execute(numb);
        executor.execute(fizz);
        executor.execute(buzz);
        executor.execute(fizzbuzz);

        for (int i = 1; i <= 15; i++) {
            fizz.setN(i);
            numb.setN(i);
            buzz.setN(i);
            fizzbuzz.setN(i);
            while (fizz.isUpdated() || numb.isUpdated() || fizzbuzz.isUpdated() || buzz.isUpdated()) {
                Thread.sleep(200);
            }
        }

        System.out.println("Must be 1, 2, fizz, 4, buzz, fizz, 7, 8, fizz, buzz, 11, fizz, 13, 14, fizzbuzz.");
        Thread.sleep(200);

        System.out.println("Done");
        executor.shutdownNow();
}
    }


