package com.cybertek.tests.day5_findElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TC0_FindElements {
    public static void main(String[] args) {
        // 1.Open Chrome browser
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        //WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2.Go to https://www.merriam-webster.com/
        driver.get("https://www.merriam-webster.com/");
        List<WebElement> listOfLinks = driver.findElements(By.xpath("//body//a"));
        // 3.Print out the texts of all links
        // 4.Print out how many link is missing text
        int countOfLinksWithoutTexts = 0;
        int countOfLinksWithTexts = 0;
        for (WebElement each : listOfLinks) {
            System.out.println(each.getText());
            if (each.getText().isEmpty()) {
                countOfLinksWithoutTexts++;
            } else {
                countOfLinksWithTexts++;
            }
        }
        System.out.println("# of links without texts: " + countOfLinksWithoutTexts);
        System.out.println("# of links with texts: " + countOfLinksWithTexts);
        // 5.Print out how many link has text
        // 6.Print out how many total link
        System.out.println(listOfLinks.size());
    }
}
