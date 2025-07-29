package ml.pevgen.demo.serviceb.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    private static final Logger logger = LoggerFactory.getLogger(ServiceBController.class);

    @GetMapping("/serviceB")
    public String serviceB() {

        logger.info("Incoming request to /some-endpoint");
        return "Service B";
    }

}
