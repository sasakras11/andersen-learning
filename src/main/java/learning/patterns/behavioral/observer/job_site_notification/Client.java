package learning.patterns.behavioral.observer.job_site_notification;

import learning.patterns.behavioral.observer.job_site_notification.impl.JavaDeveloperJobSite;
import learning.patterns.behavioral.observer.job_site_notification.impl.Subscriber;

public class Client {

    public static void main(String[] args) {
        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();
         jobSite.addVacancy("first java position");
         jobSite.addVacancy(" senior psition");

         Observer firstSubscriber = new Subscriber("Alex Krasiuk");
        Subscriber secondSub = new Subscriber("Ivan Liyag");

        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSub);

        jobSite.addVacancy("third java pos");


    }
}
