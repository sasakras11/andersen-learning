package learning.patterns.behavioral.observer.job_site_notification;

public interface Observed {

    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
