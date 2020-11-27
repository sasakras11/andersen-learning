package learning.patterns.structure.composite.impl;

import learning.patterns.structure.composite.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void doWork() {
        System.out.println("php dev is working");
    }
}
