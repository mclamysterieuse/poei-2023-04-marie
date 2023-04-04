package AmazonGame;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    WebDriver driver;

    int timeoutSidebar = 3;
    int timeoutConfirmation = 5;

    By productSelector =  By.cssSelector("[cel_widget_id='handsfree-browse_OctopusBestSellerAsin'] li .a-color-base");
    By availableDateSelector = By.cssSelector("#availability > span");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getPrice() {
        return driver.findElement(productSelector).getText();
    }

    public String getAvailableDate() {
        return driver.findElement(availableDateSelector).getText();
    }
}