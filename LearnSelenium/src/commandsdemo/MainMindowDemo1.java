package commandsdemo;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MainMindowDemo1 {
	    public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");	
	    driver.manage().window().maximize();	
	    System.out.println(driver.getTitle());
	    WebElement tabWindow=driver.findElement(By.xpath("//div[@id='Tabbed']//button[@class='btn btn-info'][contains(text(),'click')]"));
	    Set<String>windowids=driver.getWindowHandles();
		Iterator<String>iter=windowids.iterator();
		String mainWindow=iter.next();
		String childWindow=iter.next();
		driver.switchTo().window(childWindow);
		System.out.println("The title of the window is:"+driver.getTitle());
		driver.close();
		driver.switchTo().window(mainWindow);
	    	    
	}

}

// This project is craeted 4 years ago.
