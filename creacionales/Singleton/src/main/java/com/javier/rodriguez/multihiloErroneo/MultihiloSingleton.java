package com.javier.rodriguez.multihiloErroneo;

public class MultihiloSingleton {
    private static MultihiloSingleton instance = null;
    public String value;
    private MultihiloSingleton(String value){
        try{
            Thread.sleep(100);
        }catch (InterruptedException ex){
            ex.printStackTrace();
        }
        this.value = value;
    }
    public static MultihiloSingleton getInstance(String value){
        if( instance== null){
            instance = new MultihiloSingleton(value);
        }
        return instance;
    }
}
