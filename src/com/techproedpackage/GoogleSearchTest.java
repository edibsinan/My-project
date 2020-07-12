package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GoogleSearchTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/?hl=en");

        WebElement searchBox=driver.findElement(By.name("q"));
        searchBox.sendKeys("porcelain teapot");
        searchBox.submit();

        WebElement searchResult=driver.findElement(By.id("result-stats"));
        System.out.println("RESULT : "+searchResult.getText());

       driver.findElement(By.partialLinkText("Shopping")).click();
       //Same result
//       WebElement shopping=driver.findElement(By.partialLinkText("Shopping"));
//       shopping.click();

        driver.findElement(By.className("xsRiS")).click();
//        driver.findElement(By.xpath("//span[@aria-label='Visit site of Mustshop']")).click();



    }
}
