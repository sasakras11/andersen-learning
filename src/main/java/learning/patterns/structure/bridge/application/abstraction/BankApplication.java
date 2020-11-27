package learning.patterns.structure.bridge.application.abstraction;

import learning.patterns.structure.bridge.application.implementation.Developer;

public class BankApplication extends Application {


    public BankApplication(Developer developer) {
        super(developer);
    }

    @Override
    public void developApp() {
        System.out.println("bank app is creating");
        developer.writeCode();
    }
}
