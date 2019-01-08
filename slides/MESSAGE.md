---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Message handling

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%
@snap[north text-white span-100]
String concationation
@snapend

```java
logger.debug("Warning message for ID {} and organization {}",
                id, orgId);
```

@[1](String concatination only done when loglevel < DEBUG)

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%

@snap[north text-white span-100]
Exception logging
@snapend

```java
try {
    //Code that potentially throws exception
} catch (Exception ex) {
    logger.error("Error while logging.",
                    ex.getStackTrace(), ex);
}
```
@[4-5](No need of placeholder)
