package com.javier.rodriguez.services;

public class SecurityService {
    public boolean authorization(String user, String password){
        if( user.equals("xavi")&&password.equals("1234")){
            System.out.println("User "+ user + "Authorized");
            return true;
        }
        System.out.println("User "+user+" not Authorized");
        return false;
    }
}
