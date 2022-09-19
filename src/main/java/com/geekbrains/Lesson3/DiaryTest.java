package com.geekbrains.Lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DiaryTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://diary.ru/user/login");
        webDriver.findElement(By.id("loginform-username")).sendKeys("spartalex");
        webDriver.findElement(By.id("loginform-password")).sendKeys("123456");

        webDriver.switchTo().frame(webDriver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
        webDriver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

        webDriver.switchTo().parentFrame();
        webDriver.findElement(By.id("login_btn")).click();

        Thread.sleep(5000);

        webDriver.quit();

    }
}
