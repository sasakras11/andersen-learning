package learning.multithreading.alishev.thread_pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2); // here threads will be working like pairs.

        for (int i = 0; i <5 ; i++)
            executorService.submit(new Work(i));    //


            executorService.shutdown(); //  we starting creating new threads and running them
        System.out.println("All tasks submitted");

        executorService.awaitTermination(1, TimeUnit.DAYS); // here main stops and when started threads end work
                                                      // it continious


    }
}

class Work implements Runnable{

    private final int id;

    public Work(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("work "+ id + " was completed");
    }
}
