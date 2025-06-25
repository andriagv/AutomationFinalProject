# Automation Final Project (Software Testing Course)

## English / ქართული
### ქართულისთვის დაბლა ჩასქროლეთ

---

## 🇬🇧 English

### Project Overview

This repository contains the final project for a university course on **Software Testing**. The project demonstrates practical automation testing skills by combining API testing with REST-assured and UI testing with Selenium, Cucumber, and Gherkin.

### Project Components

This project consists of two main parts:

1.  **API Testing with REST-assured**
    * **Goal:** To automate test cases for a public REST API using `jsonplaceholder.typicode.com`.
    * **Tasks Covered:**
        * Testing `GET /posts`: Verify status code 200 and at least 100 posts in the response.
        * Testing `GET /posts/1`: Verify status code 200 and `userId` equals 1.
        * Testing `POST /posts`: Verify status code 201 and correct response body.
        * Testing `PUT /posts/1`: Confirm the `title` field is updated.
        * Testing `DELETE /posts/1`: Ensure status code is 200 or 204.
    * **Technologies:** REST-assured, TestNG.

2.  **UI Testing with Selenium, Cucumber, and Gherkin**
    * **Goal:** To automate UI test scenarios for a web application (`https://www.saucedemo.com/`).
    * **Tasks Covered:**
        * Successful login with valid credentials.
        * Failed login and error message validation.
        * Adding a product to the cart and verifying its appearance.
        * Complete logout process.
    * **Technologies:** Selenium WebDriver, Cucumber, Gherkin.
    * **Best Practices:** Implemented Page Object Model (POM) for UI elements and used `WebDriverManager` for browser driver management. Screenshots are captured automatically on test failure using Cucumber Hooks.

### Project Structure

The project is structured to clearly separate API and UI tests, as well as utility classes:

```

AutomationFinalProject/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   ├── api/                 \# REST-assured API tests
│       │   │   ├── DeletePostsTest.java
│       │   │   ├── GetPostsTest.java
│       │   │   ├── PostPostsTest.java
│       │   │   └── PutPostsTest.java
│       │   ├── ui/
│       │   │   ├── pages/           \# Selenium Page Object Model classes
│       │   │   │   ├── LoginPage.java
│       │   │   │   └── ProductsPage.java
│       │   │   ├── runners/         \# Cucumber TestNG runners
│       │   │   │   └── TestRunner.java
│       │   │   └── steps/           \# Cucumber step definitions
│       │   │       ├── CartSteps.java
│       │   │       ├── Hooks.java
│       │   │       └── LoginSteps.java
│       │   └── utils/               \# Utility classes (e.g., DriverManager)
│       │       └── DriverManager.java
│       └── resources/
│           └── features/            \# Gherkin feature files
│               ├── cart.feature
│               └── login.feature
├── pom.xml                        \# Maven Project Object Model
├── results.txt                    \# Consolidated test results
└── README.md                      \# Project description

````

### How to Run the Tests

To run all API and UI tests, navigate to the project's root directory (`AutomationFinalProject`) in your terminal and execute the following Maven command:

```bash
mvn clean install
````

This command will:

1.  Clean the `target` directory.
2.  Compile the source and test code.
3.  Execute all configured API and UI tests.
4.  Generate reports.

### Test Results

A consolidated summary of the test execution results can be found in the `results.txt` file within the project's root directory. All tests covered by the project are expected to pass.

-----

## 🇬🇪 ქართული

### პროექტის მიმოხილვა

ეს რეპოზიტორი შეიცავს ჩემსსაუნივერსიტეტო საგნის **პროგრამული უზრუნველყოფის ტესტირების** ფინალურ პროექტს. პროექტი აჩვენებს პრაქტიკულ ავტომატიზაციის ტესტირების უნარებს API ტესტირების REST-assured-ის გამოყენებით და UI ტესტირების Selenium, Cucumber და Gherkin-ის კომბინაციით.

### პროექტის კომპონენტები

ეს პროექტი შედგება ორი ძირითადი ნაწილისგან:

