package commandsdemo;
//package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

  public class BrowserNavCommand {
			public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		    WebDriver driver= new ChromeDriver();
		    driver.get("http://demowebshop.tricentis.com/login");
//		     System.setProperty("webdriver.gecko.driver,","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//		     WebDriver driver= new FirefoxDriver();
//		     driver.manage().window().maximize();
//		     driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
//		     driver.findElement(By.name("password")).sendKeys("Dks@7139");
//		     driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		     driver.findElement(By.xpath("//a[@class='ico-register']")).click();
		    Thread.sleep(3000);
		     driver.navigate().back();
		     Thread.sleep(3000);
		     driver.navigate().forward();
		     Thread.sleep(3000);
		     driver.navigate().to("");
		     driver.navigate().refresh();
		     driver.close();
	}

}

// This project is create 4 years ago.
