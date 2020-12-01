package learning.multithreading.synchrinized;

public class Synchonized {
    private int counter;

    public synchronized  void increment(){
        counter++;
    }

    public static void main(String[] args) throws InterruptedException {
              new Synchonized().doWork();
    }

    public void doWork() throws InterruptedException {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();

            }
        });
        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                increment();

            }
        });
       thread1.start();
       thread2.start();

       thread1.join();
       thread2.join();
       System.out.println(counter);
    }


}
