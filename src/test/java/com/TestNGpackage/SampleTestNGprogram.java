package com.TestNGpackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import org.testng.reporters.XMLReporter;

import java.util.concurrent.TimeUnit;

public class SampleTestNGprogram {

   WebDriver driver;

    @BeforeTest
public void setup()
    {




        System.setProperty("webdriver.http.factory", "jdk-http-client");
         driver = new EdgeDriver();

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @Test
    public void titleTest()
    {
      String title=driver.getTitle();
      System.out.println("Title of the page is:"+title);
    }

    @AfterTest
    public void closeBrowser()
    {
        driver.close();
    }







}
