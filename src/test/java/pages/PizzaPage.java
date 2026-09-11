package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PizzaPage {

    private WebDriver driver;
    private WebDriverWait wait;

    public PizzaPage(WebDriver driver) {

        this.driver = driver;

        wait = new WebDriverWait(
                driver,
                Duration.ofSeconds(15)
        );

        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[contains(.,'Pizza')]")
    private WebElement pizzaMenu;

    public void clickPizzaMenu() {
        pizzaMenu.click();
    }
}
