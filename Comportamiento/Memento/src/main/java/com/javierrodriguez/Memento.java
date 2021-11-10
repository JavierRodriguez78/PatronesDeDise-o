package com.javierrodriguez;

public class Memento {
    private String fileName;
    private StringBuilder content;

    public Memento(String file, StringBuilder content){
        this.fileName = file;
        this.content = new StringBuilder(content);
    }

    public String getFileName()
    {
        return this.fileName;
    }

    public StringBuilder getContent(){
        return this.content;
    }

}
