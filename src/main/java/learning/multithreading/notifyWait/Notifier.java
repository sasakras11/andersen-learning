package learning.multithreading.notifyWait;

public class Notifier implements Runnable{
    private Message msg;

    public Notifier(Message msg) {
        this.msg = msg;
    }


    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        System.out.println(name + " started");
        try{
            Thread.sleep(1000);
            synchronized (msg){
                msg.setMsg(name + " thread notifier done work");
                msg.notify();
            }
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
