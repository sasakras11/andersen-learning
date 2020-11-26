package learning.patterns.creators.state;

public class Training implements CurrentState{
    @Override
    public void doAction() {
        System.out.println("I am training");
    }
}
