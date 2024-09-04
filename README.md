# Test task

API tests for site https://jsonplaceholder.typicode.com/posts

The task is in the txt file /jsonplaceholder-tests/task

## Environment configuration

1. [JDK 17](https://www.oracle.com/java/technologies/downloads/#java17)
2. [Gradle](https://gradle.org/)
3. [Allure Report](https://allurereport.org/)
4. [IntelliJ IDEA](https://www.jetbrains.com/idea/)
5. [Lombok plugin](https://plugins.jetbrains.com/plugin/6317-lombok-plugin) for IntelliJ IDEA
6. [RestAssured](https://rest-assured.io/)
7. [JUnit5](https://junit.org/junit5/)

## Getting Started

### Clone this repository
```bash
git clone https://github.com/OlgaSeilah/jsonplaceholder-tests.git
````
### Go into the repository
```bash
cd jsonplaceholder-tests
````

### How to run api tests with allure report:

``` bash
 gradle build -x test
 ```
``` bash
gradle test allureReport
```
``` bash
gradle allureServe
```

### How to run exercise 2:

``` bash
 gradle build -x test
 ```
``` bash
gradle :exercise-2:runExercise
```

