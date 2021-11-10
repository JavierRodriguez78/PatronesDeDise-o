package com.javierrodriguez;

import com.javierrodriguez.Notifications.NotificationBar;
import com.javierrodriguez.Notifications.NotificationCollection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        NotificationCollection nc = new NotificationCollection();
        NotificationBar nb = new NotificationBar(nc);
        nb.printNotifications();
    }
}
