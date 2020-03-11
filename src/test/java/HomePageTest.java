import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertEquals;

public class HomePageTest extends BaseTest  {


        @Test
        public void titleTest() {

        driver.get("https://testkwidos.tk/");

        String title = driver.getTitle();
        Assert.assertEquals(title, "Kwidos");

        driver.quit();

    }


        @Test
        public void ServiceProviderRegistrationTest () throws InterruptedException {

        driver.get("https://testkwidos.tk/auth/register/contrcotr");


        Thread.sleep(4000);
        driver.findElement(By.cssSelector("[formcontrolname='firstName']")).sendKeys("azat");
        driver.findElement(By.cssSelector("[formcontrolname='laststName']")).sendKeys("zakuanov");
        driver.findElement(By.cssSelector("[formcontrolname='businessName']")).sendKeys("test pro");
        driver.findElement(By.cssSelector("[formcontrolname='phone']")).sendKeys("8183453434");
        driver.findElement(By.cssSelector("[formcontrolname='email']")).sendKeys("azat@testpro.io");
        driver.findElement(By.cssSelector("[formcontrolname='password']")).sendKeys("password");
        //p-checkbox[class='ng-dirty ng-touched ng-invalid'] .ui-checkbox-icon.ui-clickable
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("[class='col-lg-12 col-xs-12 col-md-12 checkbox-block'] p-checkbox")).click();
        driver.findElement(By.cssSelector("[type='submit']")).click();
    }

}
