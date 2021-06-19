package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndTitleVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // go to https://www.google.com
        driver.get("https://www.google.com");

        //click to gmail from top right
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("Mail")).click();


        //verify title contains:
        // Expected: Gmail
        String expectedInTitle = "Gmail";
        String actualTitle = driver.getTitle();

        if (actualTitle.contains(expectedInTitle) ) {
            System.out.println("Title Verification PASSED!");
        } else {
            System.out.println("Title Verification FAILED!");
        }

        // go back to Google by using the .back();
        driver.navigate().back();

        // verify title equals:
        // expected: Google
        String expectedGoogleTitle = "Google";
        String actualGoogleTitle = driver.getTitle();

        if (actualGoogleTitle.equals(expectedGoogleTitle) ) {
            System.out.println("Title Verification PASSED!");
        } else {
            System.out.println("Title Verification FAILED!!");
        }







    }
}
