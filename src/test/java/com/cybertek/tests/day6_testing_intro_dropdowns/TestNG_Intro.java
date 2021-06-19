package com.cybertek.tests.day6_testing_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {
    @BeforeClass
    public void setupClass() {
        System.out.println("Before Class is running");
    }
    @AfterClass
    public void tearDownClass() {
        System.out.println("After class is running");
    }
    @BeforeMethod
    public void setupMethod() {
        System.out.println("---> Before method is running");
    }
    @AfterMethod
    public void afterMethod() {

    }

    @Test (priority = 1)
    public void test1() {
        System.out.println("Running Test 1");
        String actual = "apple";
        String expected = "apple";

        Assert.assertEquals(actual,expected);
    }
    @Test (priority = 2)
    public void test2() {
        System.out.println("Running Test 2");
        String actual = "apple";
        String expected = "apple";
        Assert.assertTrue(actual.equals(expected));
    }

}
