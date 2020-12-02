package learning.multithreading.alishev.semaphore;

import java.util.concurrent.Semaphore;

public class MultithreadingTest {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(2);
        new Philosopher(semaphore,"Pifahor").start();
        new Philosopher(semaphore,"Aristotel").start();
         new Philosopher(semaphore,"Pierre").start();
         new Philosopher(semaphore,"Jak").start();
         new Philosopher(semaphore,"Pontiak").start();


    }
}
