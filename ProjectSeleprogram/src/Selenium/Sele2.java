import ss.WebDriver;

public class Sele {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver" , " C:/Users/sharm/IdeaProjects/Homework/chromedriver.exe");
        WebDriver driver = new ChromeDriver();  //Important  //upcasting in Java
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

}
