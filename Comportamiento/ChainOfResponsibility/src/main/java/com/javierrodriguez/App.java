package com.javierrodriguez;

import com.javierrodriguez.middleware.Middleware;
import com.javierrodriguez.middleware.RoleCheckMiddleware;
import com.javierrodriguez.middleware.ThrottlingMiddleware;
import com.javierrodriguez.middleware.UserExistsMiddleware;
import com.javierrodriguez.server.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Hello world!
 *
 */
public class App 
{
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Server server;

    public static void init(){
        server = new Server();
        server.register("admin@admin.com","admin_pass");
        server.register("user@user.com", "user_pass");

        Middleware middleware = new ThrottlingMiddleware(2);
        middleware.linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);
    }

    public static void main( String[] args ) throws IOException {
        init();
        boolean success;
        do{
            System.out.println("Introduce email: ");
            String email = reader.readLine();
            System.out.println("Introduce password");
            String password = reader.readLine();
            success = server.logIn(email, password);

        }while(!success);

    }
}
