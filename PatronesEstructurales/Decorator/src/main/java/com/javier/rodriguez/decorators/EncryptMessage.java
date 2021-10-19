package com.javier.rodriguez.decorators;

import com.javier.rodriguez.message.IMessage;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;


public class EncryptMessage extends MessageDecorator{

    private String User;
    private String Password;

    public EncryptMessage(){};
    public EncryptMessage(String user, String password, IMessage message){
        super(message);
        this.User=user;
        this.Password=password;
    }

    public String getUser() {
        return this.User;
    }

    public void setUser(String user) {
        this.User = user;
    }

    public String getPassword() {
        return this.Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    @Override
    public IMessage processMessage() {
        this.message = message.processMessage();
        this.encryptMessage();
        return this.message;
    }

    private IMessage encryptMessage(){
        try {
            Key key = new SecretKeySpec(this.Password.getBytes(), "AES");
            Cipher c = Cipher.getInstance("AES");

            c.init(Cipher.ENCRYPT_MODE, key);
            byte[] encVal = c.doFinal(message.getContent().getBytes());

            message.setContent(encVal.toString());
            return message;
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        }
    }
}
