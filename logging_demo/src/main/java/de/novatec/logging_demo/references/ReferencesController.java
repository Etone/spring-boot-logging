package de.novatec.logging_demo.references;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/references")
public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(ReferencesController.class);

    @GetMapping("/error")
    public ResponseEntity logErrorMessageFromReferences(){
        logger.error("References error log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/warn")
    public ResponseEntity logWarnMessageFromReferences(){
        logger.warn("References warn log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/info")
    public ResponseEntity logInfoMessageFromReferences(){
        logger.info("References info log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/debug")
    public ResponseEntity logDebugMessageFromReferences(){
        logger.debug("References debug log message");
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/trace")
    public ResponseEntity logTraceMessageFromReferences(){
        logger.trace("References trace log message");
        return new ResponseEntity(HttpStatus.OK);
    }
}
