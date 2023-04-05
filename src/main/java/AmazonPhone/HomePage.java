package AmazonPhone;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    static WebDriver driver;

    int timeoutSearch = 10;
    By productBarSelector = By.cssSelector("#twotabsearchtextbox");
    By productResultSelector = By.cssSelector("#nav-search-submit-button");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public  SearchResultPage searchProduct(String productName) {
        driver.findElement(productBarSelector).sendKeys(productName + Keys.ENTER);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));
        wait.until(ExpectedConditions.elementToBeClickable(productBarSelector)).click();
        wait.until(ExpectedConditions.elementToBeClickable(productResultSelector)).click();
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        return searchResultPage;
    }
}
