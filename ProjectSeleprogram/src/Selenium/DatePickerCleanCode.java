package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;
import java.util.List;

public class DatePickerCleanCode {

    public static WebDriver driver;

    public static void selectSourceOrDestination(String sourceOrDestination,String city) {
        List<WebElement> cities = null;
        if(sourceOrDestination.equalsIgnoreCase("source")){
            driver.findElement(By.id("source")).sendKeys("city");
            List<WebElement> Cities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
            /*for(WebElement e : Cities){
                if(e.getText().equalsIgnoreCase("city")){
                    e.click();
                    break;
                }
            }*/
        }
        else if (sourceOrDestination.equalsIgnoreCase("destination")) {
            driver.findElement(By.id("destination")).sendKeys("Chennai");
           cities = driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
        }
            for (WebElement e : cities) {
                if (e.getText().equalsIgnoreCase("Chennai")) {
                    e.click();
                    break;
                }
            }
    }
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
        driver = new ChromeDriver(ops);
        driver.get("https://www.abhibus.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));

        driver.findElement(By.id("datepicker1")).click();
        String date = "25";
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::tbody/tr/td"));
        for (WebElement e : dates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
        driver.findElement(By.xpath("//a[text()='Search']")).click();

        Thread.sleep(3000);
        //driver.close();


    }
}

