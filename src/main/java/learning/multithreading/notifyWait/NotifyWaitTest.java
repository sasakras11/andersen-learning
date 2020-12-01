package learning.multithreading.notifyWait;

public class NotifyWaitTest {
    public static void main(String[] args) {
        Message message = new Message("отработать");
        Waiter waiter = new Waiter(message);
        new Thread(waiter,"waiter").start();

        Waiter waiter1 = new Waiter(message);
        new Thread(waiter1, "waiter1").start();

        Notifier notifier = new Notifier(message);
        new Thread(notifier,"waiter1").start();
        System.out.println("all threads started");
    }
}
