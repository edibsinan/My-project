package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators_xpath {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

        WebElement emailBox=driver.findElement(By.xpath("html/body/div/div/div/div/form/div[1]/input"));
        emailBox.sendKeys("testtechproed@gmail.com");

        WebElement passwordText=driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));
        passwordText.sendKeys("Test1234!");

        WebElement signButton=driver.findElement(By.xpath("//input[@name='commit']"));
        signButton.click();

        WebElement id=driver.findElement(By.xpath("//span[@class='navbar-text']"));
        System.out.println("ID : "+id.getText());







    }
}
