package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_WebOrdersLogin {
    public static void main(String[] args) {
        // 1-Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
      //  driver.manage().window().maximize();
        // 2-Go to: http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");
        // 3-Verify title equals:
        // Expected: Web Orders Login
        String expectedTitle = "Web Orders Login";
        String actualTitle = driver.getTitle();
        // 4-Enter username: Tester
        WebElement inputUsername = driver.findElement(By.id("ct100_MainContent_username"));
        inputUsername.sendKeys("Tester");
        // 5-Enter password: test
        WebElement inputPassword = driver.findElement(By.id("ct100_MainContent_password"));
        inputPassword.sendKeys("test");
        // 6-Click “Sign In” button
        WebElement loginButton = driver.findElement(By.id("ct100_MainContent_login_button"));
        loginButton.click();
        // 7-Verify title equals:
        // Expected: Web Orders
        String expectedHomePageTitle = "Web Orders";
        String actualHomePageTitle = driver.getTitle();

        if (actualHomePageTitle.equals(expectedHomePageTitle) ) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }

    }
}
