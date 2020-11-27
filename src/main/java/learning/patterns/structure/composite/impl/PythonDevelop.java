package learning.patterns.structure.composite.impl;

import learning.patterns.structure.composite.Developer;

public class PythonDevelop implements Developer {
    @Override
    public void doWork() {
        System.out.println("python developer working");
    }
}
