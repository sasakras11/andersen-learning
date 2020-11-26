package learning.patterns.creators.strategy;

public class Teenager {
    private Action action;

    public Teenager(Action action) {
        this.action = action;
    }

    public void changeAction(Action action){
        this.action = action;
    }
    public void doAction(){
        action.doAction();

    }
}
