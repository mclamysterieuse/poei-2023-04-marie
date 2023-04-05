package AmazonGame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

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