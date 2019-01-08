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

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%

@snap[north text-white span-100]
Logging Format
@snapend


```log
2019-01-08 11:41:30.338
ERROR
20296
--- [nio-8080-exec-4]
d.n.l.references.ReferencesController
: References error log message
```

@[1](Timestamp)
@[2](Severity)
@[3](PID)
@[4](Thread)
@[5](Shorthand Package / Class for Logger or Logger Name)
@[6](Log Message)

+++

