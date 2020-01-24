package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeDemo   
   {
	   public static void main(String[] args) 
	{
			   System.setProperty("webdriver.chrome.driver","E:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			   WebDriver driver= new ChromeDriver(); 
			    driver.get("http://demo.automationtesting.in/Iframe.html");	
			    driver.manage().window().maximize();	
			   int size = driver.findElements(By.tagName("iframe")).size();
			   System.out.println("size of iframe is: "+size);

	}

}
