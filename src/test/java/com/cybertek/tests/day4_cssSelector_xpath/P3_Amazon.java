package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_Amazon {
    public static void main(String[] args) {
        // TC #3: Amazon link number verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.amazon.com
        driver.get("https://www.amazon.com");
        //3. Enter search term (use cssSelector to locate search box)
        WebElement amazonSearchBar = driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"));
        amazonSearchBar.sendKeys("wooden spoon" + Keys.ENTER);
        //4. Verify title contains search term
        // Expected: amazon.com: wooden spoon
        String expectedTitle = "amazon.com: wooden spoon";
        String actualTitle = driver.getTitle();
        if (actualTitle.equals(expectedTitle) ) {
            System.out.println("PASSED!");
        } else {
            System.out.println("FAILED!!!");
        }
    }
}
