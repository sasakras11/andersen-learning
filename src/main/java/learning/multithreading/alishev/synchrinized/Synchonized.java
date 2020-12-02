package learning.multithreading.alishev.synchrinized;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Synchonized {


    public static void main(String[] args) throws InterruptedException {

        new Worker().main();
    }

}



class Worker{

    Object lock1 = new Object();
    Object lock2 = new Object();

    Random random = new Random();

    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    public void addToList1() {
        synchronized (lock1){
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list1.add(random.nextInt(100));
        }}


    public void addToList2() {
        synchronized (lock2) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            list2.add(random.nextInt(100));
        }
    }



    public void work(){
        for (int i = 0; i < 1000; i++) {
            addToList1();
            addToList2();
        }
    }
    public void main(){
        long before = System.currentTimeMillis();
    Thread thread = new Thread(new Runnable() {
        @Override
        public void run() {
            work();
        }
    });
    Thread thread1 = new Thread(new Runnable() {
        @Override
        public void run() {
            work();
        }
    });
    thread1.start();
    thread.start();

        try {
            thread.join();
            thread1.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long after = System.currentTimeMillis();
        System.out.println(after-before);


        System.out.println(list1.size());
        System.out.println(list2.size());
    }

}
