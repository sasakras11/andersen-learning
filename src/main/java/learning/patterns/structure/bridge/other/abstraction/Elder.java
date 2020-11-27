package learning.patterns.structure.bridge.other.abstraction;

public class Elder implements Audience{
    @Override
    public void giveMark() {
        System.out.println("elders like this!");
    }
}
