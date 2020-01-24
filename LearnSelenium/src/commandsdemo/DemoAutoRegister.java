package commandsdemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class DemoAutoRegister {
   public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Register.html");
	    driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Deepak");
	    driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("kumar");
	    driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[2]/form[1]/div[2]/div[1]/textarea[1]")).sendKeys("Hyderabad");
	    driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys("kumar62922@gmail.com");	
	    driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("9915244516");
	    driver.findElement(By.xpath("//input[@name='radiooptions' and @value='Male']")).click();
	    driver.findElement(By.xpath("//input[@id='checkbox1' and @value='Cricket']")).click();
       // driver.findElement(By.xpath("//div[@id='msdd' and @Language='English']")).click();
       //driver.findElement(By.xpath("//select[@id='Skills' and @value='C']")).click();
	    WebElement country=driver.findElement(By.xpath("//select[@id='countries']"));  
        Select s1= new Select(country);
	    s1.selectByVisibleText("India");
        WebElement skill=driver.findElement(By.xpath("//select[@id='Skills']"));  
        Select s= new Select(skill);
	    s.selectByVisibleText("Java");
        WebElement year=driver.findElement(By.xpath("//select[@id='yearbox']"));  
        Select sell= new Select(year);
	    sell.selectByVisibleText("1918");
	    driver.findElement(By.xpath("//select[@placeholder='Month']")).sendKeys("March");
	    driver.findElement(By.id("daybox")).sendKeys("10");
//	    List<WebElement> linklist=driver.findElements(By.tagName("month"));
//	    System.out.println("number of links: "+linklist.size());
	    Select skill1= new Select(driver.findElement(By.id("Skills")));
	    List<WebElement> sk=skill1.getOptions();
	    System.out.println("No of skill: ="+sk.size());
	    for(int k=0;k<sk.size();k++)
	    {
	    	System.out.println("Name ofskills are :"+sk.get(k).getText());
	    }
	    Thread.sleep(3000);
	    //driver.close();
	    
	    		
	}

}
