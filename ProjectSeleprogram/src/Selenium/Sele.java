package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.lang.model.element.Element;
import java.util.List;

public class Sele {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");

        System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(ops) ;

        //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.get("https://studystream-live.zoom.us/j/86544980367#success");
       /* System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getPageSource());*/
        driver.manage().window().maximize();
        //driver.findElement(By.id("login1")).sendKeys("lakshyasharmaqa@gmail.com");
        //driver.findElement(By.id("password")).sendKeys("Lakshyaqa123@");
       // driver.findElement(By.name("proceed")).sendKeys("click");
       // WebElement element = driver.findElement(By.class("mbTuDeF1"));
        //element.click();
       /* List<WebElement> elements = driver.findElements(By.tagName("input")); //java collection making list -interface of collection can store duplicate values and stored in list
        for(WebElement e: elements) {
            System.out.println(e);

            List<WebElement> elementss = driver.findElements(By.tagName("lable"));
            for(WebElement ee : elementss){
                System.out.println(ee);
            }
        }*/
        WebElement element = driver.findElement(By.xpath("//div[text()='Launch Meeting']"));
        element.click();
        //WebElement elementer;
        //driver.findElement(By.cssSelector("class.mbTuDeF1")).click();
        //driver.findElement(By.xpath("//input[@class='mbTuDeF1']")).click();
        Thread.sleep(3000);
        //driver.close();locators
    }
}

