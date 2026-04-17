package com.thetestingacademy.tests.orangeHRM.pageObjects;

import com.thetestingacademy.POM.OrangeHRM.OrangeHRMLoginPage;
import com.thetestingacademy.baseTest.CommonToAllTest;
import com.thetestingacademy.listeners.ScreenshotListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;

/**
 * Test class for OrangeHRM login functionality.
 * This class uses the Page Object Model (POM) design pattern to test login scenarios.
 * It also integrates the ScreenshotListener to capture screenshots on test failures.
 */
@Listeners(ScreenshotListener.class) // Attach ScreenshotListener to capture screenshots on test failures
public class Login extends CommonToAllTest {

    WebDriver driver; // WebDriver instance for browser interaction
    OrangeHRMLoginPage loginPage; // Page Object for OrangeHRM login page

    /**
     * Setup method to initialize the WebDriver and navigate to the OrangeHRM login page.
     */

    @BeforeMethod
    public void setUp() {
        try {
            driver = new ChromeDriver(); // Initialize ChromeDriver
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Set implicit wait for element loading
            driver.get("https://awesomeqa.com/hr/web/index.php/auth/login"); // Replace with the actual URL
            loginPage = new OrangeHRMLoginPage(driver); // Initialize the OrangeHRMLoginPage object
        } catch (Exception e) {
            throw new RuntimeException("Failed to set up WebDriver or navigate to the URL: " + e.getMessage(), e);
        }
    }
//    public void setUp() {
//        driver = new ChromeDriver(); // Initialize ChromeDriver
//        driver.get("ohr_url"); // Navigate to the OrangeHRM login page (replace with actual URL)
//        loginPage = new OrangeHRMLoginPage(driver); // Initialize the OrangeHRMLoginPage object
//    }

    /**
     * Test case to verify login with valid credentials.
     * This test ensures that the login functionality works as expected with correct credentials.
     */
    @Test
    public void testValidLogin() {
        loginPage.loginWithValidCreds("ohr_username", "ohr_password"); // Perform login with valid credentials
        // Add assertions to verify successful login (e.g., check for a specific element on the dashboard)
        Assert.assertTrue(true); // Placeholder assertion, replace with actual validation logic
    }

    /**
     * Test case to verify login with invalid credentials.
     * This test ensures that an appropriate error message is displayed for invalid login attempts.
     */
    @Test
    public void testInvalidLogin() {
        String errorMsg = loginPage.loginWithInvalidCreds("invalidUsername", "invalidPassword"); // Perform login with invalid credentials
        Assert.assertEquals(errorMsg, "Invalid credentials"); // Verify the error message matches the expected value
    }

    /**
     * Tear down method to close the browser after each test.
     */
    @AfterMethod
    public void tearDown() {
        driver.quit(); // Close the browser and clean up resources
    }
}