1.  **API ტესტირება REST-assured-ით**

      * **მიზანი:** საჯარო REST API-ს ტესტირების ავტომატიზაცია `jsonplaceholder.typicode.com`-ის გამოყენებით.
      * **შესრულებული ამოცანები:**
          * `GET /posts`-ის ტესტირება: სტატუს კოდი 200-ის და პასუხში მინიმუმ 100 პოსტის შემოწმება.
          * `GET /posts/1`-ის ტესტირება: სტატუს კოდი 200-ის და `userId` 1-ის შემოწმება.
          * `POST /posts`-ის ტესტირება: სტატუს კოდი 201-ის და სწორი პასუხის სხეულის შემოწმება.
          * `PUT /posts/1`-ის ტესტირება: `title` ველის განახლების დადასტურება.
          * `DELETE /posts/1`-ის ტესტირება: სტატუს კოდი 200 ან 204-ის უზრუნველყოფა.
      * **ტექნოლოგიები:** REST-assured, TestNG.

2.  **UI ტესტირება Selenium, Cucumber და Gherkin-ით**

      * **მიზანი:** ვებ აპლიკაციის (`https://www.saucedemo.com/`) UI ტესტების ავტომატიზაცია.
      * **შესრულებული ამოცანები:**
          * წარმატებული შესვლა ვალიდური მონაცემებით.
          * წარუმატებელი შესვლა და შეცდომის შეტყობინების ვალიდაცია.
          * პროდუქტის კალათაში დამატება და მისი გამოჩენის შემოწმება.
          * გასვლის სრული პროცესი.
      * **ტექნოლოგიები:** Selenium WebDriver, Cucumber, Gherkin.
      * **საუკეთესო პრაქტიკები:** დანერგილია Page Object Model (POM) UI ელემენტებისთვის და გამოყენებულია `WebDriverManager` ბრაუზერის დრაივერის მართვისთვის. ტესტის ჩავარდნის შემთხვევაში სქრინშოთები ავტომატურად გადაიღება Cucumber Hooks-ის გამოყენებით.

### პროექტის სტრუქტურა

პროექტი ისეა სტრუქტურირებული, რომ ნათლად გაიმიჯნოს API და UI ტესტები, ასევე დამხმარე კლასები:

```
AutomationFinalProject/
├── src/
│   ├── main/
│   │   └── java/
│   └── test/
│       ├── java/
│       │   ├── api/                 # REST-assured API ტესტები
│       │   │   ├── DeletePostsTest.java
│       │   │   ├── GetPostsTest.java
│       │   │   ├── PostPostsTest.java
│       │   │   └── PutPostsTest.java
│       │   ├── ui/
│       │   │   ├── pages/           # Selenium Page Object Model კლასები
│       │   │   │   ├── LoginPage.java
│       │   │   │   └── ProductsPage.java
│       │   │   ├── runners/         # Cucumber TestNG გაშვების კლასები
│       │   │   │   └── TestRunner.java
│       │   │   └── steps/           # Cucumber-ის Step Definitions
│       │   │       ├── CartSteps.java
│       │   │       ├── Hooks.java
│       │   │       └── LoginSteps.java
│       │   └── utils/               # დამხმარე კლასები (მაგ., DriverManager)
│       │       └── DriverManager.java
│       └── resources/
│           └── features/            # Gherkin feature ფაილები
│               ├── cart.feature
│               └── login.feature
├── pom.xml                        # Maven-ის პროექტის ობიექტის მოდელი
├── results.txt                    # ტესტის შედეგების კონსოლიდირებული აღწერა
└── README.md                      # პროექტის აღწერა
```

### ტესტების გაშვება

ყველა API და UI ტესტის გასაშვებად, გადადით პროექტის ძირეულ საქაღალდეში (`AutomationFinalProject`) თქვენს ტერმინალში და გაუშვით შემდეგი Maven ბრძანება:

```bash
mvn clean install
```

ეს ბრძანება შეასრულებს:

1.  `target` საქაღალდის გასუფთავებას.
2.  კოდის კომპილაციას.
3.  ყველა კონფიგურირებული API და UI ტესტის გაშვებას.
4.  რეპორტების გენერირებას.

### ტესტის შედეგები

ტესტების გაშვების შედეგების კონსოლიდირებული შეჯამება შეგიძლიათ იხილოთ `results.txt` ფაილში, რომელიც პროექტის ძირეულ საქაღალდეში მდებარეობს. პროექტით დაფარული ყველა ტესტი მოსალოდნელია, რომ წარმატებით გაივლის.

