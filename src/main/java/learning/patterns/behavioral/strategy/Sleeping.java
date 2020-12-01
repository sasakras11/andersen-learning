package learning.patterns.behavioral.strategy;

public class Sleeping implements Action{

    @Override
    public void doAction() {
        System.out.println("i am sleeping");
    }
}
