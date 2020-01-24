package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners({ listnerdemo.MyListener.class })
public class VerifyGooglePageTest {
	WebDriver driver;
	@BeforeMethod
	public void startapp()
	{
	System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
     driver= new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.manage().window().maximize();
	}
	
	@Test
     public void checkTitle()
     {
		String title=driver.getTitle();
		String expectedtitle="google";
		Assert.assertEquals(expectedtitle, title);
		System.out.println("title");
     }
	
	@Test
	public void getlogo()
	{
		boolean logo=driver.findElement(By.id("hplogo")).isDisplayed();
		Assert.assertTrue(logo);
		System.out.println("logo");
	}
	
	@AfterMethod
	   public void closebrowser()
	   {
		driver.quit();
	   }
}
