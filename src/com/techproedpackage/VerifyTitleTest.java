package com.techproedpackage;

import com.sun.deploy.security.SelectableSecurityManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitleTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        String actualTitle=driver.getTitle();
        String expectedTitle="GoogleOOO";
        if (actualTitle.equals(expectedTitle)) {
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("Expected Title : "+expectedTitle);
            System.out.println("Actual Title : "+actualTitle);
        }


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.close();

    }
}
