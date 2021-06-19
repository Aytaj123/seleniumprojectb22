package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P03_AppleTaskFindElements {
    public static void main(String[] args) throws InterruptedException {
        // 1.Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 2.Go to https://www.apple.com
        driver.get("https://www.apple.com");
        // 3.Click to iPhone
        //     0        1     2      3     4       5     6      7
        // apple logo, mac, ipad, iphone, watch , TV, music, support.
        // storing 9 web elements including apple logo and search box
        List<WebElement> headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        for (int eachLink = 0; eachLink < headerLinks.size()-1; eachLink++) {
            //System.out.println(headerLinks.get(eachLink).getText());
            headerLinks.get(eachLink).click();
            Thread.sleep(1000);
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
        }
        // 4.Print out the titles of the each page
        System.out.println("Current title in the page: " + driver.getTitle());
        // 5.Print out total number of links in each page
        List<WebElement> allLInks = driver.findElements(By.xpath("//body//a"));
        System.out.println("Total number of links in current page: " + allLInks.size());
        int linksWithNoText = 0;
        int linksWithText = 0;
        for (WebElement each : allLInks) {
            if (each.getText().isEmpty()) {
                linksWithNoText++;
            } else {
                linksWithText++;
            }
        }
        // 6.While in a each page:
        // a.Print out how many links missing total text
        System.out.println("Current page links with no text: " + linksWithNoText);
        // b.Print out how many total link
        System.out.println("Current page links with text: " + linksWithText);
    }
}
