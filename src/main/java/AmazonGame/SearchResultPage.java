package AmazonGame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;

    By productResultSelector = By.cssSelector("[cel_widget_id='handsfree-browse_OctopusBestSellerAsin'] li .a-color-base");

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProductPage openResult() {
        WebElement Results = driver.findElement(productResultSelector);
        Results.click();
        ProductPage productPage = new ProductPage(driver);
        return productPage;
    }
}
