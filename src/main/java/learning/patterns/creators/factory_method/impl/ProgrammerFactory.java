package learning.patterns.creators.factory_method.impl;

import learning.patterns.creators.factory_method.Worker;
import learning.patterns.creators.factory_method.WorkerFactory;

public class ProgrammerFactory implements WorkerFactory {

    @Override
    public Worker createWorker() {
        return new Programmer();
    }
}
