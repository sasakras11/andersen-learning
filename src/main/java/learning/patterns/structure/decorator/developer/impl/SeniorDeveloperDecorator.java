package learning.patterns.structure.decorator.developer.impl;

import learning.patterns.structure.decorator.developer.Developer;

public class SeniorDeveloperDecorator extends JavaDeveloperDecorator{


    public SeniorDeveloperDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public String doTask() {
      return super.doTask()+doSeniorWork();
    }
    private String doSeniorWork(){
        return ", reviewing code";
    }
}
