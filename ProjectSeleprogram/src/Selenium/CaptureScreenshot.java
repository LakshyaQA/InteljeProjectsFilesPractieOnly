package Selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;

public class CaptureScreenshot {
    public static void main(String[] args) {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        //ChromeDriver driver = new ChromeDriver(ops);//ChromeDriver already have remoote driver claases hold variable for sc
        driver.get("https://google.com/");
        driver.manage().window().maximize();// maximise for full screenshot of window

        //FULL PAGE SCREENSHOT
        TakesScreenshot ts = (TakesScreenshot) driver;   //type casting
        //TakesScreenshot ts = driver;
        // if we create referance variable with chrome drriver class at Line 14
        //((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File src = ts.getScreenshotAs(OutputType.FILE);
        File trg = new File("I:/EDU BRIDGE/ScreenshotsAuto/homepage.png");
      //  FileUtils.copyFile(src, trg);
        driver.close();
    }
}

    //--------/sugegstion my ide else getting error cant throw expression

    /*private static class FileUtils {
        public static void copyFile(File src, File trg) {
}

   }*/











