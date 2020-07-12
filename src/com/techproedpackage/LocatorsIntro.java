package com.techproedpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.sound.midi.Soundbank;
import java.util.List;

public class LocatorsIntro {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\user\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("http://a.testaddressbook.com/sign_in");

       WebElement emailTextbox= driver.findElement(By.id("session_email"));
            emailTextbox.sendKeys("testtechproed@gmail.com");
       WebElement passwordTextBox=driver.findElement(By.id("session_password"));
            passwordTextBox.sendKeys("Test1234!");
       WebElement signInButon=driver.findElement(By.name("commit"));
            signInButon.click();
        WebElement userId= driver.findElement(By.className("navbar-text"));
//            System.out.println("USER ID WEBELEMENT : "+ userId);

        String actualUserId=userId.getText();
        System.out.println("USER ID TEXT : "+actualUserId);
        String expectedUserID="testtechproed@gmail.com";

        if(actualUserId.equals(expectedUserID)){
            System.out.println("PASS user id");
        }else{
            System.out.println("FAIL user id ");
            System.out.println("ACTUAL ID IS : "+actualUserId);
            System.out.println("EXPECTED ID IS : "+expectedUserID);
        }

        WebElement addressLink=driver.findElement(By.linkText("Addresses"));
        String actualAddressLink=addressLink.getText();
        String expextedAddressLInk="Addresses";

        if(actualAddressLink.equals(expextedAddressLInk)){
            System.out.println("PASS Addresses");
        }else{
            System.out.println("FAIL Addresses");
            System.out.println("ACTUAL ADDRESS LINK TEXT : "+actualAddressLink);
            System.out.println("EXPECTED ADDRESS LINK TEXT : "+expextedAddressLInk);
        }

        String expectedSignout="Sign out";
        WebElement actualSignoutElement=driver.findElement(By.linkText("Sign out"));
       String actualSignout=actualSignoutElement.getText();

        if (actualSignout.equals(expectedSignout)){
            System.out.println("PASS Sign out");
        }else{
            System.out.println("FAIL Sign out");
            System.out.println("EXPECTED SIGNOUT : "+expectedSignout);
            System.out.println("ACTUAL SIGNOUT : "+actualSignout);
        }

        //Find the number of total link on the page
        //findElements(); returns multiple elements ->List of WebElement List<WebElement>
        //findElement(); returns only one single WebElement->Returns a String

        List<WebElement> listOfLinkElements=driver.findElements(By.tagName("a"));
        System.out.println("There are " +listOfLinkElements.size()+" links of the page");

        //Printing each link one by one
        //3 elements -> First index starts at get(0);
        System.out.println("The first web element : "+listOfLinkElements.get(0));
        System.out.println("The first text : "+listOfLinkElements.get(0).getText());
        System.out.println("The second text : "+listOfLinkElements.get(1).getText());
        System.out.println("The third text : "+listOfLinkElements.get(2).getText());

        //Print all elements that is a link using for each

        System.out.println("\n *****LAST ACTION*****\n");

        for (WebElement element:listOfLinkElements) {
            System.out.println(element.getText());
            
        }
        
        //Print Addresses and Sign out link using partialLinkText

        String addressLinkPart=driver.findElement(By.partialLinkText("Addr")).getText();
        System.out.println("Address by partiallinkText : "+addressLinkPart);

        String signOutLinkPart=driver.findElement(By.partialLinkText("Sign ")).getText();
        System.out.println("Sign out by partiallinkText : "+signOutLinkPart);










        Thread.sleep(3000);
        actualSignoutElement.click();















        Thread.sleep(5000);
        driver.close();

    }
}
