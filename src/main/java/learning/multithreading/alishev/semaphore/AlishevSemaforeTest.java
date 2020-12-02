package learning.multithreading.alishev.semaphore;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class AlishevSemaforeTest {
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1000);
        Connection connection = Connection.getInstance();
        for (int i = 0; i < 200; i++) {
            executorService.submit(new Runnable() {
                @Override
                public void run() {
                    try {
                        connection.work();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });

        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.DAYS);

    }
}

class Connection {

    private int connectionsCount;
    private static Connection connection;
    private Semaphore semaphore = new Semaphore(10);

    private Connection() {
    }


    public static Connection getInstance() {
        if (connection == null) {
            connection = new Connection();
        }
        return connection;
    }

    public void work() throws InterruptedException {

        semaphore.acquire();
        try {
            doWork();

        } catch (Exception e) {
        } finally {
            semaphore.release();

        }
    }

    private void doWork() throws InterruptedException {
        synchronized (this) {
            connectionsCount++;
            System.out.println(connectionsCount);
        }
        Thread.sleep(2000);

        synchronized (this) {
            connectionsCount--;
        }
    }
}
