package AmazonPhone;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage {
    WebDriver driver;

    int timeoutSidebar = 3;

    By addToCartButtonSelector = By.id("add-to-cart-button");

    By noCoverageButtonSelector = By.cssSelector("#attachSiNoCoverage input");

    By cartSelector = By.cssSelector("#attach-sidesheet-view-cart-button");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }
    public ProductPage addToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(addToCartButtonSelector)).click();
        return this;
    }
    public ProductPage refuseInsurance() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(noCoverageButtonSelector)).click();
        return this;
    }
    public ProductPage openCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSidebar));
        wait.until(ExpectedConditions.elementToBeClickable(cartSelector)).click();
        return this;
    }
}
