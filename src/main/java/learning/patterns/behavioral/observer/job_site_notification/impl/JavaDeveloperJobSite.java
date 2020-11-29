package learning.patterns.behavioral.observer.job_site_notification.impl;

import learning.patterns.behavioral.observer.job_site_notification.Observed;
import learning.patterns.behavioral.observer.job_site_notification.Observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDeveloperJobSite implements Observed {
    List<String> vacancies = new ArrayList<>();

    List<Observer> subscribers = new ArrayList<>();


    public void addVacancy(String vacancy){
        this.vacancies.add(vacancy);
        notifyObservers();
    }

    public void removeVacancy(String vacancy){
        this.vacancies.remove(vacancy);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
      this.subscribers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
              this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: subscribers
             ) {
            observer.handleEvent(this.vacancies);
        }
    }
}
