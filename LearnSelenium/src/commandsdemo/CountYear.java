package commandsdemo;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

public class CountYear {
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();  
	    driver.get("http://demo.automationtesting.in/Register.html");
	    Select year= new Select(driver.findElement(By.id("Year")));
	    List<WebElement> sk=year.getOptions();
	    System.out.println("No of skill: ="+sk.size());
	    for(int k=0;k<sk.size();k++)
		    {
		    	System.out.println("Name ofskills are :"+sk.get(k).getText());
		    }
	   }
  }


// This project is created 4 years ago.
