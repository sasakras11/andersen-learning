package learning.patterns.behavioral.state;

public class Drinking implements CurrentState{
    @Override
    public void doAction() {
        System.out.println("i am drinking tea...");
    }
}
