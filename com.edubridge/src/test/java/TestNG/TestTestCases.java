package TestNG;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestTestCases {


@Test   //testing framework
        public void firsttestcase1() {
            ChromeOptions ops;
            ops = new ChromeOptions();
            ops.addArguments("--remote-allow-origins=*");
            System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
            WebDriver driver = new ChromeDriver(ops);
            driver.get("https://google.com/");
            driver.manage().window().maximize();
            driver.close();
        }
}
