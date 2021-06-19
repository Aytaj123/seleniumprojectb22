package com.cybertek.tests.day10_webtable_properties;

import com.cybertek.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TableTasks extends TestBase {


    @Test
    public void tableTask() {
        String URL = ConfigurationReader.getProperty("dataTablesURL");
        //WebDriver driver = null;
        driver.get(URL);
        WebElement timsDueAmountCell = driver.findElement(By.xpath(""));
        System.out.println("timsDueAmountCell.getText() = " + timsDueAmountCell.getText());

        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult = "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult);
    }


    @Test
    public void task4_verify_order_method() {
        String URL = ConfigurationReader.getProperty("dataTablesURL");


    }



    //Practice #5: Method: printNamesAndEmails
    //• Create a method named printNamesAndEmails in TableUtils class.
    //• Method takes WebDriver object.
    //• This method should simply print all the names and emails in the table
    //• Create a new TestNG test to test if the method is working as expected.
    //• Output should be like:
    //• Name1: name , Email1: email
    //• Name2: name , Email2: email
    //Use of the methods:
    //1. Create a new class
    //2. Create new Tests
    //3. Read URL using ConfigurationReader.getProperty
    //4. Test if the utility methods are working as expected.
}
