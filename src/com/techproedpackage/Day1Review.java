package com.techproedpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Review {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.youtube.com/?hl=TR");

        String actualYoutubeTitle=driver.getTitle();
        String expectedYoutubeTitle= "YouTube";

        if (actualYoutubeTitle.equals(expectedYoutubeTitle)){
            System.out.println("PASS");
            }else{
            System.out.println("FAIL");
            System.out.println("actualURL : "+actualYoutubeTitle);
            }

        String actualYoutubeURL=driver.getCurrentUrl();
        String expectedYoutubeURL="youtube";

        if (actualYoutubeURL.contains(expectedYoutubeTitle)){
            System.out.println("PASS");
             }else{
            System.out.println("Correct url is : "+actualYoutubeTitle);
        }



        driver.navigate().to("https://www.amazon.com/");
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();
        driver.manage().window().maximize();

        String actualTitleAmazon=driver.getTitle();
        String expectedTitleAmazon="https://www.amazon.com/";

        if(actualTitleAmazon.contains(expectedTitleAmazon)){
            System.out.println("PASS");
            }else{
            System.out.println("FAIL");
            System.out.println("actualTitleAmazon : "+actualTitleAmazon);
            System.out.println("expectedTitleAmazon : "+expectedTitleAmazon);
        }

        Thread.sleep(5000);

        driver.close();
    }
}
