package com.javier.rodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Waiter waiter = new Waiter();
       PizzaBuilder HotPeperoinBuilder = new HotPepperoni();
        waiter.setPizzaBuilder(HotPeperoinBuilder);
        waiter.constructPizza();
        Pizza pizza1 = waiter.getPizza();
        System.out.println("Pizza ->" + pizza1.getCrust()+" ->"+ pizza1.getSauce()+" ->"+pizza1.getToppings());

    }
}
