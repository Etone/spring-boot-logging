---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Logging with slf4j and Logback

+++

```java
package de.novatec.logging_demo.references;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(
        ReferencesController.class);

    private Logger logger = LoggerFactory.getLogger(
        "Reference Controller Logger");

    @GetMapping("/error")
    public void logErrorMessageFromReferences(){
        logger.error("References error log message");
    }
}
```

@[3-4,8-12](Initialization of logger with LoggerFactory)
@[16](Usage of logger to log error message)

+++

@box[bg-orange text-white demo-box-text-padding rounded](2019-01-08 11:32:14.314 ERROR 20296 --- [nio-8080-exec-1] d.n.l.references.ReferencesController    : References error log message)

@snap[south-west template-note text-white]
<br>Logger output for Error message
@snapend