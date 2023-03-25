package Firstpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class Firsttest {

@Test   //testing framework
    public void testcase1() {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "C:/Users/sharm/Downloads/Compressed/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver(ops);
        driver.get("https://google.com/");
        driver.manage().window().maximize();
        driver.close();
        }
       @Test
        public void testcase2() throws InterruptedException {
           ChromeOptions ops;
           ops = new ChromeOptions();
           ops.addArguments("--remote-allow-origins=*");
           System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
           WebDriver driver = new ChromeDriver(ops);
           driver.get("https://www.abhibus.com/");
           driver.manage().window().maximize();
           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
           driver.findElement(By.id("source")).sendKeys("Pune");

           List<WebElement> Cities = driver.findElements(By.xpath("//ul[@id='ui-id-1']//child::li"));
           for(WebElement e : Cities){
               if(e.getText().equalsIgnoreCase("Pune")){
                   e.click();
                   break;
               }
           }
           driver.findElement(By.id("destination")).sendKeys("Chennai");
           List<WebElement> destiCities= driver.findElements(By.xpath("//ul[@id='ui-id-2']//child::li"));
           for(WebElement e : destiCities) {
               if (e.getText().equalsIgnoreCase("Chennai")) {
                   e.click();
                   break;
               }
           }
           driver.findElement(By.id("datepicker1")).click();
           String date ="25";
           List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//following::tbody/tr/td"));
           for(WebElement e : dates) {
               if (e.getText().equalsIgnoreCase(date)){
                   e.click();
                   break;
               }
           }
           driver.findElement(By.xpath("//a[text()='Search']")).click();

           Thread.sleep(300);
           //driver.close();
       }
}

