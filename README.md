[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=20718450)

# Java Gradle Testing Guide

This project uses Gradle and JUnit for automated testing.

## How to Run All Tests

Open a terminal in the project root and run:


./gradlew test or gradle test

## How to Run a Single Test Class

To run all tests in a specific class (e.g., `TipCalculatorTest`):

./gradlew test --tests com.example.TipCalculatorTest


## How to Run a Single Test Method
To run a specific test method (e.g., `testExtraCreditSimpleItems`):

```bash
./gradlew test --tests com.example.TipCalculatorTest.testExtraCreditSimpleItems
```

Happy testing!
