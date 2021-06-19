package com.cybertek.tests.day9_properties_browser_utils;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Library2 {
    // Task#2:•Create a method called loginToLibrary in the same java class with the @Test
    // This method simply logs in to Library app when you call it.
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
    public void loginLibrary() {

        // 3.Enter username: “”
        WebElement username = driver.findElement(By.xpath("//input[@id='inputEmail']") );
        username.sendKeys("student11@library");
        // 4.Enter password: “”
        WebElement password = driver.findElement(By.xpath("//input[@id='inputPassword']") );
        password.sendKeys("tScBPCUr");
        // 5.Click to Login button
        WebElement libraryLoginButton = driver.findElement(By.xpath("//button[.='Sign in']") );
        libraryLoginButton.click();
    }
}
