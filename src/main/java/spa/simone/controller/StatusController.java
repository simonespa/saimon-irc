package spa.simone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @Autowired
    private Environment env;

    @RequestMapping("/status")
    public String status() {
        return "status ok";
    }

    @RequestMapping("/message")
    public String message() {
        return env.getProperty("message");
    }

    @RequestMapping("/defaultProfiles")
    public String defaultProfiles() {
        String[] profiles = env.getDefaultProfiles();
        StringBuilder builder = new StringBuilder();
        for (String p : profiles) {
            builder.append(p).append(", ");
        }
        return builder.toString();
    }

    @RequestMapping("/activeProfiles")
    public String activeProfiles() {
        String[] profiles = env.getActiveProfiles();
        StringBuilder builder = new StringBuilder();
        for (String p : profiles) {
            builder.append(p).append(", ");
        }
        return builder.toString();
    }

}