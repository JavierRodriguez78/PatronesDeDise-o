package com.javier.rodriguez;

public class DefaultProcessEjecutor implements IProcessEjecutor{
    @Override
    public void ejecuteProcess(int idProcess, String user, String paswword) throws Exception {
        System.out.println("processes "+ idProcess +" in action");
        System.out.println("processes "+ idProcess +" finished");
    }
}
