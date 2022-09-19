package HomeWork.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    WebDriver driver;
    WebDriverWait WebDriverWait;
    Actions actions;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
        PageFactory.initElements(driver, this);

    }

        @FindBy(id = "mui-1")
        public WebElement emailField;

        @FindBy(id = "mui-2")
        public WebElement passwordField;

        @FindBy(className = "sc-fEOsli gDEmYB")
        public WebElement singInButton;




}
