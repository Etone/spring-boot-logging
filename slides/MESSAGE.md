---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Message handling

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%

@snap[north text-white span-100]
Exception logging
@snapend

```java

try {
    //Code that potentially throws exception
} catch (Exception ex) {
    logger.error("Error while writing debugging Message.", ex.getStackTrace(), ex);
}

```

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%
@snap[north text-white span-100]
String concationation
@snapend

```java

logger.warn("Warning message for ID {1}", id)

```