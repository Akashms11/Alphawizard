package com.subs.alphawizard.A_SingleTon;

public class EagerInitializedSingleton {
//    Eager Initialization: In this approach,
//    the Singleton instance is created when the class is loaded.
//    It's inherently thread-safe because the instance is created only once.


    private static final EagerInitializedSingleton EAGER_INITIALIZED_SINGLETON = new
            EagerInitializedSingleton();
    private EagerInitializedSingleton(){}
    public static EagerInitializedSingleton getInstance(){
        return  EAGER_INITIALIZED_SINGLETON;
    }
}
