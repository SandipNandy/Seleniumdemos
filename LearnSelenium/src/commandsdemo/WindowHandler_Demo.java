package commandsdemo;
import java.util.Iterator;
import java.util.Set;		
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;		
    public class WindowHandler_Demo {				
    public static void main(String[] args) throws InterruptedException {
    	System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();  				
        //Launching the site.				
       driver.get("http://demo.guru99.com/popup.php");			
       driver.manage().window().maximize();		            		
       driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();					
        String MainWindow=driver.getWindowHandle();	
        System.out.println(MainWindow);		
        // To handle all new opened window.				
            Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();			
           if(!MainWindow.equalsIgnoreCase(ChildWindow))			            {    		
                // Switching to Child window
              driver.switchTo().window(ChildWindow);	                                                                                                           
              driver.findElement(By.name("emailid")).sendKeys("kumar62922@gmail.com");                			              driver.findElement(By.name("btnLogin")).click();			                  
			// Closing the Child Window.
            driver.close();		
            }		
        }		
	}

}


// This project is craeted 4 years ago.
