package com.javierrodriguez.command;

import com.javierrodriguez.receiver.TextFile;

public class SaveTextFileOperation implements TextFileOperation{

    private final TextFile textFile;


    public SaveTextFileOperation(TextFile textFile){
        this.textFile = textFile;
    }


    @Override
    public String execute() {
        return this.textFile.save();
    }
}
