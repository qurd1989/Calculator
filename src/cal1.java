import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.awt.*;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;



public class cal1 {



    cal1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\abdiy\\Desktop\\Selenium folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

         /*
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\abdiy\\Desktop\\Selenium folder\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


          */


        driver.get("https://www.callicoder.com/java-arraylist/");


    }

}
