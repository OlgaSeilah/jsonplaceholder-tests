# Test task

API tests for site https://jsonplaceholder.typicode.com/posts

## Environment configuration

1. [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
2. [Gradle](https://gradle.org/)
3. [Allure Report](https://allurereport.org/)
4. [IntelliJ IDEA](https://www.jetbrains.com/idea/)
5. [Lombok plugin](https://plugins.jetbrains.com/plugin/6317-lombok-plugin) for IntelliJ IDEA
6. [RestAssured](https://rest-assured.io/)

### How to run tests with report

``` bash
 gradle build
 ```
``` bash
gradle test allureReport
```
``` bash
gradle allureServe
```

