package base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {

    protected static WebDriver driver;

    public void startBrowser(String url) {

        WebDriverManager.edgedriver().setup();

        driver = new EdgeDriver();

        driver.manage().window().maximize();

        driver.manage().deleteAllCookies();

        driver.manage().timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(30));

        driver.get(url);
    }

    public void closeBrowser() {

        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}
