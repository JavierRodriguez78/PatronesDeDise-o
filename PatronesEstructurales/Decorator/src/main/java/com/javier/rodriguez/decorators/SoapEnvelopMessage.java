package com.javier.rodriguez.decorators;

import com.javier.rodriguez.message.IMessage;

public class SoapEnvelopMessage extends MessageDecorator{

    public SoapEnvelopMessage(IMessage message){
        super(message);
    }

    @Override
    public IMessage processMessage() {
        this.message.processMessage();
        this.envelopMessage();
        return this.message;
    }

    private IMessage envelopMessage(){
        String soap = "<soapenv:Envelope xmlns:soapenv="
                + "\n\"http://schemas.xmlsoap.org/soap/envelope/\" "
                + "\nxmlns:ser=\"http://service.dishweb.cl.com/\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + message.getContent()
                + "\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";
        message.setContent(soap);
        return message;
    }
}
