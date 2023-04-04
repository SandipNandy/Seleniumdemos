package commandsdemo;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
public class DataProviderDemo {
WebDriver driver;
  @Test(dataProvider = "dp")
  public void f(String username, String password) {
	  driver.get("http://demowebshop.tricentis.com/login");
	   driver.manage().window().maximize();
	   driver.findElement(By.id("Email")).sendKeys(username);
	   driver.findElement(By.name("Password")).sendKeys(password);
	   driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
	 //  driver.findElement(By.linkText("Log out")).click();
		}
  

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"rekhabr1@gmail.com", "rekhab" },
      new Object[] { "rekhabr3@gamil.com", "rekhab" },
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	     driver= new ChromeDriver();
	  //  driver.get("https://www.google.com/");
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}


// This project is created 4 years ago.
