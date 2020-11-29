package learning.patterns.behavioral.observer.email_log_notifier;

import java.io.File;

public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("email to "+ email + ":  someone has performed "+ eventType);
    }
}
