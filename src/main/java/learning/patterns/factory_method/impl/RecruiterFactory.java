package learning.patterns.factory_method.impl;

import learning.patterns.factory_method.Worker;
import learning.patterns.factory_method.WorkerFactory;

public class RecruiterFactory implements WorkerFactory {
    @Override
    public Worker createWorker() {
        return new Recruiter();
    }
}
