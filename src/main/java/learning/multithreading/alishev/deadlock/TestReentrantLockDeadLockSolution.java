package learning.multithreading.alishev.deadlock;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestReentrantLockDeadLockSolution {
    public static void main(String[] args) throws InterruptedException {

        Runner runner = new Runner();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.firstThreadInvoke();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                runner.secondThreadInvoke();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        // when 1 and 2 thriends will done work finished() will called
        runner.finished();
    }
}

class Runner {

    private Account account1 = new Account();
    private Account account2 = new Account();


    private Lock lock1 = new ReentrantLock();
    private Lock lock2 = new ReentrantLock();


    private void takeLocks(Lock lock1, Lock lock2){
        boolean firstLockTaken = false;
        boolean secondLockTaken = false;

        while(true){
        try {
            firstLockTaken = lock1.tryLock();
            secondLockTaken = lock2.tryLock();
        }finally {
            if (firstLockTaken && secondLockTaken) {
                return;
            }

            if (firstLockTaken) {
                lock1.unlock();
            }
            if (secondLockTaken) {
                lock2.unlock();
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
}

    }
    public void firstThreadInvoke() {
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {

           takeLocks(lock1,lock2);
           try {
               Account.transfer(account1, account2, random.nextInt(100));

        }finally {
            lock2.unlock();
            lock1.unlock();
        }


        }
    }

    public void secondThreadInvoke() {
        Random random = new Random();
        for (int i = 0; i < 10_000; i++) {
            takeLocks(lock2,lock1);

            try {
                Account.transfer(account2, account1, random.nextInt(100));
            }finally {
                lock2.unlock();
                lock1.unlock();
            }




        }
    }

    public void finished() {
        System.out.println(account1.getBalance());
        System.out.println(account2.getBalance());
        System.out.println("total balance " + (account1.getBalance() + account2.getBalance()));
    }
}


class Account {
    private int balance = 10_000;

    /**
     * @param amount to add money to @balance
     */
    public void deposit(int amount) {
        balance += amount;
    }

    public void widDraw(int amount) {
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }


    public static void transfer(Account ac1, Account ac2, int amount) {
        ac1.widDraw(amount);
        ac2.deposit(amount);
    }
}
