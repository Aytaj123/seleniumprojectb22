package com.cybertek.tests.day8_java_faker;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MultipleWindowsPractice {
    //3. Copy paste the lines from below into your class
    //4. Create a logic to switch to the tab where Etsy.com is open
    //5. Assert: Title contains “Etsy”
    //Lines to be pasted:
    WebDriver driver;
    @BeforeClass
    public void MultipleWindowTest() {
        // TC-6 : Window Handle practice
        //1. Create new test and make set ups
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2. Go to : https://www.amazon.com
        driver.get("https://www.amazon.com");
    }
    @Test
    public void multiple_windows_test() {
        ((JavascriptExecutor) driver).executeScript("window.open('https://google.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://etsy.com','_blank');");
        ((JavascriptExecutor) driver).executeScript("window.open('https://facebook.com','_blank');");

        for (String each : driver.getWindowHandles() ) {
            driver.switchTo().window(each);
            System.out.println("Title in current page: " + driver.getTitle());

            if (driver.getTitle().contains("Etsy") ) {
                Assert.assertTrue(driver.getTitle().contains("Etsy"));
                break;
            }
        }
        
        
        
        
        
        
        
        

    }
}
