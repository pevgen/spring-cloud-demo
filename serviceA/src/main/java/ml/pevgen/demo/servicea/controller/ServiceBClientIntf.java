package ml.pevgen.demo.servicea.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "serviceB")  // name: from serviceB/application.properties, parameter: 'spring.application.name'
public interface ServiceBClientIntf {

    @GetMapping("/serviceB")
    String serviceB();
}
