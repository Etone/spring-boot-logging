---?image=template/img/bg/gray.jpg&position=top&size=100% 20%
@title[SLF4J Logger]

@snap[north text-nt-orange span-100]
@size[1.5em](Using slf4j with Spring Boot)
@snapend

```java
package de.novatec.logging_demo.references;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
// ...

@RestController
@RequestMapping("/references")
public class ReferencesController {

    private Logger logger = LoggerFactory.getLogger(ReferencesController.class);

    // REST Handlers
}
```
