package learning.patterns.structure.bridge.application.abstraction;

import learning.patterns.structure.bridge.application.implementation.Developer;

public abstract class Application {

    Developer developer;

    public Application(Developer developer) {
        this.developer = developer;
    }

    public abstract void developApp();
}
