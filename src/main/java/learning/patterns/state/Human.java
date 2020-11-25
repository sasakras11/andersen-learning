package learning.patterns.state;

public class Human {
    private CurrentState state;

    public Human(CurrentState state) {
        this.state = state;
    }

    public void nextState() {
        if (state instanceof Sleeping) state = new Training();
        else if (state instanceof Training) state = new Drinking();
        else if (state instanceof Drinking) state = new Eating();
        else if (state instanceof Eating) state = new Sleeping();
    }

    public void doAction(){
        state.doAction();
    }
}
