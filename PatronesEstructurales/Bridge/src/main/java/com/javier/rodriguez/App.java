package com.javier.rodriguez;

import com.javier.rodriguez.devices.Device;
import com.javier.rodriguez.devices.Radio;
import com.javier.rodriguez.devices.Tv;
import com.javier.rodriguez.remotes.AdvancedRemote;
import com.javier.rodriguez.remotes.BasicRemote;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        testDevice(new Tv());
        testDevice(new Radio());

    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }

}
