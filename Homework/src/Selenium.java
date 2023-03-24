import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , " C:/Users/sharm/IdeaProjects/Homework/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
    }
}
