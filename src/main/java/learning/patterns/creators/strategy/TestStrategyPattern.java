package learning.patterns.creators.strategy;

public class TestStrategyPattern {
    public static void main(String[] args) {
        Teenager teenager = new Teenager(new Playing());
        teenager.doAction();
        teenager.changeAction(new Sleeping());
        teenager.doAction();
        teenager.changeAction(new Talking());
        teenager.doAction();
        teenager.changeAction(new Programming());
        teenager.doAction();
    }
}
