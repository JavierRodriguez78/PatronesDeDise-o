package com.javierrodriguez.Notifications;

import com.javierrodriguez.Iterators.Iterator;

public class NotificationBar {
    private NotificationCollection notifications;
    public NotificationBar(NotificationCollection notifications){
        this.notifications = notifications;
    }

    public void printNotifications(){
        Iterator iterator = notifications.createIterator();
        System.out.println("-----NOTIFICACIONES--------");
        while(iterator.hasNext())
        {
            Notification n = (Notification) iterator.next();
            System.out.println(n.getNotification());
        }
    }
}
