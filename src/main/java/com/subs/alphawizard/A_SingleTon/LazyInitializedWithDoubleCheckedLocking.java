package com.subs.alphawizard.A_SingleTon;

public class LazyInitializedWithDoubleCheckedLocking {
    private static volatile LazyInitializedWithDoubleCheckedLocking lazyInitializedWithDoubleCheckedLocking;
    private LazyInitializedWithDoubleCheckedLocking(){}
    public static  LazyInitializedWithDoubleCheckedLocking getInstance(){
        if(lazyInitializedWithDoubleCheckedLocking == null){
            synchronized (LazyInitializedWithDoubleCheckedLocking.class){
                if (lazyInitializedWithDoubleCheckedLocking == null){
                    lazyInitializedWithDoubleCheckedLocking = new LazyInitializedWithDoubleCheckedLocking();
                }
            }
        }
        return lazyInitializedWithDoubleCheckedLocking;
    }
}
