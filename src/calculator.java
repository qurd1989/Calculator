
import com.sun.javaws.util.JfxHelper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.*;
import sun.applet.Main;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.lang.String;
import java.util.concurrent.TimeUnit;


public class calculator  {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\abdiy\\Desktop\\Selenium folder\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.demo.guru99.com/v4/manager/Managerhomepage.php");
        //page new customer
        driver.findElement(By.xpath("//a[contains(.,'New Customer')]")).click();

        // Customer name
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("elmar abdiyev");
        //select radio box for male.
       /* System.out.println(driver.findElements(By.xpath("//input[@value='m']")).size());
        WebElement driver1 = driver.findElement(By.xpath("//input[@value='m']"));
        driver1.click();

        */
        //Select Box for female
        System.out.println(driver.findElements(By.xpath("//input[@value='f']")).size());
        WebElement driver2= driver.findElement(By.xpath("//input[@value='f']"));
        driver2.click();

        //Date of Birth
        driver.findElement(By.xpath("//input[contains(@id,'dob')]")).sendKeys("04/25/1989");

        // get address
        driver.findElement(By.name("addr")).sendKeys("1294 10th street ");

        //get City
        driver.findElement(By.name("city")).sendKeys("Brooklyn");

        //get State
        driver.findElement(By.name("state")).sendKeys("NEW YORK");

        //get PIN
        driver.findElement(By.name("pinno")).sendKeys("120397");

        //get Mobile Number
        driver.findElement(By.name("telephoneno")).sendKeys("3470292901");

        //get Email
        driver.findElement(By.name("emailid")).sendKeys("elmarabdiyev@yahoo.com");

        //get password
        driver.findElement(By.name("password")).sendKeys("123456");

        // Submit application
        WebElement submit = driver.findElement(By.name("sub"));
        submit.sendKeys();
        submit.click();



        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



    }
    
}