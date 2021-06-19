package com.cybertek.tests.day1.selenium.intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1 - setup new browser
        WebDriverManager.chromedriver().setup();
        // 2 - create instance of selenium web driver. This line opens the browser.
        WebDriver driver = new ChromeDriver();
        // 3 - get the page
        driver.get("https://www.tesla.com");
        System.out.println("Current title = " + driver.getTitle());
        String currentUrl = driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);
        //putting 3 sec of wait / stops the code for 3 seconds
        Thread.sleep(3000);
        // going back by using navigations
        driver.navigate().back();
        //going forward using navigations
        driver.navigate().forward();
        //putting 3 sec of wait / stops the code for 3 seconds
        Thread.sleep(3000);
        // refreshing the page using navigator
        driver.navigate().refresh();
        //putting 3 sec of wait / stops the code for 3 seconds
        Thread.sleep(3000);
        // going to another URL using .to () method
        driver.navigate().to("https://www.google.com");

        System.out.println("Current title = " + driver.getTitle());
        System.out.println("currentUrl = " + currentUrl);

        //this line will basically maximize the browser size
        driver.manage().window().maximize();
        //works only for MAC
        //driver.manage().window().fullscreen();

        //this method will close the currently opened browser
        //it will close only 1 browser or 1 tab
        driver.close();







    }
}
