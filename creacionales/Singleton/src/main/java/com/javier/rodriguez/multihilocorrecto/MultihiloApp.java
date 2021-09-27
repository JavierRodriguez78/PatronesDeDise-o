package com.javier.rodriguez.multihilocorrecto;

public class MultihiloApp {

        public static void main(String[] args) {
            Thread threadHi = new Thread(new ThreadHi());
            Thread threadBye = new Thread(new ThreadBye());
            threadHi.start();
            threadBye.start();
        }

        static class ThreadHi implements Runnable {
            @Override
            public void run() {
                MultihiloCorrecto singleton = MultihiloCorrecto.getInstance("Hi !!!");
                System.out.println(singleton.value);
            }
        }

        static class ThreadBye implements Runnable {
            @Override
            public void run() {
                MultihiloCorrecto singleton = MultihiloCorrecto.getInstance("Bye !!!");
                System.out.println(singleton.value);
            }
        }
}
