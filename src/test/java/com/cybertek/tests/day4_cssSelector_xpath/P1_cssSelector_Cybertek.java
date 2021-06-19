package com.cybertek.tests.day4_cssSelector_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P1_cssSelector_Cybertek {

    public static void main(String[] args) {
        // TC #3: Practice Cybertek/ForgotPassword URL verification
        // 1.Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2.Go to http://practice.cybertekschool.com/forgot_password
        driver.get("https://practice.cybertekschool.com/forgot password");
        // 3. Locate the all web elements on the page using x-path and/or css locator only
        // a. home link
        WebElement homeLink = driver.findElement(By.cssSelector("a[class='nav-link']"));
        // b. forgot password header
        WebElement forgotPasswordHeader = driver.findElement(By.tagName("h2"));
        // c. "E-mail" text
        WebElement emailLabel = driver.findElement(By.cssSelector("[for='email']"));
        // d. E-mail input box
        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email']"));
        // e. "Retrieve the password" button
        WebElement retrievePasswordButton = driver.findElement(By.cssSelector("button[id='form_submit']"));
        // f. "Powered by Cybertek school" text
        WebElement poweredByText = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        // 4. Verify all web elements are displayed
        System.out.println("homeLink.isDisplayed() = " + homeLink.isDisplayed());
        System.out.println("forgotPasswordHeader.isDisplayed() = " + forgotPasswordHeader.isDisplayed());
        System.out.println("emailLabel.isDisplayed() = " + emailLabel.isDisplayed());
        System.out.println("inputEmail.isDisplayed() = " + inputEmail.isDisplayed());
        System.out.println("retrievePasswordButton.isDisplayed() = " + retrievePasswordButton.isDisplayed());
        System.out.println("poweredByText.isDisplayed() = " + poweredByText.isDisplayed());
                

    }
}
