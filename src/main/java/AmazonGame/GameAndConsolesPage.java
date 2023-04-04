package AmazonGame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class GameAndConsolesPage{

    WebDriver driver;
    int timeoutSearch = 3;
    By bestSellerSelector = By.cssSelector("[cel_widget_id='handsfree-browse_OctopusBestSellerAsin'] li .a-color-base");

    public GameAndConsolesPage(WebDriver driver) {
        this.driver = driver;
        }

    public String openGameAndConsolePage() {
        return driver.findElement(bestSellerSelector).getText();
    }

}