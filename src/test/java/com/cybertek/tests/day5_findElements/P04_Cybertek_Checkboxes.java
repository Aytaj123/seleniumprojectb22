package com.cybertek.tests.day5_findElements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P04_Cybertek_Checkboxes {
    public static void main(String[] args) {
        // Practice:	Cybertek	Checkboxes
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //1. Go	to	http://practice.cybertekschool.com/checkboxes
        driver.get("http://practice.cybertekschool.com/checkboxes");
        List<WebElement>listOfCheckboxes = driver.findElements(By.xpath("//body//a"));
        //2. Confirm	checkbox	#1	is	NOT	selected	by	default
        String listOfCheckbox1 = "";
        String listOfCheckbox2 = "";
        for (WebElement listOfCheckbox : listOfCheckboxes) {
            if (listOfCheckbox1.isEmpty()) {
                System.out.println("#1 IS NOT SELECTED BY DEFAULT!");
            }
        }
            //3. Confirm	checkbox	#2	is	SELECTED	by	default.

        //4. Click	checkbox	#1	to	select	it.
        //5. Click	checkbox	#2	to	deselect	it.
        //6. Confirm	checkbox	#1	is	SELECTED.
        //7. Confirm	checkbox	#2	is	NOT	selected.
    }
}
