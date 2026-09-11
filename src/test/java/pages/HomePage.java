package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    public HomePage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );

        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "input")
    private WebElement locationInput;

    public void enterLocation(String location) {

        locationInput.clear();
        locationInput.sendKeys(location);
    }
}