package learning.patterns.behavioral.observer.email_log_notifier;

import java.io.File;

public class LogOpenListener implements EventListener{

    private File log;


    public LogOpenListener(String log) {
        this.log = new File(log);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("save to log " + log + ": someone performed "+ eventType);
    }
}
