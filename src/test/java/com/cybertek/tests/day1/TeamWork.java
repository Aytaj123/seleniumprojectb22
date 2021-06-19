package com.cybertek.tests.day1;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TeamWork {
    WebDriver driver;
    // i'm on the car entities
    // i'm clicking on the page to see all vehicles
    // and then, i'm clicking on any car on the grid
    // so, now, i'm able to see a car information
    // i'm on car information page
    // i'm clicking on "Add Events"
    // and should be able to add car information:
    // adding a title
    // adding description
    // adding color
    // adding guests
    // adding reminders
    // clicking save
    // clicking on "Activities"
    // and able to see a new added car information on the car list
    // i'm on a car list page
    // clicking on the username
    // clicking on the configuration option
    // and should see a configuration page
    // should be able to un-select all the "Use System" checkboxes
    // click on reset button
    // and see a confirmation message
    // be able to click on the OK button
    // click on "Save settings"
    // and finally, should see the message "Configuration saved"

    @BeforeMethod
    public void setupMethods() {
        // 1. given i am a truck driver
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        // 2.Go to website: http://qa3.vytrack.com
        driver.get("https://qa3.vytrack.com");
    }
    @Test
    public void vehicles_login_test() throws InterruptedException {
        // 3.Enter username: “”
        WebElement username = driver.findElement(By.xpath("//input[@id='prependedInput']"));
        username.sendKeys("user174");
        // 4.Enter password: “”
        WebElement password = driver.findElement(By.xpath("//input[@id='prependedInput2']"));
        password.sendKeys("UserUser123");
        // 5.Click to Login button
        WebElement libraryLoginButton = driver.findElement(By.xpath("//button[.='Log in']"));
        libraryLoginButton.click();
        Thread.sleep(1000);
        // i'm not on a dashboard page
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }
    @Test
    public void fleet_test() {
        // i'll mouse over on drop down Fleet menu
        WebElement fleet = driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[1]/a/span") );
        Actions action = null;
        action.moveToElement(fleet).perform();
    }
    @Test
    // and click on vehicles
    public void clickOnVehicle() throws InterruptedException {
        WebElement vehiclesOption = driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']") );
        vehiclesOption.click();

        Thread.sleep(3000);
        String expectedTitle = "Car - Entities - System - Car - Entities - System";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
    }

            }


