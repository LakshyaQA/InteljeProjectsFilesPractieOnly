package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;
//import java.util.logging.FileHandler;

public class Frame {


    public static void main(String[] args) throws InterruptedException, IOException {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        //ops.setAcceptInsecureCerts(true);
        //ops.addArguments("--headless=chrome");

        System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");

        WebDriver driver = new ChromeDriver(ops);


                                                     //driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.get("https://www.edubridgeindia.com/");
        driver.manage().window().maximize();

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(file,new File( "C:/Users/sharm/Pictures/screen.png" ));










        /*Cookie nocookie = new Cookie( "company",  "edso services");//4
       driver.manage().addCookie(nocookie);//5
        Set<Cookie>cookies1 =driver.manage().getCookies();//1
        for (Cookie c : cookies1) {
            System.out.println(c);
        }
        driver.manage().deleteAllCookies();///2
        driver.manage().deleteCookieNamed("company");//3
        Set<Cookie>cookies2 =driver.manage().getCookies();//1
        for (Cookie c : cookies2) {

            System.out.println(c);
        }*/
        Thread.sleep( 5000);

        driver.close();

    }

        //System.out.println("After Selenium.Frame" + driver.findElement(By.xpath("//div[text()='Frames']")).getText());

        //Thread.sleep(5000);

    }
