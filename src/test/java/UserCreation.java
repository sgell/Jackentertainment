import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;



            public class UserCreation {

                 @Test
                 void creation() throws InterruptedException {
                     // starting browser
                     WebDriver driver = new ChromeDriver();
                     driver.manage().window().maximize();
                     driver.get("https://jackentertainment.lv-stg.gameaccount.com/");

                     // wait until cookie appears
                     WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-reject-all-handler")));

                     // click on Reject cookie
                     driver.findElement(By.id("onetrust-reject-all-handler")).click();

                     // click Sign Up button
                     driver.findElement(By.cssSelector("a[data-qa='signup_btn']")).click();

                     // wait until register window appears
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[data-qa='signup_username']")));

                     // fill username
                     driver.findElement(By.cssSelector("input[data-qa='signup_username']")).sendKeys("ttpptt");

                     // fill email
                     driver.findElement(By.cssSelector("input[data-qa='signup_email']")).sendKeys("gpt@gtt.com");

                     // fill password
                     driver.findElement(By.cssSelector("input[data-qa='signup_password']")).sendKeys("12345A");

                    // click on get My Free Chips button
                     driver.findElement(By.cssSelector("button[data-qa='signup_submit_btn']")).click();


                     // checkbox
                     WebElement checkbox = driver.findElement(By.id("terms"));

                     // Scroll into view using JavaScript
                     ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkbox);
                     driver.findElement(By.cssSelector("label[data-qa='signup_checkbox']")).click();

                     WebElement continueBtn = driver.findElement(By.cssSelector("button[data-qa='signup_submit_btn']"));

                     //  click button
                     ((JavascriptExecutor) driver).executeScript("arguments[0].click();", continueBtn);

                     //click continue button
                     driver.findElement(By.cssSelector("button[type='submit']")).click();

                     //wait until welcome window appears
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#portal-root > div > div > div > div > div > div.lightbox-logo > img")));

                     // click on Let's Start button
                     driver.findElement(By.cssSelector("#portal-root > div > div > div > div > div > button")).click();

                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#__next > header > div > span")));
                     // click on my account button
                     driver.findElement(By.cssSelector("#__next > header > div > span")).click();

                     // click on Account History
                     driver.findElement(By.cssSelector("#__next > nav > ul > li:nth-child(6) > a")).click();

                     // wait until MY Account appears
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/div/section/div[1]/div[1]/div[3]/span")));

                     // click on bonus button
                     driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section/div[1]/div[1]/div[3]/span")).click();

                     // wait until bonus tab appears
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/div/section/div[3]/table/tbody/tr/td[5]")));

                     // verify below Amount value shows
                     boolean isDisplayed = driver.findElement(By.xpath("//*[@id=\"__next\"]/main/div/section/div[3]/table/tbody/tr/td[5]")).isDisplayed();
                     Assert.assertTrue(isDisplayed,"5,000");

                    // wait before browser been closed
                     wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"__next\"]/main/div/section/div[3]/table/tbody/tr/td[5]")));

                     // close the window
                       driver.quit();
                 }
             }