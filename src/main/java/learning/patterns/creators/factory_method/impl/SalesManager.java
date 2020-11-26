package learning.patterns.creators.factory_method.impl;

import learning.patterns.creators.factory_method.Worker;

public class SalesManager implements Worker {


    @Override
    public void doWork() {
        System.out.println("i am sales manager. do you want to buy something?");
    }
}
