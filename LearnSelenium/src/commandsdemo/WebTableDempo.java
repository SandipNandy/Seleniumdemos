package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebTableDempo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("file:///D:/LoadRunne.html");	
	    driver.manage().window().maximize();
	    String name=driver.findElement(By.xpath("//html/body/table/tbody/tr[3]/td[3]")).getText();
	    System.out.println(name);
	}

}


// This project is craeted 4 years ago.
