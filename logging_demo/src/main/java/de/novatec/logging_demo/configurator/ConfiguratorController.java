package de.novatec.logging_demo.configurator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    public void logErrorMessageFromConfigurator(){
        logger.error("Configurator REST error log message");
    }

    @GetMapping("/warn")
    public void logWarnMessageFromConfigurator(){
        logger.warn("Configurator REST warn log message");
    }

    @GetMapping("/info")
    public void logInfoMessageFromConfigurator(){
        logger.info("Configurator REST info log message");
    }

    @GetMapping("/debug")
    public void logDebugMessageFromConfigurator(){
        logger.debug("Configurator REST debug log message");
    }

    @GetMapping("/trace")
    public void logTraceMessageFromConfigurator(){
        logger.trace("Configurator REST trace log message");
        service.logTraceMessageService();
    }
}
