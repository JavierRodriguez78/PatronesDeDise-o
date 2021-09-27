package com.javier.rodriguez.multihiloErroneo;

public class MultihiloApp {
    public static void main(String[] args) {
        Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        threadFoo.start();
        threadBar.start();
    }

    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            MultihiloSingleton singleton = MultihiloSingleton.getInstance("Hi !!!");
            System.out.println(singleton.value);
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            MultihiloSingleton singleton = MultihiloSingleton.getInstance("Bye !!!");
            System.out.println(singleton.value);
        }
    }
}
