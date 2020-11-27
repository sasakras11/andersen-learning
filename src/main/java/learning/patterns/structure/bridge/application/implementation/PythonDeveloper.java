package learning.patterns.structure.bridge.application.implementation;

public class PythonDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Python developer writes python code");
    }
}
