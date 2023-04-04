package AmazonPhone;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResultPage {
    WebDriver driver;

    By productResultSelector = By.cssSelector("div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span");

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