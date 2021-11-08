package com.javierrodriguez;

import com.javierrodriguez.editor.Editor;
import com.javierrodriguez.listeners.EmailNotificationListener;
import com.javierrodriguez.listeners.LogOpenListener;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("example@example.com"));

        try{
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
