package learning.patterns.creators.factory_method.impl;

import learning.patterns.creators.factory_method.Worker;

public class Programmer implements Worker {
    @Override
    public void doWork() {
        System.out.println("i am programmer, do you need some app to be written?");
    }
}
