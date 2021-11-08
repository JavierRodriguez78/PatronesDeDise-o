package com.javierrodriguez.middleware;

import com.javierrodriguez.server.Server;

public class UserExistsMiddleware extends Middleware{

    private Server server;

    public UserExistsMiddleware(Server server){
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if(!server.hasEmail(email)){
            System.out.println("El emial no existe");
            return false;
        }
        if(!server.isValidPassword(email, password)){
            System.out.println("Passowrd Incorrecto");
            return  false;
        }
        return checkNext(email, password);
    }
}
