package com.subs.alphawizard.A_SingleTon;
//Lazy Initialization (Not Thread-Safe):
// If you create the Singleton instance lazily (i.e., when getInstance() is called),
// it's not thread-safe by default.
// Multiple threads could potentially create multiple instances concurrently.
// To make it thread-safe, you can use synchronization or employ a thread-safe mechanism like synchronized or a volatile keyword.
public class LazyInitializedSingleton {
    //Non ThreadSafe multiple threads can access it concurrently and create new instance for this singleton
    private static LazyInitializedSingleton instance;
    private LazyInitializedSingleton() {}
    public static synchronized LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

    }

