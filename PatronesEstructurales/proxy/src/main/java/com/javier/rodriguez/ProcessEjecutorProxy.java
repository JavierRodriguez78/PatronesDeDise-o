package com.javier.rodriguez;

import com.javier.rodriguez.services.AuditService;
import com.javier.rodriguez.services.SecurityService;

public class ProcessEjecutorProxy implements IProcessEjecutor{
    @Override
    public void ejecuteProcess(int idProcess, String user, String password) throws Exception {
        SecurityService securityService = new SecurityService();
        if(!securityService.authorization(user, password)){
            throw new Exception("The user '"+user
                    +"' does not have privileges to execute the process");
        }

        DefaultProcessEjecutor ejecutorProcess = new DefaultProcessEjecutor();
        ejecutorProcess.ejecuteProcess(idProcess, user, password);

        AuditService audit = new AuditService();
        audit.auditServiceUsed(user, DefaultProcessEjecutor.class.getName());
    }
}
