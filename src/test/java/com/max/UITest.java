package com.max;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import com.max.pages.LoginPage;
import org.openqa.selenium.By;

public class UITest extends BaseUITest {

    @Test
    void testGBNotEmailLogin() {
        driver.get("https://gb.ru/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("login");
        loginPage.enterPassword("password");
        loginPage.clickLoginButton();

        Assertions.assertFalse(driver.findElements(By.xpath("/html/body/div[2]/div[7]/div/form/div[1]/ul")).isEmpty());
    }

    @Test
    void testGBWithoutPassword() {
        driver.get("https://gb.ru/login");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("login@login.ru");
        loginPage.clickLoginButton();

        Assertions.assertFalse(driver.findElements(By.xpath("/html/body/div[2]/div[7]/div/form/div[2]/ul")).isEmpty());

    }
}
