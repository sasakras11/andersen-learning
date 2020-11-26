package learning.patterns.creators.factory_method.impl;

import learning.patterns.creators.factory_method.Worker;

public class Recruiter implements Worker {
    @Override
    public void doWork() {
        System.out.println("hello i am recruiter, do you want some workers? i can help you");
    }
}
