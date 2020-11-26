package learning.patterns.creators.singleton;

public class SingletonSynchronized {
    private static volatile SingletonSynchronized singleton;

    private SingletonSynchronized() {

    }

    public static SingletonSynchronized getInstance() {

        SingletonSynchronized instance = singleton;
        if (instance != null) {
            return singleton;
        }

        synchronized (SingletonSynchronized.class) {
            if (instance == null) {
                instance = new SingletonSynchronized();
            }
            return instance;

        }
    }
}
