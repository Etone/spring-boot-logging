---?color=linear-gradient(145deg, #e9454e 0%, #ffed7b 100%);

@snap[midpoint text-white]
Configuration

+++?image=template/img/bg/orange.jpg&position=top&size=100% 15%

@snap[north text-white span-100]
Log Levels
@snapend

@snap[midpoint text-nt-orange]

1. ERROR
2. WARN
3. INFO @fa[arrow-right] default log level
4. DEBUG
5. TRACE

@snapend

+++

```properties
logging.group.<name>
logging.level.<log group or logger>
logging.pattern.console
logging.pattern.file
```

@[1](Grouping of loggers, default groups: web, sql, root)
@[2](Log level for loggers in group / with selected name)
@[3-4](Logging pattern, this only works with logback, not log4j2, ...)