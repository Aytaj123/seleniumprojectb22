package com.cybertek.tests.day7_alerts_iframes_windows;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class IframePractice {
    WebDriver driver;
    @BeforeClass
    public void setupClass() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //3. Go to: http://practice.cybertekschool.com/iframe
        driver.get("https://practice.cybertekschool.com/iframe");
    }
    @Test
    public void iframe_test() {
        //#1. changing to iframe by index
        // driver.switchTo().frame(0);
        // #2. locate as a web element to switch
        // we find and locate <iframe> web element from the web page
        //WebElement iframe = driver.findElement(By.xpath("//iframe[@class=tox-edit-area__iframe']"));
        // locating web element
        //WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        //driver.switchTo().frame(iframe);
        // #3. if <iframe> tag has id or name attribute, we can pass its attribute value as a String into
        // .switchTo().frame() method directly
        driver.switchTo().frame("mce_0_ifr");
        // locating web element text
        WebElement yourContentGoesHereText = driver.findElement(By.xpath("//p"));
        //4. Assert: “Your content goes here.” Text is displayed.
        Assert.assertTrue(yourContentGoesHereText.isDisplayed());
        driver.switchTo().parentFrame();
        // locating the header as a web element
        WebElement headerText = driver.findElement(By.xpath("//h3"));
        //5. Assert: “An iFrame containing the TinyMCE WYSIWYG Editor
        Assert.assertTrue(headerText.isDisplayed());
    }

}
