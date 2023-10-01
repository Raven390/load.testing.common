# load.testing.common
Common components for load testing project

### Генерация Java-кода из protobuf схемы:
```shell
protoc --plugin=protoc-gen-grpc-java={ABSOLUTE_PATH}\load.testing.common\schema\protoc-gen-grpc-java-1.58.0-windows-x86_64.exe -I={ABSOLUTE_PATH}\load.testing.common\schema --java_out={ABSOLUTE_PATH}\load.testing.common\src\main\java --grpc-java_out={ABSOLUTE_PATH}\load.testing.common\src\main\java {ABSOLUTE_PATH}\load.testing.common\schema\LoadTestingStart.proto
```

### Подключение зависимости к проектам web и runner
1) Выполнить шаги Maven `clean package`
2) Добавить в целевой проект зависимость:
```xml
<dependency>
    <groupId>ru.develonica</groupId>
    <artifactId>load.testing.common</artifactId>
    <version>0.1</version>
    <scope>system</scope>
    <systemPath>{SYSTEM_PATH}\load.testing.common\target\load.testing.common-0.1.jar</systemPath>
</dependency>
```