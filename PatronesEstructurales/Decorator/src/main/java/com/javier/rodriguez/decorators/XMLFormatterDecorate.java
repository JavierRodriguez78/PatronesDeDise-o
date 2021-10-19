package com.javier.rodriguez.decorators;

import com.javier.rodriguez.message.IMessage;
import com.javier.rodriguez.message.TextMessage;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.Marshaller;

import javax.xml.namespace.QName;
import java.io.ByteArrayOutputStream;

public class XMLFormatterDecorate extends MessageDecorator{

    public XMLFormatterDecorate(IMessage message){
        super(message);
    }



    @Override
    public IMessage processMessage() {
        message = message.processMessage();
        message = xmlMessage();
        return message;
    }

    private IMessage xmlMessage() {
        try {
            JAXBContext jc = JAXBContext.newInstance(message.getClass());
            JAXBElement<IMessage> je2 = new JAXBElement<IMessage>(new QName(message.getClass().getName()), (Class<IMessage>) message.getClass(), message);
            Marshaller marshaller = jc.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            ByteArrayOutputStream output = new ByteArrayOutputStream();
            marshaller.marshal(je2, output);
            return new TextMessage(new String(output.toByteArray()));
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("XML error converting");
        }
    }
}
