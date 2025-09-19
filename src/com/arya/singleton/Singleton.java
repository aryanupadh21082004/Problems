package com.arya.singleton;

public class Singleton {
    private Singleton(){

    }
    private static Singleton instance;
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
            System.out.println("I am printed");
        }
        return instance;
    }
}
