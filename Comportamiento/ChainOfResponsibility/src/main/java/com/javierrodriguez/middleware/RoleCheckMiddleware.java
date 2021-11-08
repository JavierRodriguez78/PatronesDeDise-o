package com.javierrodriguez.middleware;

public class RoleCheckMiddleware extends Middleware {

    @Override
    public boolean check(String email, String password) {
        if (email.equals("admin@admin.com")){
            System.out.println("Bienvenido admin");
            return true;
        }
        System.out.println("Hola, Usuario");
        return checkNext(email, password);
    }
}
