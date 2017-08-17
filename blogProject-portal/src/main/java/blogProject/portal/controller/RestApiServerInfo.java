package blogProject.portal.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;

@Controller
public class RestApiServerInfo {
    
    @Value("${resapi.server.ip}")
    private String restapiServer;
    
    @Value("${resapi.server.port}")
    private String restapiPort;
    
    @Value("${resapi.server.apppath}")
    private String restapiappPath;
    
    public String getRestApiURL(){
        return "http://" + restapiServer +  ":" + restapiPort + "/" + restapiappPath;
    }
}
