package com.javier.rodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractFactory abstractFactory;
        abstractFactory= FactoryProvider.getFactory("Animal");
        Animal animal=(Animal) abstractFactory.create("Dog");
        abstractFactory = FactoryProvider.getFactory("Color");
        Color color = (Color) abstractFactory.create("White");
        System.out.println(animal.getType()+" - "+ color.getColor()+ " -"+animal.makeSound());

    }
}
