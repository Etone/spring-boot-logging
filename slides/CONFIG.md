---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Configuration

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%

@snap[north text-white span-100]
Log Levels
@snapend

@snap[midpoint list-content-concise span-100]
@ol

- ERROR
- WARN
- INFO @fa[arrow-right] default log level
- DEBUG
- TRACE

@olend
<br><br>
@snapend

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%
@snap[north text-white span-100]
Config flags in application.properties
@snapend

```plain
logging.group.<name>
logging.level.<log group or logger>
logging.pattern.console
logging.pattern.file
```

@[1](Grouping of loggers, default groups: web, sql, root)
@[2](Log level for loggers in group / with selected name)
@[3-4](Logging pattern, this only works with logback, not log4j2, ...)