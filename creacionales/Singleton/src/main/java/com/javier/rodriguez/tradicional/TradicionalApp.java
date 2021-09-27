package com.javier.rodriguez.tradicional;

public class TradicionalApp {
    public static void main( String[] args ) {
        Singleton singleton = Singleton.getInstance("Hi !!! ");
        System.out.println(singleton.value);
        Singleton otherSingleton = Singleton.getInstance("Bye !!!");
        System.out.println(otherSingleton.value);


    }
}
