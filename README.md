# Spring Starter v3 — Templates Edition

A clean Spring Boot starter that focuses on **server-side templates** using **Thymeleaf**.

This version is meant for learning and demo projects where you want to render HTML pages from Spring instead of returning only JSON APIs.

## What this version teaches

- Spring MVC controllers that return template names
- Thymeleaf expressions like `th:text`, `th:href`, `th:each`, and `th:if`
- Shared page fragments for header and footer
- Form handling with `@ModelAttribute`
- Static assets from `/static/css` and `/static/js`

## Stack

- Java 17+
- Spring Boot 4.0.4
- Thymeleaf
- Gradle Wrapper

## Routes

- `/` → template home page
- `/hello` → greeting form page
- `POST /hello` → greeting result page
- `/about` → template notes page

## Run locally

### Windows

```bash
gradlew.bat bootRun
```

### macOS / Linux

```bash
./gradlew bootRun
```

Then open:

- `http://localhost:8080/`
- `http://localhost:8080/hello`
- `http://localhost:8080/about`

## Project structure

```text
src/
  main/
    java/live/learnwithchampak/demo/
      DemoApplication.java
      controller/
        PageController.java
      model/
        GreetingForm.java
    resources/
      application.properties
      templates/
        index.html
        hello-form.html
        hello-result.html
        about.html
        fragments/
          layout.html
      static/
        css/site.css
        js/site.js
```

## What to learn next

- Add validation to the form
- Add a service layer for page data
- Introduce a database and show records inside a table template
- Add a layout dialect or reusable components for larger apps
