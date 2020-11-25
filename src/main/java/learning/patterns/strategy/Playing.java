package learning.patterns.strategy;

public class Playing implements Action {
    @Override
    public void doAction() {
        System.out.println("i am playing with my cat");
    }
}
