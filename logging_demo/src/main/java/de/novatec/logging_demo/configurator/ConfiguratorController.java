package de.novatec.logging_demo.configurator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/configurator")
public class ConfiguratorController {

    private Logger logger = LoggerFactory.getLogger(ConfiguratorController.class);

    @Autowired
    private ConfiguratorService service;

    @GetMapping("/error")
    public ResponseEntity logErrorMessageFromConfigurator(){
        logger.error("Configurator REST error log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/warn")
    public ResponseEntity logWarnMessageFromConfigurator(){
        logger.warn("Configurator REST warn log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity logInfoMessageFromConfigurator(){
        logger.info("Configurator REST info log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/debug")
    public ResponseEntity logDebugMessageFromConfigurator(){
        logger.debug("Configurator REST debug log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/trace")
    public ResponseEntity logTraceMessageFromConfigurator(){
        logger.trace("Configurator REST trace log message");
        service.logTraceMessageService();
        return new ResponseEntity(HttpStatus.OK);
    }
}
