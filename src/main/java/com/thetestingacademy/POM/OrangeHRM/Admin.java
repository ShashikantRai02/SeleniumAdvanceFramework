package com.thetestingacademy.POM.OrangeHRM;

import com.thetestingacademy.base.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Admin extends CommonToAll {

    private WebDriver driver;

    // Locators for Admin page elements
    private By usernameField = By.xpath("//label[text()='Username']/following::input[1]");
    private By userRoleDropdown = By.xpath("//label[text()='User Role']/following::div[contains(@class, 'oxd-select-wrapper')]");
    private By employeeNameField = By.xpath("//label[text()='Employee Name']/following::input[1]");
    private By statusDropdown = By.xpath("//label[text()='Status']/following::div[contains(@class, 'oxd-select-wrapper')]");
    private By resetButton = By.xpath("//button[contains(normalize-space(),'Reset')]");
    private By searchButton = By.xpath("//button[text()=' Search ']");

    // Constructor
    public Admin(WebDriver driver) {
        this.driver = driver;
    }

    // Method to enter username
    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }
    public void clickonAdminTab(){
        driver.findElement(By.xpath("//ul/li[1]/a")).click();
    }

    // Method to select a value from the User Role dropdown
    public void selectUserRole(String role) {
        driver.findElement(userRoleDropdown).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='" + role + "']")).click();
    }

    // Method to enter employee name
    public void enterEmployeeName(String employeeName) {
        driver.findElement(employeeNameField).sendKeys(employeeName);
    }

    // Method to select a value from the Status dropdown
    public void selectStatus(String status) {
        driver.findElement(statusDropdown).click();
        driver.findElement(By.xpath("//div[@role='option' and text()='" + status + "']")).click();
    }

    // Method to click the Reset button
    public void clickResetButton() {
        driver.findElement(resetButton).click();
    }

    // Method to click the Search button
    public void clickSearchButton() {
        driver.findElement(searchButton).click();
    }
}