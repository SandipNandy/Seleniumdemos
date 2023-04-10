package commandsdemo;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Log4jDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    Logger log=Logger.getLogger(Log4jDemo.class);
	    driver.get("https://www.google.com/");	
	    driver.manage().window().maximize();
       log.info("Application started successfully");
	    String expectedtitle="google";
	    String actualtitle= driver.getTitle();
	    log.warn("check title");
	    if(expectedtitle.equalsIgnoreCase(actualtitle))
	    {
	    	System.out.println("correct Title");
	    	log.info("correct page");
	    }
	    else
	    {
	    	System.out.println("incorrect title");
	    }	
	    
	    
	}

}

// This project is craeted 4 years ago.
