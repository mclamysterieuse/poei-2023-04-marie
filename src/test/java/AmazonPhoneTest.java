import AmazonPhone.CartPage;
import AmazonPhone.SearchResultPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import AmazonPhone.ProductPage;
import AmazonPhone.HomePage;

public class AmazonPhoneTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://www.amazon.fr");
        driver.manage().window().maximize();
        driver.findElement(By.id("sp-cc-accept")).click();
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    @Test
    public void PhoneAddToCartPriceTest() {
        // Arrange
        String productName = "iphone 13";
        String keyword =  "Apple iPhone 13 (128 Go) - Vert";

        // Act
        HomePage homePage = new HomePage(driver);
        ProductPage productPage= new ProductPage(driver);
        SearchResultPage  searchResultPage = new SearchResultPage(driver);
        CartPage cartpage = new CartPage(driver);
        homePage.searchProduct(productName);
        searchResultPage.openResult();
        productPage.addToCart();
        productPage.refuseInsurance();
        productPage.openCart();
        //Assert
        Assert.assertEquals(cartpage.getProductTitle(), keyword);
    }

}
