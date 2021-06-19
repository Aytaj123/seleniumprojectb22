package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomePractice {
    // Task#1: Library software link verification
    // 1.Open browser
    WebDriver driver;
    @BeforeMethod
    public void setupMethods() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2.Go to website: http://library2.cybertekschool.com/login.html
        driver.get("https://library2.cybertekschool.com/login.html");
    }
    @Test
    public void library_verification_test() {
        // 3.Enter username: “”
        WebElement username = driver.findElement(By.xpath("//input[@id='inputEmail']") );
        // 4.Enter password: “”
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword']") );
        // 5.Click to Login button
        WebElement libraryLoginButton = driver.findElement(By.xpath("//button[.='btn btn-lg btn-primary btn-block']") );
        // 6.Print out count of all the links on landing page
        int count;
        //for (int i = 0; i < count.size(); i++) {

        }
    }

    // 7.Print out each link text on this page:
    // username password:
    // student11@library tScBPCUr
    // student12@library UC0LC9Hj
    // student13@library zcVbvUWH
    // librarian13@library 9rf6axdD
    // Task#2:•Create a method called loginToLibrary in the same java class with the @Test
    // This method simply logs in to Library app when you call it.
    // Task#3:•Create a new class under ‘utilities’package named “LibraryUtilities”
    // Move loginToLibrary method from the same java class to “LibraryUtilities”•
    // Overcome the challenge so it works when you call from the other class.

