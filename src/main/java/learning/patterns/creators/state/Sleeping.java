package learning.patterns.creators.state;

public class Sleeping implements CurrentState{
    @Override
    public void doAction() {
        System.out.println(" i am sleeping");
    }
}
