# Web Automation Codex v2

This repository contains a minimal Selenium web automation project built with Java, Maven, and TestNG.

## Project Structure

- `pom.xml` includes Selenium, TestNG, and WebDriverManager dependencies.
- `src/test/java` contains a sample TestNG test that opens Google and verifies the page title.

## Run Tests

```bash
mvn test
```

The test uses Chrome in headless mode via WebDriverManager.
