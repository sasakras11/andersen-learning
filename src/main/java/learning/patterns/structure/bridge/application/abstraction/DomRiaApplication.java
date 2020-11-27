package learning.patterns.structure.bridge.application.abstraction;

import learning.patterns.structure.bridge.application.implementation.Developer;

public class DomRiaApplication extends Application{

    public DomRiaApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("dom ria application is developing....");
        developer.writeCode();
    }
}
