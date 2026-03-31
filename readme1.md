Framework Architecture
Your framework appears to follow a modular Page Object Model (POM) design pattern with the following components:  
Test Layer: Contains TestNG test classes that execute test cases.
Page Object Layer: Contains page classes representing the UI elements and actions for each page.
Utilities Layer: Includes helper classes for common functionalities like logging, screenshots, and WebDriver management.
Listeners: Implements TestNG listeners for retry logic, screenshots, and reporting.
Configuration Layer: Manages properties and profiles for different environments (local, CI, remote).
Reports: Generates Allure reports for test execution results.
Maven: Handles dependency management and build lifecycle.
<hr></hr>
OOP Concepts Used
Encapsulation:  
Page classes encapsulate WebDriver and page-specific methods.
Utility classes encapsulate reusable methods (e.g., DriverManager, ScreenshotListener).
Abstraction:  
Abstracts the complexity of WebDriver initialization and test execution.
Test classes focus on test logic, while page classes handle UI interactions.
Inheritance:  
Base classes (e.g., BaseTest) are extended by test classes to reuse common setup and teardown logic.
Polymorphism:  
Overriding methods in listeners or utility classes to customize behavior.
Example: Retry logic in RetryListener.
<hr></hr>
Example Diagram
You can create a diagram using tools like Lucidchart, Draw.io, or PlantUML. Below is a textual representation of the architecture:
Framework Architecture
-----------------------
+-------------------+       +-------------------+
|   Test Layer      |       |   Listeners       |
|-------------------|       |-------------------|
| TestNG Test Cases |<----->| RetryListener     |
|                   |       | ScreenshotListener|
+-------------------+       +-------------------+
         |
         v
+-------------------+
| Page Object Layer |
|-------------------|
| LoginPage         |
| DashboardPage     |
+-------------------+
         |
         v
+-------------------+
| Utilities Layer   |
|-------------------|
| DriverManager     |
| ScreenshotHelper  |
+-------------------+
         |
         v
+-------------------+
| Configuration     |
|-------------------|
| Profiles (local,  |
| ci, remote)       |
+-------------------+
         |
         v
+-------------------+
| Reporting         |
|-------------------|
| Allure Reports    |
+-------------------+
# Selenium Advance Framework

## Framework Architecture

This framework is designed using the Page Object Model (POM) pattern and integrates with TestNG, Maven, and Allure for test execution and reporting.

### Architecture Diagram

![Framework Architecture](path/to/your/diagram.png)

### Components

1. **Test Layer**:
    - Contains TestNG test classes.
    - Executes test cases using methods from the Page Object Layer.

2. **Page Object Layer**:
    - Represents UI elements and actions for each page.
    - Encapsulates WebDriver and page-specific methods.

3. **Utilities Layer**:
    - Includes helper classes for WebDriver management, logging, and screenshots.

4. **Listeners**:
    - Implements TestNG listeners for retry logic, screenshots, and reporting.

5. **Configuration Layer**:
    - Manages profiles for different environments (local, CI, remote).

6. **Reporting**:
    - Generates Allure reports for test execution results.

### OOP Concepts Used

1. **Encapsulation**:
    - Page classes encapsulate WebDriver and page-specific methods.
    - Utility classes encapsulate reusable methods.

2. **Abstraction**:
    - Abstracts the complexity of WebDriver initialization and test execution.

3. **Inheritance**:
    - Base classes (e.g., `BaseTest`) are extended by test classes to reuse common setup and teardown logic.

4. **Polymorphism**:
    - Overriding methods in listeners or utility classes to customize behavior.

### How to Use

1. Clone the repository.
2. Update the `testng.xml` file with the desired test classes.
3. Run the tests using Maven:
   ```bash
   mvn clean test

View the Allure report:
allure serve target/allure-results
Dependencies
Selenium: ${selenium.version}
TestNG: ${testng.version}
Allure: ${allure.version}
Log4j: ${log4j.version}
Apache POI: ${poi.version}
Commons IO: ${commons-io.version}

---

### Notes

1. Replace `path/to/your/diagram.png` with the actual path to your architecture diagram image.
2. Use tools like **PlantUML** or **Lucidchart** to create a professional diagram and export it as an image.
3. Ensure the `README.md` file is updated in the root of your project.
4. Make sure to include instructions for setting up the environment and running the tests for better usability.
5. Consider adding a section for contributing guidelines if you plan to allow contributions to the framework.
6. You can also include a section for known issues or future enhancements to provide clarity on the current state of the framework.
7. Make sure to keep the dependencies updated in your `pom.xml` file and reflect those versions in the README for consistency.
8. Consider adding badges for build status, code coverage, and other relevant metrics to enhance the visibility of the project's health.
9. Include a section for contact information or support channels if users have questions or need assistance with the framework.
   10. You can also add a section for frequently asked questions (FAQs) to address common issues or queries that users might have when using the framework.
   11. Consider adding a section for best practices or coding standards to ensure that contributors follow a consistent style when working on the framework.
   12. Make sure to keep the README concise and well-organized, using headings and bullet points to improve readability.
   13. Regularly update the README as the framework evolves to ensure that it remains accurate and helpful for users.
   14. Consider adding a section for license information if you plan to open-source the framework, specifying the terms under which others can use and contribute to it.
   15. You can also include a section for acknowledgments or credits to recognize contributors or resources that were instrumental in the development of the framework.
   16. Finally, ensure that the README is visually appealing and easy to navigate, using formatting and images effectively to enhance the user experience.