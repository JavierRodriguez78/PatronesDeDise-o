package com.javierodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        ChatMediator mediator = new ChatMediatorImpl();
        User user1 = new UserImpl(mediator, "Xavi");
        User user2 = new UserImpl(mediator, "Jose");
        User user3 = new UserImpl(mediator, "MariaJose");
        User user4 = new UserImpl(mediator, "Pedro");
        User user5 = new UserImpl(mediator, "Salva");
        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);
        mediator.addUser(user5);

        user1.send("Hola a todos");



    }
}
