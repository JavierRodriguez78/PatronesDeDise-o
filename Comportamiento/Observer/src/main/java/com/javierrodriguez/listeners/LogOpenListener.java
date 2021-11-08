package com.javierrodriguez.listeners;

import java.io.File;

public class LogOpenListener implements  EventListener {

    private File log;

    public LogOpenListener(String fileName){
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Guardar en el log "+ this.log + ": Alguna modificación ->"+eventType+"Sobre el archivo ->"+ file.getName());
    }
}
