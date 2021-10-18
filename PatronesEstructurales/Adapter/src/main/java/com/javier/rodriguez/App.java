package com.javier.rodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        Movable Citroen = new Citroen();
        MovableAdapter CitroenAdapter = new MovableAdapterImpl(Citroen);
        System.out.println("Velocidad Citrones es ->"+ CitroenAdapter.getSpeed()+"km/h");

        Movable Seat = new Seat();
        MovableAdapter SeatAdapter = new MovableAdapterImpl(Seat);
        System.out.println("Velocidad Seat es ->" + SeatAdapter.getSpeed()+"km/h");

        Movable Mercedes = new Mercedes();
        MovableAdapter MercedesAdapter = new MovableAdapterImpl(Mercedes);
        System.out.println("Velocidad Merecedes es -> "+ MercedesAdapter.getSpeed()+"km/h");

    }
}
