package com.javierrodriguez.Notifications;

import com.javierrodriguez.Iterators.Iterator;

public class NotificationIterator implements Iterator {

    Notification[] notificationlist;

    int pos = 0;

    public NotificationIterator(Notification[] notificationlist){
        this.notificationlist = notificationlist;
    }

    @Override
    public boolean hasNext() {
        if (this.pos>=this.notificationlist.length ||
          this.notificationlist[this.pos] == null)
            return false;
        else
            return  true;
    }

    @Override
    public Object next() {
        Notification notification = notificationlist[this.pos];
        this.pos +=1;
        return  notification;
    }
}
