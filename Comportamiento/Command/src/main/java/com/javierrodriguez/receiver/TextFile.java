package com.javierrodriguez.receiver;

public class TextFile {
    private final String name;

    public TextFile(String name){
        this.name = name;
    }

    public String open(){
        return "Opening file "+ this.name;
    }

    public String read(){
        return "Reading file " + this.name;
    }

    public String write(){
        return "Writing to file " + this.name;
    }

    public String save(){
        return "Saving file " + this.name;
    }

    public String copy(){
        return "Copying file "+ this.name;
    }

    public String paste(){
        return "Pasting file "+ this.name;
    }



}
