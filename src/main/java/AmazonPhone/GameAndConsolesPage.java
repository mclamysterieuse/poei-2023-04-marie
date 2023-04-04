package AmazonPhone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GameAndConsolesPage{

    WebDriver driver;
    int timeoutSearch = 3;
    By productSelector =  By.cssSelector("div.a-section.a-spacing-none.a-spacing-top-small.s-title-instructions-style > h2 > a > span");

    public GameAndConsolesPage(WebDriver driver) {
        this.driver = driver;
    }

    public String openGameAndConsolePage() {
        return driver.findElement(productSelector).getText();
    }

}