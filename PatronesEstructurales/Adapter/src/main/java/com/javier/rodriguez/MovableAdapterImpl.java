package com.javier.rodriguez;

public class MovableAdapterImpl implements  MovableAdapter{
    public static final double CONVERSION_RATE = 1.60734;
    private Movable Cars;
    public MovableAdapterImpl(Movable car){
        this.Cars = car;
    }

    @Override
    public double getSpeed() {
        double mph = this.Cars.getSpeed();
        return convertMPHtoKMPH(mph);
    }

    private double convertMPHtoKMPH(double mph){
        return mph * CONVERSION_RATE;
    }
}
