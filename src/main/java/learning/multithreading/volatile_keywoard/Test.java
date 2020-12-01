package learning.multithreading.volatile_keywoard;


import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();


         thread.shutDown();
    }
}

class MyThread extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        while(running){
            System.out.println("hi");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void shutDown(){
        this.running = false;
    }
}


