package com.geekbrains.Lesson6;

import HomeWork.HW6.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tester {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://nest.testbirds.com/home/tester");
    }

    @Test

    void putDressToCart() throws InterruptedException {
        Thread.sleep(5000);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.emailField.sendKeys("Kovets Fan");
        loginPage.passwordField.sendKeys("stefano3511g40");
        loginPage.singInButton.click();
        Thread.sleep(5000);
        Assertions.assertTrue(driver.getCurrentUrl().contains("tester"));

    }

    @AfterEach

    void  killDriver() {
        driver.quit();
    }
}
