import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HerokuAppExampleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Forgot Password")).click();
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("example@gmail.com");
        driver.findElement(By.cssSelector("i.icon-signin")).click();
    }

//    @AfterMethod
//    public void tearDown() {
//        if (driver != null) {
//            driver.quit();
//        }
//    }
}

//    @AfterMethod
//    public void tearDown() {
//        driver.quit();
//    }

