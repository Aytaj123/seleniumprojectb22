package com.cybertek.tests.day5_findElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_findElementsPractice {
    public static void main(String[] args) throws InterruptedException {
        // TC #0: FIND ELEMENTS
        //1. Open Chrome browser
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
       // driver.manage().window().maximize();
        // if web element is located before 15 seconds, it will move on
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        // we need to create a locator that returns us all the links on the page
        // //body//a - - > this locator will return all the links on the page
        // we are storing all of the links that are returned by findElements method
        List<WebElement> listOfLinks =  driver.findElements(By.xpath("//body//a"));
        //3. Print out the texts of all links
        for (WebElement listOfLink : listOfLinks) {
            System.out.println(listOfLink.getText());
        }
        // iter + tab - > for each loop
        // fori - > for regular loop
        //4. Print out how many total link
        int numberOfLinks  = listOfLinks.size();
        System.out.println("numberOfLinks = " + numberOfLinks);
    }
}
