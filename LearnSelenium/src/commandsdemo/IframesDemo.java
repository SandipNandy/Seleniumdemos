package commandsdemo;
import java.awt.AWTException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class IframesDemo {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Frames.html");
	    List<WebElement> ifrmecount=driver.findElements(By.tagName("iframe"));
	    System.out.println("No of frames:"+ifrmecount.size());
	    for(int i=0;i<ifrmecount.size();i++)
	    {
	    	System.out.println(ifrmecount.get(i).getAttribute("name"));
	    	
	    }
	    // switch to frmae
	    WebElement frame= driver.findElement(By.xpath("//iframe[@id='singleframe']"));
	    driver.switchTo().frame(frame);
	    //Enter the value in the textbox
	    WebElement textbox=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
	    textbox.sendKeys("selenium");
	    driver.switchTo().defaultContent();
	    WebElement secondtab=driver.findElement(By.xpath("//a[contains(text(),'Iframe with in an Iframe')]"));
	    secondtab.click();
	    driver.switchTo().frame(1);
	    driver.switchTo().frame(0);
	    WebElement textbox2=driver.findElement(By.xpath("//div[@class='col-xs-6 col-xs-offset-5']//input"));
	    textbox2.sendKeys("webdriver");
	    Thread.sleep(5000);
	    driver.switchTo().defaultContent();
	    driver.findElement(By.xpath("//a[contains(text(),'Single Iframe')]")).click();
	    
	    // This project is craeted 4 years ago.
}
}
