package learning.patterns.strategy;

public class Talking implements Action{

    @Override
    public void doAction() {
        System.out.println("i am talking to my friend");
    }
}
