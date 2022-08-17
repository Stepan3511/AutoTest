package HomeWork.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeWork3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://mister-fox.ru/catalog/10010/839740");

        WebElement sSize = webDriver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/div/div[2]/div/div/div[2]/div[4]/div[2]/a"));
        sSize.click();



        Thread.sleep(5000);
        webDriver.quit();




    }

}
