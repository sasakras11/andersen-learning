package learning.patterns.behavioral.state;

public class TestStatePattern {

    public static void main(String[] args) {

        Human human = new Human(new Sleeping());
        for (int i = 0; i <10 ; i++) {
            human.doAction();
            human.nextState();
        }
    }
}
