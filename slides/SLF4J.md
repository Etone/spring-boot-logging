---?color=linear-gradient(120deg, #ffed7b 0%, #e9454e 100%);

@css[text-white]
Logging with slf4j and Logback

+++

```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(
        ReferencesController.class);

    @GetMapping("/error")
    public void logErrorMessageFromReferences(){
        logger.error("References error log message");
    }
}
```

@[1,2,6-7](Initialization of logger with logger factory)
@[11](Usage of logger to log error message)