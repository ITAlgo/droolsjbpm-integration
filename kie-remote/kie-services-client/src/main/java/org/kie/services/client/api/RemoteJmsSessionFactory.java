package org.kie.services.client.api;

import org.kie.api.runtime.manager.RuntimeManager;
import org.kie.services.client.api.command.RemoteRuntimeManager;

public class RemoteJmsSessionFactory implements RemoteSessionFactory {

    private String url;
    private String deploymentId;
    
    public RemoteJmsSessionFactory(String url, String deploymentId) {
        this.url = url;
        this.deploymentId = deploymentId;
    }
    
    public RuntimeManager newRuntimeManager() {
    	return new RemoteRuntimeManager("Remote Runtime Manager", url, deploymentId, null, null, null);
    }
    
}
