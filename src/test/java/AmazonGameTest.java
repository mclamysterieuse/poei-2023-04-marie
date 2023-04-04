import AmazonGame.GameAndConsolesPage;
import AmazonGame.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AmazonGame.ProductPage;
import AmazonGame.HomePage;

public class AmazonGameTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = new ChromeDriver();

        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        driver.findElement(By.id("sp-cc-accept")).click();
    }

//    @AfterMethod
//    public void teardown() {
//        driver.quit();
//        log.debug("Chrome was closed");
//    }

    @Test
    public void AddToCartPriceTest() {
        // Arrange
        String availableDate = "Cet article paraîtra le 12 mai 2023.";
        String expectedPrice = "54,99";

        // Act
        HomePage homePage = new HomePage(driver);
        ProductPage productPage = new ProductPage(driver);
        GameAndConsolesPage gameAndConsolesPage= new GameAndConsolesPage(driver);
        SearchResultPage searchResultPage = new SearchResultPage(driver);
        homePage.gameAndConsolesPage();
        searchResultPage.openResult();
        productPage.getAvailableDate();

        // Assert
        Assert.assertEquals(productPage.getAvailableDate(), availableDate);

    }

    }
