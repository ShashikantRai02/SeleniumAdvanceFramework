package com.thetestingacademy.tests.orangeHRM.pageObjects;


import com.thetestingacademy.POM.OrangeHRM.Admin;
import com.thetestingacademy.POM.OrangeHRM.OrangeHRMLoginPage;
import com.thetestingacademy.baseTest.CommonToAllTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Admins extends CommonToAllTest {

    WebDriver driver;// WebDriver instance for browser interaction
    Admin adminPage;// Page Object for Admin page

    @BeforeMethod
    public void setUp() {
        try {
            driver = new ChromeDriver(); // Initialize ChromeDriver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40000)); // Set implicit wait
            driver.get("https://awesomeqa.com/hr/web/index.php/auth/login"); // Navigate to the login page

            // Initialize the OrangeHRMLoginPage object and perform login
            OrangeHRMLoginPage loginPage = new OrangeHRMLoginPage(driver);
            loginPage.loginWithValidCreds("admin", "Hacker@4321"); // Replace with valid credentials

            // Initialize the Admin page object after login
            adminPage = new Admin(driver);
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up WebDriver or navigate to the URL: " + e.getMessage(), e);
        }
    }
    @Test
    public void testNavigateToAdminPage() {
        adminPage.clickonAdminTab(); // Click on the Admin tab
        // Add assertions to verify navigation to the Admin page
    }

    @Test
    public void testSearchUser() {
        adminPage.enterUsername("admin"); // Enter username
        adminPage.selectUserRole("Admin"); // Select User Role
        adminPage.enterEmployeeName("John Doe"); // Enter Employee Name
        adminPage.selectStatus("Enabled"); // Select Status
        adminPage.clickSearchButton(); // Click Search button
        // Add assertions to verify search results
    }

    @Test
    public void testResetFilters() {
        adminPage.clickResetButton(); // Click Reset button
        // Add assertions to verify filters are reset
    }

    @AfterMethod
    public void tearDown() {
        driver.quit(); // Close the browser
    }
}
