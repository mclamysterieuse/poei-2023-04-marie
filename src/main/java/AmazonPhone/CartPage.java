package AmazonPhone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CartPage {
    WebDriver driver;
    By productSelector =  By.cssSelector("span.a-truncate-cut");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductTitle() {
        return driver.findElement(productSelector).getText();
    }
}
