package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/checkboxes");



        WebElement checkbox1=driver.findElement(By.xpath("//input[@type='checkbox'][1]"));

        if (!checkbox1.isSelected()){
            checkbox1.click();
        }else{
            System.out.println("Already Checked");
        }

        WebElement checkbox2=driver.findElement(By.xpath("//input[@type='checkbox'][2]"));

       if (!checkbox2.isSelected()){
           checkbox2.click();
       }else{
           System.out.println("Already Checked");
       }


    }
}
