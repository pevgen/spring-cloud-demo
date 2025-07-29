package ml.pevgen.demo.servicea.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceAController {

    private static final Logger log = LoggerFactory.getLogger(ServiceAController.class);

    @Value("${eureka.instance.instance-id}")
    private String instanceId;

    @Value("${tmp.value}")
    private int tmpValue;

    private final ServiceBClientIntf serviceBClient;

    public ServiceAController(ServiceBClientIntf serviceBClient) {
        this.serviceBClient = serviceBClient;
    }

    @GetMapping("/serviceA")
    public String serviceA() {
        return "Service A. ID: " + instanceId + "; tmpValue: " + tmpValue;
    }

    @GetMapping("/chain")
    public String requestToServiceB() {
        log.info("Execute chain service B");
        return "Service A. Chain service B: " + this.serviceBClient.serviceB();
    }

}
