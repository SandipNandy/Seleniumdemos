package listnerdemosuite;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class AlwaysRunDemo {
	WebDriver driver;
	@Test
	public void startup()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver= new ChromeDriver();  
	    driver.get("http://demowebshop.tricentis.com/login");
	    driver.manage().window().maximize();
	}

	@Test(dependsOnMethods="startup")
	public void login()
	{
		//System.out.println("Login to application");
		driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
	     driver.findElement(By.name("password")).sendKeys("Dks@7139");
	     driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	     String expectedname="DemoWebStore";
	     String actualname=driver.getTitle();
	     System.out.println(actualname);
	     Assert.assertEquals(expectedname, actualname);
	     driver.findElement(By.linkText("Log out")).click();
	     System.out.println("Logoff the application");
	}
     @Test(dependsOnMethods="login")	
	public void logoff()
	{
		//System.out.println("Login to application");
    	 driver.close();
		
	}
	
}
