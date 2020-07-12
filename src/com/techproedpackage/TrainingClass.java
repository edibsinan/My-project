package com.techproedpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TrainingClass {
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       driver.get("https://www.youtube.com/?hl=TR&gl=DEl");


        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();

            driver.close();
        }
    }

}
