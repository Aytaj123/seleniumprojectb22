package com.cybertek.tests.day5_findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC02_FindElements {
    public static void main(String[] args) {
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3.Click to iPhone
        driver.findElement(By.className("ac-gn-link ac-gn-link-iphone")).click();
        // 4.Print out the texts of all links
        // 5.Print out how many link is missing text
        // 6.Print out how many link has text
        // 7.Print out how many total link
    }
}
