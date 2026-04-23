import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class AutoSugestiveDropdown {
    public static class DrpdownTest {
        WebDriver driver;

        @BeforeMethod
        public void setUp() {
            driver = new ChromeDriver();
        }

        @Test
        public void selectDropdown() throws InterruptedException {
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
            driver.manage().window().maximize();
            driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
            driver.findElement(By.id("autosuggest")).sendKeys("uru");
            Thread.sleep(2000);
            List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
            for(WebElement option:options){
                if(option.getText().equalsIgnoreCase("Uruguay")){
                    option.click();
                    break;
                }
            }
        }
    }
}
