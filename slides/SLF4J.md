---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Logging with slf4j and Logback

+++

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(
        ReferencesController.class);

    private Logger logger = LoggerFactory.getLogger(
        ReferencesController.class);

    @GetMapping("/error")
    public void logErrorMessageFromReferences(){
        logger.error("References error log message");
    }
}
```

@[1-2,6-10](Initialization of logger with LoggerFactory)
@[11](Usage of logger to log error message)