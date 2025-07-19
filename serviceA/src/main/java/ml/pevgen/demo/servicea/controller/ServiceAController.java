package ml.pevgen.demo.servicea.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @GetMapping("/serviceA")
    public String serviceA() {
        return "Service A. ID: " + instanceId;
    }

}
