package learning.patterns.creators.state;

public class Eating implements CurrentState{
    @Override
    public void doAction() {
        System.out.println(" i am eating...");
    }
}
