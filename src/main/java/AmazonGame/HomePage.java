package AmazonGame;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
    WebDriver driver;
    int timeoutSearch = 15;

    By menu = By.cssSelector("#nav-hamburger-menu");
    By videoPlay = By.cssSelector("a[data-menu-id='12']");
    By allVideoPlay = By.cssSelector("#hmenu-content > ul.hmenu.hmenu-visible.hmenu-translateX > li:nth-child(3)");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public GameAndConsolesPage gameAndConsolesPage()   {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutSearch));

        wait.until(ExpectedConditions.elementToBeClickable(menu));
        driver.findElement(menu).click();

        wait.until(ExpectedConditions.elementToBeClickable(videoPlay));
        driver.findElement(videoPlay).click();

        wait.until(ExpectedConditions.elementToBeClickable(allVideoPlay));
        driver.findElement(allVideoPlay).click();

        GameAndConsolesPage  gamesAndConsolesPage = new GameAndConsolesPage(driver);
        return gamesAndConsolesPage;
    }
}