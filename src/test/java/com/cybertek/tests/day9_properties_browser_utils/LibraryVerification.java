package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class LibraryVerification {
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
        username.sendKeys("student11@library");
        // 4.Enter password: “”
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword']") );
        password.sendKeys("tScBPCUr");
        // 5.Click to Login button
        WebElement libraryLoginButton = driver.findElement(By.xpath("//button[.='Sign in']") );
        libraryLoginButton.click();
        // 6.Print out count of all the links on landing page
         List<WebElement> allLinks =  driver.findElements(By.xpath("//body//a") );
        System.out.println("allLinks.size() = " + allLinks.size());
        // 7.Print out each link text on this page:
        for (WebElement each : allLinks) {
            System.out.println(each.getText());

        }

    }
}

// username password:
// student11@library tScBPCUr
// student12@library UC0LC9Hj
// student13@library zcVbvUWH
// librarian13@library 9rf6axdD
// Task#3:•Create a new class under ‘utilities’package named “LibraryUtilities”
// Move loginToLibrary method from the same java class to “LibraryUtilities”•
// Overcome the challenge so it works when you call from the other class.
