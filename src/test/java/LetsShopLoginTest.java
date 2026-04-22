import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LetsShopLoginTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void registerSite() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
        Assert.assertEquals(driver.findElement(By.cssSelector(".title")).getText(),"Practice Website for Rahul Shetty Academy Students");
        driver.findElement(By.xpath("//div/input[1]")).sendKeys("example@gmaol.com");
        driver.findElement(By.id("userPassword")).sendKeys("S!yu12345678");
        driver.findElement(By.xpath("//input[contains(@class,'btn')]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.tagName("h3")).getText(),"AUTOMATION");


    }


//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
