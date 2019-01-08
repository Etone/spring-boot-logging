---?image=template/img/bg/gray.jpg&size=100% 100%

@box[bg-orange text-white demo-box-text-padding rounded](Logging with slf4j and Logback)

+++

```java
public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(ReferencesController.class);

    @GetMapping("/error")
    public void logErrorMessageFromReferences(){
        logger.error("References error log message");
    }
}
```

@[3](Initialization of logger with logger factory)
@[7](Usage of logger to log error message)