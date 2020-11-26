package learning.patterns.structure.decorator.developer.impl;

import learning.patterns.structure.decorator.developer.Developer;

public class TeamLeadDecorator extends JavaDeveloperDecorator{
    public TeamLeadDecorator(Developer developer) {
        super(developer);
    }

    @Override
    public String doTask() {
        return super.doTask()+doLeadWork();
    }

    public String doLeadWork(){
        return ", cooperating programmers";
    }
}
