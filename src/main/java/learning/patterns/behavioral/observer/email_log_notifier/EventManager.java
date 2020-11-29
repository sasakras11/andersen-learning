package learning.patterns.behavioral.observer.email_log_notifier;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *    basic Publisher
 */
public class EventManager {

    HashMap<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... operations) {
        for (String op: operations
             ) {
            this.listeners.put(op, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener){
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unSubscribe(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);
            users.remove(eventType);
    }

    public void notify(String eventType, File file){
        List<EventListener> users = listeners.get(eventType);

        for (EventListener listeners: users
             ) {

            listeners.update(eventType,file);
        }
    }
}
