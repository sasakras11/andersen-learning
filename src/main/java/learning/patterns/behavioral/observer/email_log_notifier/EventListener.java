package learning.patterns.behavioral.observer.email_log_notifier;


import java.io.File;

/**
 *  Subscriber Interface
 */
public interface EventListener {

    void update(String eventType, File file);
}
