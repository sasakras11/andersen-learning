package learning.patterns.structure.decorator.developer.impl;

import learning.patterns.structure.decorator.developer.Developer;

public class JavaDeveloperDecorator implements Developer {

    private final Developer developer;

    public JavaDeveloperDecorator(Developer developer) {
        this.developer = developer;
    }

    @Override
    public String doTask() {
       return developer.doTask();
    }
}
