package dev.conmac.runnerz;

import org.springframework.stereotype.Component;

@Component
public class WelcomeMessage {

    public String getWelcomemesage() {
        return "Welcome to the Spring Boot Application!";

    
    }

}
