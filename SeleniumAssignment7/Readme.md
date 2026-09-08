# Assignment No. 7 – Selenium Automation

## Project Overview

This project implements web automation using **Java, Selenium WebDriver, and TestNG** on the SauceDemo website.

## Automated Test Cases

* Invalid login with incorrect credentials
* Successful login with valid credentials
* Product navigation and validation
* Product name, price, and description verification

## Framework

* Java
* Selenium WebDriver
* TestNG
* Maven
* Page Object Model (POM)

## Reusable Utilities

A reusable `BasePage` utility was created with common Selenium actions:

* Click elements
* Enter text
* Get element text
* Explicit waits using WebDriverWait

## Project Structure

```text
SeleniumAssignment7
├── pom.xml
├── README.md
└── src
    └── test
        └── java
            ├── pages
            │   ├── LoginPage.java
            │   ├── ProductsPage.java
            │   └── ProductDetailsPage.java
            │
            ├── tests
            │   ├── LoginTest.java
            │   └── ProductTest.java
            │
            └── utils
                ├── BaseTest.java
                └── BasePage.java
```

## Test Results

All implemented Selenium automation test cases passed successfully.

## Website

SauceDemo
