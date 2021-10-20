package com.javier.rodriguez;

public class ServiceFactory {

    public static IProcessEjecutor createProcessEjecutor(){
        return new ProcessEjecutorProxy();
    }
}
