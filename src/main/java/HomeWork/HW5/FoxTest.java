package HomeWork.HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLInputElement;

import java.time.Duration;
import java.util.List;

public class FoxTest {
    WebDriver driver;
    WebDriverWait webDriverWait;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver(){
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get("https://mister-fox.ru/catalog/10010/839740");
    }

    @Test
    void AbbAbbs() throws InterruptedException {
        List<WebElement> FoxList = driver.findElements(
                By.xpath("//*[@id=\"content-wrapper\"]/div/div[2]/div/div/div[2]/div[4]/div[2]/a"));
        FoxList.get(0).click();
        Thread.sleep(5000);

        Assertions.assertTrue(driver.getCurrentUrl().contains("catalog"));
    }

    @AfterEach
    void tearDown() {
        driver.manage().deleteAllCookies();
    }
}
