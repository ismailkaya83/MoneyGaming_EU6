package com.moneygaming.tests;

import com.moneygaming.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {

    // create driver object
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://moneygaming.qa.gameaccount.com/sign-up.shtml");
    }

    @Test
    public void test1() throws InterruptedException {
        WebElement nameBox = driver.findElement(By.cssSelector("#forename"));
        nameBox.sendKeys("Mike");
        WebElement surnameBox = driver.findElement(By.xpath("//input[@name='map(lastName)']"));
        surnameBox.sendKeys("Smith");
        Thread.sleep(5000);
    }

    @Test
    public void test2() throws InterruptedException {
        WebElement test = driver.findElement(By.cssSelector("a[href='/blackjack.shtml']"));
        test.click();
        Thread.sleep(3000);
    }



    @AfterMethod
    public void tearDown(){
        driver.close();
    }

}
