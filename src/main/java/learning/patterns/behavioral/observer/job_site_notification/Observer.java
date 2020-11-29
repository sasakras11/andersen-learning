package learning.patterns.behavioral.observer.job_site_notification;

import java.util.List;

public interface Observer {

    void handleEvent(List<String> vacancies);
}
