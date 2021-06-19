package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class p6_xPathMultipleButtons {
    public static void main(String[] args) {
        // TC #6: XPATH LOCATOR practice
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to http://practice.cybertekschool.com/multiple_buttons
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //3. Click on Button 1
        WebElement button1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        button1.click();
        WebElement resultText = driver.findElement(By.xpath("//p[@id='result']"));
        //4. Verify text displayed is as expected:
        //Expected: “Clicked on button one!”
        String expectedText = "Clicked on button one!";
        String actualText = driver.getTitle();

    }
}
