import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Attributes {
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
            driver.get("https://www.spicejet.com/");
            Assert.assertFalse(driver.findElement(
                    By.xpath("//div[.//div[text()='Senior Citizen'] and @data-focusable='true']")).isSelected());

            System.out.println(driver.findElement(By.xpath
                    ("//div[contains(@data-testid, 'return-date')]")).getDomAttribute("style"));
            driver.findElement(By.xpath
                            ("//div[contains(@data-testid, 'return-date')]")).click();
            System.out.println(driver.findElement(By.xpath
                    ("//div[contains(@data-testid, 'return-date')]")).getDomAttribute("style"));
            if(driver.findElement(By.xpath
                    ("//div[contains(@data-testid, 'return-date')]")).getDomAttribute("style").contains("rgb")){
                Assert.fail();
            }
            else{
                Assert.assertTrue(true);
            }
            }


//

        }
    }

