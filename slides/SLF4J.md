---?image=template/img/bg/gray.jpg&position=top&size=100% 20%
@title[SLF4J Logger]

@snap[north text-nt-orange span-100]
@size[1.5em](Using slf4j with Spring Boot)
@snapend

```java
package de.novatec.logging_demo.references;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/references")
public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(ReferencesController.class);

    @GetMapping("/error")
    public void logErrorMessageFromReferences(){
        logger.error("References error log message");
    }

    @GetMapping("/warn")
    public void logWarnMessageFromReferences(){
        logger.warn("References warn log message");
    }

    @GetMapping("/info")
    public void logInfoMessageFromReferences(){
        logger.info("References info log message");
    }

    @GetMapping("/debug")
    public void logDebugMessageFromReferences(){
        logger.debug("References debug log message");
    }

    @GetMapping("/trace")
    public void logTraceMessageFromReferences(){
        logger.trace("References trace log message");
    }
}
```
