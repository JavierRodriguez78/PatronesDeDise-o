package com.javier.rodriguez.multihilocorrecto;

public class MultihiloCorrecto {

    private static volatile MultihiloCorrecto instance;

    public String value;

    private MultihiloCorrecto(String value) {
        this.value = value;
    }

    public static MultihiloCorrecto getInstance(String value) {
        MultihiloCorrecto result = instance;
        if (result != null) {
            return result;
        }
        synchronized(MultihiloCorrecto.class) {
            if (instance == null) {
                instance = new MultihiloCorrecto(value);
            }
            return instance;
        }
    }
}
