package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LoginTest {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/login");
//     System.setProperty("webdriver.gecko.driver,","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\geckodriver-v0.26.0-win64\\geckodriver.exe");
//     WebDriver driver= new FirefoxDriver();
     driver.manage().window().maximize();
     driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
     driver.findElement(By.name("password")).sendKeys("Dks@7139");
     driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
//     String expectedname="DemoWebStore";
//     String actualname=driver.getTitle();
//     System.out.println(actualname);
//     if(expectedname.equals(actualname))
//    	 System.out.println("url is correct");
//     else
//    	 System.out.println("url is incorrect"); 
//     
     driver.findElement(By.xpath(""));
	}
	
}

// This project is craeted 4 years ago.
