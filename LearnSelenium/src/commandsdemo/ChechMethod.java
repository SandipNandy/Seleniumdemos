package commandsdemo;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChechMethod
    {
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demowebshop.tricentis.com/login");	
	    driver.manage().window().maximize();
	    boolean checkpresence =driver.findElement(By.id("Email")).isDisplayed();
	    System.out.println(checkpresence);
	    boolean checkenabled =driver.findElement(By.id("Email")).isEnabled();
	    System.out.println(checkenabled);
		    if(checkpresence==true && checkenabled==true)
		    {
		    	driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
		    }
	    
	}

}

// This project is craeted 4 years ago. Thank You!!
