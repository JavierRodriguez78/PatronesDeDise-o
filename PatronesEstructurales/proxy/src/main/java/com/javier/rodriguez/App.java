package com.javier.rodriguez;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        String user = "xavi";
        String password = "1234";
        int process = 1;
        IProcessEjecutor processEjecutor = ServiceFactory.createProcessEjecutor();
        try {
            processEjecutor.ejecuteProcess(process, user, password);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
