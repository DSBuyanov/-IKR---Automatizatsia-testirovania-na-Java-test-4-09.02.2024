package com.max.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;

    private By usernameInput = By.xpath("//*[@id='user_email']");
    private By passwordInput = By.xpath("//*[@id='user_password']");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By errorMessage = By.xpath("//div[@class='form-error-message']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public boolean isErrorMessageVisible() {
        return !driver.findElements(errorMessage).isEmpty();
    }
}
