package de.novatec.logging_demo.datapool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datapool")
public class DatapoolController {

    private Logger logger = LoggerFactory.getLogger(DatapoolController.class);

    @GetMapping("/error")
    public void logErrorMessageFromDatapool(){
        logger.error("Datapool error log message");
    }

    @GetMapping("/warn")
    public void logWarnMessageFromDatapool(){
        logger.warn("Datapool warn log message");
    }

    @GetMapping("/info")
    public void logInfoMessageFromDatapool(){
        logger.info("Datapool info log message");
    }

    @GetMapping("/debug")
    public void logDebugMessageFromDatapool(){
        logger.debug("Datapool debug log message");
    }

    @GetMapping("/trace")
    public void logTraceMessageFromDatapool(){
        logger.trace("Datapool trace log message");
    }
}
