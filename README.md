# Benchmark

# To execute

```bash
mvn clean compile -P logback exec:java -DLOG_LEVEL=INFO -DAPPENDER=STDOUT
mvn clean compile -P logback exec:java -DLOG_LEVEL=DEBUG -DAPPENDER=STDOUT
mvn clean compile -P logback exec:java -DLOG_LEVEL=INFO -DAPPENDER=FILE
mvn clean compile -P logback exec:java -DLOG_LEVEL=DEBUG -DAPPENDER=FILE

mvn clean compile -P log4j exec:java -DLOG_LEVEL=info -DAPPENDER=stdout
mvn clean compile -P log4j exec:java -DLOG_LEVEL=debug -DAPPENDER=stdout
mvn clean compile -P log4j exec:java -DLOG_LEVEL=info -DAPPENDER=file
mvn clean compile -P log4j exec:java -DLOG_LEVEL=debug -DAPPENDER=file
```


# Logback

| Level | Appender | Time | op/μs |
| ----- | -------- | :--: | :---: |
| DEBUG | STDOUT | 28055ms | 28,055 |
| INFO | STDOUT | 14ms | 0,014 |
| DEBUG | FILE | 4976ms | 4,976 |
| INFO | FILE | 17ms | 0,017 |
| DEBUG | ASYNC | N/A | N/A |
| INFO | ASYNC | N/A | N/A |


# Log4j

| Level | Appender | Time | op/μs |
| ----- | -------- | :--: | :---: |
| DEBUG | STDOUT | 30593ms | 30,593 |
| INFO | STDOUT | 16ms | 0,016 |
| DEBUG | FILE | 5137ms | 5,123 |
| INFO | FILE | 20ms | 0,020 |
