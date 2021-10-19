package com.javier.rodriguez.message;

public class TextMessage implements IMessage{

    private String content;
    public TextMessage(){

    }
    public TextMessage(String message){
        this.content = message;
    }

    public String getMessage(){
        return this.content;
    }

    public void setMessage(String message){
        this.content = message;
    }

    @Override
    public IMessage processMessage() {
        return this;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }
}
