package learning.patterns.creators.factory_method;

import learning.patterns.creators.factory_method.impl.ProgrammerFactory;
import learning.patterns.creators.factory_method.impl.RecruiterFactory;
import learning.patterns.creators.factory_method.impl.SalesManagerFactory;

public class FactoryMethodTest {
    public static void main(String[] args) {

        WorkerFactory workerFactory = createWorkerFactory("programmer");

        Worker worker = workerFactory.createWorker();

        worker.doWork();
    }

    public static WorkerFactory createWorkerFactory(String specialty){
        switch (specialty){
            case "programmer":
                return new ProgrammerFactory();

            case "sales manager":
                return new SalesManagerFactory();

            case "recruiter":
                return new RecruiterFactory();

            default: throw new RuntimeException();
        }
    }
}
