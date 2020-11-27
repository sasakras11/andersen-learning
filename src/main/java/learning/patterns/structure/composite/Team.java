package learning.patterns.structure.composite;

import java.util.List;

public class Team {
    private final List<Developer> developers;

    public Team(List<Developer> developers) {
        this.developers = developers;
    }

    public void removeDev(Developer dev){
        developers.remove(dev);
    }

    public void add(Developer developer){
        developers.add(developer);
    }

    public void showTeam(){
        for (Developer dev:
            developers ) {
            dev.doWork();
        }
    }
}
