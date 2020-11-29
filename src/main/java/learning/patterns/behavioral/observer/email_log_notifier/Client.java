package learning.patterns.behavioral.observer.email_log_notifier;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open",new LogOpenListener("src/main/java/learning/patterns/behavioral/observer/refactoring_guru_example/event_package"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
