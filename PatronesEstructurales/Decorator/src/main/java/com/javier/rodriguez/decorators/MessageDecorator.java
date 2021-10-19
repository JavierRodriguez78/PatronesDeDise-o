package com.javier.rodriguez.decorators;

import com.javier.rodriguez.message.IMessage;

public abstract class MessageDecorator implements IMessage {

    protected  IMessage message;

    public MessageDecorator(){};
    public MessageDecorator(IMessage message){
        this.message = message;
    }

    @Override
    public String getContent() {
        return this.message.getContent();
    }

    @Override
    public void setContent(String content) {
            this.message.setContent(content);
    }
}
