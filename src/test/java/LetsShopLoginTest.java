import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
    public void registerSite() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
        driver.findElement(By.xpath("//div/input[1]")).sendKeys("example@gmaol.com");
        driver.findElement(By.id("userPassword")).sendKeys("S!yu12345678");
        driver.findElement(By.xpath("//input[contains(@class,'btn')]")).click();


    }


//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}
