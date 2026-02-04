# Selenium Web Automation (Java + Maven)

This project demonstrates a simple Selenium test using Java, Maven, TestNG, and WebDriverManager.

## Prerequisites
- Java 11+
- Maven 3.8+
- Google Chrome installed

## Setup
1. Clone the repository.
2. From the repository root, run:

```bash
mvn test
```

WebDriverManager will automatically download the matching ChromeDriver binary.

## Test Details
- `GoogleTitleTest` opens https://www.google.com and verifies the page title is `Google`.

## Running Tests
```bash
mvn test
```
