package learning.multithreading.alishev.semaphore;

import java.util.concurrent.Semaphore;

public class Philosopher extends Thread {

    private Semaphore semaphore;
    private String name;
    private boolean haveEaten = false;


    public Philosopher(Semaphore semaphore, String name) {
        this.semaphore = semaphore;
        this.name = name;
    }

    @Override
    public void run() {
        if (!haveEaten) {

            try {
                semaphore.acquire();
                System.out.println(name + " start eating noodles");
                Thread.sleep(1000);
                System.out.println(name + " end eating and started thinking");
                semaphore.release();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
