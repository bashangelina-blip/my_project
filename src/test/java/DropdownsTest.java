import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DropdownsTest {
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
            WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
            Select dropdown = new Select(staticDropdown);
            dropdown.selectByIndex(3);
            Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "USD");
            dropdown.selectByVisibleText("AED");

            driver.findElement(By.id("divpaxinfo")).click();
            for(int i =0; i<4; i++){
                driver.findElement(By.id("hrefIncAdt")).click();
            }
            driver.findElement(By.id("btnclosepaxoption")).click();

            driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
            driver.findElement(By.xpath("//a[@value = 'BHO']")).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath("//div[@id = 'ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value = 'JAI']")).click();



        }
    }
}