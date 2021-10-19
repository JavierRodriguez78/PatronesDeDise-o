package com.javier.rodriguez;

import com.javier.rodriguez.decorators.EncryptMessage;
import com.javier.rodriguez.decorators.SoapEnvelopMessage;
import com.javier.rodriguez.decorators.XMLFormatterDecorate;
import com.javier.rodriguez.message.CustomerMessage;
import com.javier.rodriguez.message.IMessage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        CustomerMessage customerMessage = new CustomerMessage(
                "Xavi Rodriguez", "xavi@widitrade.com", "554433445566");
        System.out.println("Original Message ==> " + customerMessage);

        IMessage message1 = new EncryptMessage("user", "HG58YZ3CR9123456",
                new SoapEnvelopMessage(
                        new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message1 =====================================>\n"
                + message1.getContent() + "\n\n");

        IMessage message2 = new SoapEnvelopMessage(
                new EncryptMessage("user", "HG58YZ3CR9123456",
                        new XMLFormatterDecorate(customerMessage))).processMessage();
        System.out.println("message2 =====================================>\n"
                + message2.getContent());

    }
}
