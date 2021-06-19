package com.cybertek.tests.day10_webtable_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigurationReader {

    //    Create object of Properties class
    private static Properties properties = new Properties();

    static {
//        Load the file into fileinputstream
        try {
            FileInputStream file = new FileInputStream("configuration.properties");

//        Load properties object with our file
            properties.load(file);

//            close the file
            file.close();

        } catch (IOException e) {
            System.out.println("File NOT found in the Configuration Properties");
        }
    }

    //    Use the above created logic to create a re-usable static method
    public static String getProperty(String keyword) {

        return properties.getProperty(keyword);
    }
}

