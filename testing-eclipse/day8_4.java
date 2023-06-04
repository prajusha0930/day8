package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_4 {
     public static void main(String args[]) {
    	 WebDriverManager.edgedriver().setup();
    	 WebDriver driver=new EdgeDriver();
    	 driver.get("https://www.abhibus.com/bus-ticket-booking");
    	 driver.manage().window().maximize();
    	 WebElement leave=driver.findElement(By.xpath("//*[@id=\"source\"]"));
    	 leave.sendKeys("Trichy");
    	 WebElement goingto=driver.findElement(By.xpath("//*[@id=\"destination\"]"));
    	 goingto.sendKeys("Chennai");
    	 WebElement datepick=driver.findElement(By.xpath("//*[@id=\"datepicker1\"]"));
    	 JavascriptExecutor js=(JavascriptExecutor) driver;
    	 js.executeScript("arguments[0].setAttribute('value','03/06/2023')",datepick);
    	 
     }
}
