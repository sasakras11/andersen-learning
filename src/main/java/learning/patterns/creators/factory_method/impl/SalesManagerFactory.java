package learning.patterns.creators.factory_method.impl;

import learning.patterns.creators.factory_method.Worker;
import learning.patterns.creators.factory_method.WorkerFactory;

public class SalesManagerFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new SalesManager();
    }

}
