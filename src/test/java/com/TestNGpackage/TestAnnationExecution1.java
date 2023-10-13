package com.TestNGpackage;

import org.testng.annotations.*;

public class TestAnnationExecution1 {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("beforeSuite is executed");

    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("aftersuite is executed");

    }

    @BeforeTest
    public void beforetest(){
        System.out.println("beforetest is executed");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("aftertest is executed");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeclass is executed");
    }


    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMthod is executed");
    }

    @AfterMethod
    public void AfterMethod(){
        System.out.println("AfterMethod is executed");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass is executed");
    }
    @Test
    public void testMethod1(){
        System.out.println("testMethod executed1");
    }

    @Test
    public void testMethod2(){
        System.out.println("testMethod executed2");
    }
}
