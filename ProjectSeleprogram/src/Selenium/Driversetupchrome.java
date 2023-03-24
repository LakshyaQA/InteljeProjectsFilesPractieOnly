package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driversetupchrome {
    public static void main(String[] args) {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops) ;
        driver.get("https://google.com/");
        driver.manage().window().maximize();
    }
}
