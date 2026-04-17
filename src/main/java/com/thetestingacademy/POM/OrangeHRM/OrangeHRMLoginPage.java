package com.thetestingacademy.POM.OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrangeHRMLoginPage {

    private WebDriver driver;

    // Locators for username, password, and login button
    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("//button[@type = 'submit']");
    private By errorMessage = By.cssSelector("p[class *= 'content-text']");

    // Constructor
    public OrangeHRMLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    // Method to perform login with valid credentials
    public void loginWithValidCreds(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    // Method to perform login with invalid credentials and return error message
    public String loginWithInvalidCreds(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
        try{
            Thread.sleep(2000);
        }catch (Exception e){}
        return driver.findElement(errorMessage).getText();
    }
}