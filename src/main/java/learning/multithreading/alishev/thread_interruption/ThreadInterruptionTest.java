package learning.multithreading.alishev.thread_interruption;

import java.util.Random;

public class ThreadInterruptionTest {
    public static void main(String[] args) throws InterruptedException {

        Thread thr = new Thread(new Runnable() {
            @Override
            public void run() {
                Random random = new Random();
                for (int i = 0; i < 1_000_000_000; i++) {
                    if(Thread.currentThread().isInterrupted()){
                        System.out.println("method was interrpted");
                        break;

                    }

                    else Math.sin(random.nextDouble());
                }
            }
        });
        System.out.println("starting thread");

        thr.start();
        Thread.sleep(1000);
        thr.interrupt();
        thr.join();

        System.out.println("thread finished");

    }
}
