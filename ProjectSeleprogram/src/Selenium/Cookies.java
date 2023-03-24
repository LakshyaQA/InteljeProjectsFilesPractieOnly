package Selenium;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Set;

public class Cookies {
    public static void main(String[] args) {
        ChromeOptions ops;
        ops = new ChromeOptions();
        ops.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver", "G:/selinium/chromedriver_win32/chromedriver.exe/");
        WebDriver driver = new ChromeDriver(ops) ;
        driver.get("https://google.com/");

        //capturing cookies frm browser
        Set<Cookie> cookies = driver.manage().getCookies();
        //storing Cokkies from browser in Variable"cookies".
        System.out.println(cookies.size()); //output:cokiies captured is 4.findind size of cookie

        //printing cookies from browser using for each loop
        for (Cookie cookie:cookies)
              {
                  System.out.println(cookie.getName()+cookie.getValue()+cookie.getExpiry());
        }
        //add cookiiie to browser.
        Cookie obj=new Cookie("myCookie","123456");
        driver.manage().addCookie(obj);
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size()); //should be 5 as previous size was 4

        /*//delete specefic cookie
        driver.manage().deleteCookie(obj);
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());//size decreased as cookie deleted
        //delete with name
        driver.manage().deleteCookieNamed("mycookie");
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());//value didnt decreased*/
        //delete al cokieis
        driver.manage().deleteAllCookies();
        cookies=driver.manage().getCookies();
        System.out.println(cookies.size());
         //driver.close();


    }


}
