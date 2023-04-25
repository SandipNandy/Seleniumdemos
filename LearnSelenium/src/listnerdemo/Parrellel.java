
package listnerdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class Parrellel {
	
	WebDriver driver;
	@Test
	public void method1() {
	System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
     driver= new ChromeDriver();
    driver= new ChromeDriver();
    driver.get("http://demowebshop.tricentis.com/login");
    driver.findElement(By.id("Email")).sendKeys("rekhab@gmail.com");
    driver.findElement(By.id("Password")).sendKeys("rekhab");
	}    
	@Test
	public void method2(){
    	System.setProperty("webdriver.geckodriver.driver","D:\\Softwares Required For Testing Batch\\Testing Softwares\\Selenium Updated Jar\\geckodriver-v0.20.1-win64\\geckodriver.exe");
    //     driver= new geckodriverDriver();
        driver.get("http://demowebshop.tricentis.com/login"); 
        driver.findElement(By.id("Email")).sendKeys("rekhab@gmail.com");
        driver.findElement(By.id("Password")).sendKeys("rekhab");
	}
  }
