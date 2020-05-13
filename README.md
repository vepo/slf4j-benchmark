# Benchmark

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
