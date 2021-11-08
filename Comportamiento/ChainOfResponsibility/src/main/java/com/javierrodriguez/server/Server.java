package com.javierrodriguez.server;

import com.javierrodriguez.middleware.Middleware;

import java.util.HashMap;
import java.util.Map;

public class Server {
    private Map<String ,String > users = new HashMap<>();
    private Middleware middleware;
    public void setMiddleware(Middleware middleware){
        this.middleware = middleware;
    }

    public boolean logIn(String email, String password){
        if (middleware.check(email, password)){
            System.out.println("Authorization sucessful!!");
            return  true;
        }
        return  false;
    }

    public void register(String email, String password){
        this.users.put(email, password);
    }

    public boolean hasEmail(String email){
        return this.users.containsKey(email);
    }

    public boolean isValidPassword(String email, String password){
        return this.users.get(email).equals(password);
    }

}
