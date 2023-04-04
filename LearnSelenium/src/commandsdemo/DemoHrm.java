package commandsdemo;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoHrm {
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();	
	       driver.get("https://opensource-demo.orangehrmlive.com/");
//		    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
//		    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
//		    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		    
		    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);//implicit wait
		    String expectedTitle="orangeHRM";
		    System.out.println(expectedTitle);
		    String actualTitle=driver.getTitle();
		    System.out.println(actualTitle);
		     if(expectedTitle.equalsIgnoreCase(actualTitle))
		     {
		    	 driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin"); 
				 driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
				 driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
				 WebDriverWait Mywait=new WebDriverWait(driver,10);  //explicit wait
				    Mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='welcome']"))).click();
				    driver.findElement(By.xpath("//a[@id='welcome']")).click();
				    driver.findElement(By.xpath("//a[contains(text(),'Logout')]")).click(); //Logout
				    System.out.println("end");
		     }
		     else
		     {
		    	 System.out.println("titles are diffrent");
		     }
		    
		    
	}

}

// This project is created 4 years ago.
