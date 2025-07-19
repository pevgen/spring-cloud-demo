package ml.pevgen.demo.serviceb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    @GetMapping("/serviceB")
    public String serviceB() {
        return "Service B";
    }

}
