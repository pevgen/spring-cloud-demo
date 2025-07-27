package ml.pevgen.demo.serviceb.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceBController {

    private static final Logger logger = LoggerFactory.getLogger(ServiceBController.class);

    @GetMapping("/serviceB")
    public String serviceB(HttpServletRequest request) {

        logger.info("Incoming request to /some-endpoint");

        // Логирование заголовков
        request.getHeaderNames().asIterator()
                .forEachRemaining(name -> logger.info("Header [{}]: {}", name, request.getHeader(name)));

        // Можно логировать traceId и spanId из MDC (если используется Sleuth/Micrometer Tracing)
        String traceId = org.slf4j.MDC.get("traceId");
        String spanId = org.slf4j.MDC.get("spanId");
        logger.info("TraceId: {}, SpanId: {}", traceId, spanId);

        return "Service B";
    }

}
