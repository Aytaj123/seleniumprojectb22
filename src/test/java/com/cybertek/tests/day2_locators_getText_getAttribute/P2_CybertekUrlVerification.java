package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
        // Cybertek practice tool verification:
        // set-up the browser driver
        WebDriverManager.chromedriver().setup();

        //open chrome browser
        WebDriver driver = new ChromeDriver();

        //maximize the page
        driver.manage().window().maximize();

        // go to https://practice.cybertek.com
        driver.get("https://practice.cybertek.com/");

        // verify URL contains
        //Expected: cybertekschool

        String expectedInUrl = "cybertekschool";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedInUrl) ) {
            System.out.println("Url verification PASSED!");
        } else {
            System.out.println("Url verification failed!");
        }

        // verify the title:
        // Expected: Practice
        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        if (actualTitle ==expectedTitle ) {
            System.out.println("Title Verification PASSED!");
        } else {
            System.out.println("Title Verification Failed!");
        }





    }
}
