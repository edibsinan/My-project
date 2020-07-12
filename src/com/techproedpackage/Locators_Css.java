package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators_Css {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox=driver.findElement(By.cssSelector("input[type='email']"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordBox=driver.findElement(By.cssSelector("input[id='session_password']"));
        passwordBox.sendKeys("Test1234!");

        WebElement signinButton=driver.findElement(By.cssSelector("input[name='commit']"));
        signinButton.click();
    }
}
