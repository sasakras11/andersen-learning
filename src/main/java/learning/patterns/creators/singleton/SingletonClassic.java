package learning.patterns.creators.singleton;

public class SingletonClassic {

    private static SingletonClassic singleton;

    private SingletonClassic(){

    }

    public static SingletonClassic getInstance(){
        if(singleton == null){
            singleton = new SingletonClassic();
        }
        return singleton;
    }
}
