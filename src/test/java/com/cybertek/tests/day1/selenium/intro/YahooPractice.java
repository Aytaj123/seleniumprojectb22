package com.cybertek.tests.day1.selenium.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooPractice {
    public static void main(String[] args) {
        //  Yahoo Title Verification
        //1. Open Chrome browser
        // setup browser driver
        WebDriverManager.chromedriver().setup();
        //1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        //maximize our browser
        driver.manage().window().maximize();
        //2. Go to https://www.yahoo.com
        driver.get("https://www.yahoo.com");
        //3. Verify title:
        //Expected: Yahoo
        String expectedTitle = "Yahoo";
        System.out.println("expectedTitle = " + expectedTitle);

        //actual title
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle = " + actualTitle);

        //creating our verification
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Title is as expected. Verification Passed!");
        } else {
            System.out.println("Title is not as expected. Verification Failed!");
        }
        //closing the browser
        driver.close();



    }
}
