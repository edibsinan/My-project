package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
//        driver.navigate().to("https://www.google.com/");
        String actualURL=driver.getCurrentUrl();
        String expectedURL="https://www.google.com/";

        if(actualURL.equals(expectedURL)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("ExpectedURL : "+ expectedURL);
            System.out.println("ActualURL : "+actualURL);
        }

    }
}
