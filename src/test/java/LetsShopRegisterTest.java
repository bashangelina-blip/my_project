import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LetsShopRegisterTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void registerSite() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/client/#/auth/login");
        driver.findElement(By.cssSelector(".login-wrapper-footer-text")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("firstName")).sendKeys("Lola");
        driver.findElement(By.id("lastName")).sendKeys("Lul");
        driver.findElement(By.id("userEmail")).sendKeys("example@gmaol.com");
        driver.findElement(By.id("userPassword")).sendKeys("S!yu12345678");
        driver.findElement(By.id("userMobile")).sendKeys("8909235678");
        driver.findElement(By.id("confirmPassword")).sendKeys("S!yu12345678");
        driver.findElement(By.cssSelector("input[type='checkbox']")).click();
        driver.findElement(By.cssSelector(".login-btn")).click();

    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

