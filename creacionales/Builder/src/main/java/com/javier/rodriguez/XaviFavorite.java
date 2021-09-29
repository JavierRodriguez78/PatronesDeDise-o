package com.javier.rodriguez;

import java.util.ArrayList;
import java.util.Collections;

public class XaviFavorite extends PizzaBuilder{
    @Override
    public void buildCrust() {
        pizza.setCrust("thin");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("normal");
    }

    @Override
    public void buildToppings() {
        ArrayList<String> toppings = new ArrayList<String>();
        Collections.addAll(toppings,"mozarella cheese","sausage","chicken");
        pizza.setToppings(toppings);
    }
}
