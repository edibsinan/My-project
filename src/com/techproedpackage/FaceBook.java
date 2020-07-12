package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.facebook.com/");

        WebElement email=driver.findElement(By.cssSelector("#email"));
        email.sendKeys("deneme");
        WebElement password=driver.findElement(By.cssSelector("input#pass"));
        password.sendKeys("12345");
        //login button
        driver.findElement(By.id("u_0_b")).click();

        driver.findElement(By.xpath("//a[@class='_42ft _4jy0 signup_btn _4jy4 _4jy2 selected _51sy']")).click();
//gender
        driver.findElement(By.cssSelector("#u_0_7")).click();
    }
}
