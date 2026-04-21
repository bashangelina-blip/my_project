import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.*;

import java.time.Duration;

public class OpenGoogleTest {
    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
    }

    @Test
    public void openGoogle() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name"))
                .sendKeys("standard_user");
        driver.findElement(By.name("password"))
                .sendKeys("secret_suce");
        driver.findElement(By.className("submit-button")).click();
        System.out.println(driver.findElement(By.cssSelector("h3[data-test='error']")).getText());

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



//<input class="input_error form_input"
//placeholder="Username"
//type="text" data-test="username"
//id="user-name"
// name="user-name"
//autocorrect="off"
//autocapitalize="none"
//value="">