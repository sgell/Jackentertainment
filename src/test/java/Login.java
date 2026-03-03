import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class Login {

        @Test
        void login ()throws InterruptedException{

                // open browser
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();
                driver.get("https://jackentertainment.lv-stg.gameaccount.com/");

                // wait until cookies appers
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-reject-all-handler")));

                // accept cookies
                driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

                //press login button
                driver.findElement(By.xpath("//*[@id=\"Header_loginBtn__HhRS_\"]")).click();

               // wait until login window appears
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));

                // fill username
                driver.findElement(By.name("email")).sendKeys("ttptt");

                // fill password
                driver.findElement(By.id("password")).sendKeys("12345A");

                // press login button
                driver.findElement(By.xpath("//*[@id=\"portal-root\"]/div/div/div/div/div/div[2]/form/button[2]")).click();

                //wait until user is logged and verifying PlayJack logo appears before close the window
                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__next > header > a.Header_logo__Jboal > img")));

                // close the window
                 driver.quit();

        }
}



