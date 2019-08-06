
import com.sun.javaws.util.JfxHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.*;
import sun.applet.Main;

import javax.swing.*;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.lang.String;



public class calculator  {


    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\abdiy\\Desktop\\Selenium folder\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.edureka.co/");



    }
    
}





