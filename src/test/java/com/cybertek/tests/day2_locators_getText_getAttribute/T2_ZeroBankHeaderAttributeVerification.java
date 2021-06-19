package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankHeaderAttributeVerification {
    public static void main(String[] args) {
        // TC #2: Zero Bank link text verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");
        //LOCATE THE LINK AND STORE INSIDE OF WebElement
        WebElement zeroBankLink = driver.findElement(By.className("brand"));
        //3. Verify link text from top left:
        //Expected: “Zero Bank”
        String expectedLinkText = "Zero Bank";
        String actualLinkText = zeroBankLink.getText(); // we calling the web element above

        if (actualLinkText.equals(expectedLinkText) ) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }
        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        String expectedAttributeValue = "index.html";
        String actualAttributeValue = zeroBankLink.getAttribute("href");

        if (actualAttributeValue.contains(expectedAttributeValue) ) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }
        //System.out.println("actualAttributeValue = " + actualAttributeValue);
        
    }
}
