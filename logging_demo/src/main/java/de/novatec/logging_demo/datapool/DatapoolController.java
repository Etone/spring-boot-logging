package de.novatec.logging_demo.datapool;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datapool")
public class DatapoolController {

    private Logger logger = LoggerFactory.getLogger(DatapoolController.class);

    @GetMapping("/error")
    public ResponseEntity logErrorMessageFromDatapool(){
        logger.error("Datapool error log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/warn")
    public ResponseEntity logWarnMessageFromDatapool(){
        logger.warn("Datapool warn log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity logInfoMessageFromDatapool(){
        logger.info("Datapool info log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/debug")
    public ResponseEntity logDebugMessageFromDatapool(){
        logger.debug("Datapool debug log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/trace")
    public ResponseEntity logTraceMessageFromDatapool(){
        logger.trace("Datapool trace log message");
        return new ResponseEntity(HttpStatus.OK);
    }
}
