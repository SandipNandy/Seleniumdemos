package commandsdemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LinkDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();  
	    driver.get("http://demowebshop.tricentis.com/desktops");
//	    List<WebElement> linklist=driver.findElements(By.tagName("a"));
//	    System.out.println("number of links: "+linklist.size());
//	    for(int i=0;i<linklist.size();i++)
//	    {
//	    	System.out.println("link names are:"+linklist.get(i).getText());
//	    }
//	    
	  //  driver.findElement(By.xpath("//a[contains(text(),'Webtable')]//parent::li//preceding-sibling::li[1]//child::a[contains(text(),'Register')]"));
	    // a[contains(text),'Computers')]//parent::li//parent::li//parent::ul//child::li//a[contains(text(),'Electronics')]
	    driver.findElement(By.xpath("//*[contains(text(),'Computers')]//ancestor::ul//descendent::1i//a[contains(text(),'Electronics')]"));
	}

}
