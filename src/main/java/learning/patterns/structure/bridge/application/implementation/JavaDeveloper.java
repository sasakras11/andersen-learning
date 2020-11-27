package learning.patterns.structure.bridge.application.implementation;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writing java code");
    }
}
