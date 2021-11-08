package com.javierrodriguez.command;

import com.javierrodriguez.receiver.TextFile;

public class OpenTextFileOperation implements  TextFileOperation{
    private final TextFile textFile;


    public OpenTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }


    @Override
    public String execute() {
        return this.textFile.open();
    }
}
