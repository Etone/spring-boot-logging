package de.novatec.logging_demo.configurator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class ConfiguratorService {

    private Logger logger = LoggerFactory.getLogger(ConfiguratorService.class);

    public void logTraceMessageService(){
        logger.trace("Configurator Service trace message logged");
    }
}
