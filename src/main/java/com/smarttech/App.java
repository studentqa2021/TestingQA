package com.smarttech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class App 
{
    public static void main( String[] args )
    {
        System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");
        WebElement singinbutton = driver.findElement(By.xpath("//*[@class='login']"));
        singinbutton.click();
        WebElement email = driver.findElement(By.xpath("//*[@id='email']"));
        email.sendKeys("mmuhammadimam18@gmail.com");
        WebElement pass = driver.findElement(By.xpath("//*[@name='passwd'] "));
        pass.sendKeys("Mahdi");
        WebElement singButton =driver.findElement(By.xpath("//*[@id='SubmitLogin']"));
        singButton.click();
    }
}
