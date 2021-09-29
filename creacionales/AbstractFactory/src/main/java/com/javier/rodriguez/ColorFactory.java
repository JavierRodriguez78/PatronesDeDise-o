package com.javier.rodriguez;

public class ColorFactory implements AbstractFactory{
    @Override
    public Object create(String typeColor) {
        if ("Brown".equalsIgnoreCase(typeColor)){
            return new Brown();
        }else if("White".equalsIgnoreCase(typeColor)){
            return new White();
        }
        return null;
    }
}
