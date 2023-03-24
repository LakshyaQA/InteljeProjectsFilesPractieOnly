package Selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.util.List;

public class AutomateDrops {
    public static class seleni {
        public static void main(String[] args) throws InterruptedException {
            ChromeOptions ops;
            ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");

            System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");

            WebDriver driver = new ChromeDriver(ops);
           // driver.get("https://courses.letskodeit.com/practice");
           driver.get("https://selenium08.blogspot.com/2019/11/double-click.html");
            // driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
            driver.manage().window().maximize();
            /*WebElement elementA = driver.findElement(By.xpath("//li[text()='A']"));
            Actions actions = new Actions(driver);
            actions.clickAndHold(elementA).perform();*/
//double click
           // WebElement element = driver.findElement(By.xpath("//button[text()='Double-click me to see Alert message']"));

            //Actions actions = new Actions (driver); actions.doubleClick(element) .perform();



           // driver.findElement(By.xpath("//button[text()='X']")).click();

           /* Thread.sleep(5000);;

            Actions actions = new Actions (driver);

            actions.moveToElement(driver.findElement(By.id("autosuggest")))//"//input[@type='text']"

                    .click(driver.findElement(By.id("autosuggest")))

                    .keyDown(Keys.SHIFT)

                    .sendKeys("hello world")

                    .keyUp(Keys.SHIFT)

                    .build()

                    .perform();*/


            WebElement element = driver.findElement(By.xpath("//button[text() = 'Double-Click me to see Alert message']"));

            Actions actions  = new Actions(driver);
            actions.doubleClick(element).perform();

            Alert alert = driver.switchTo().alert();

            //System.out.println(alert.getText());

            alert.accept();

            Thread.sleep(1000);

            //Thread.sleep(5000);
            //WebElement element = driver.findElement(By.xpath("//span[text()='right click me']"));

            //Actions actions = new Actions (driver);
           // actions.contextClick(element).perform();

            //Actions actions = driver.findElement()
            //WebElement elementA;
            //actions.release(elementA).perform();

           /* WebElement dropDown = driver.findElement(By.id("carselect"));
            Select select = new Select(dropDown);
            select.selectByIndex(1);
            select.selectByValue("honda");
            select.selectByVisibleText("Benz");
            //select.deselectByIndex(("1"));
           // List<WebElement>getAllOption = select.getAllSelectedOptions();*/
            //driver.close();


        }
    }}