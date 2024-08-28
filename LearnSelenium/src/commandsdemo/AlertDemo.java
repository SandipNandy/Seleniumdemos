package commandsdemo;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Alert alert1 = driver.switchTo().alert();
		String alerttitle = driver.switchTo().alert().getText();
		System.out.println("Alert title is:" + alerttitle);
		Thread.sleep(3000);
		alert1.accept();

		// next alert2 option is checked here
		driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		Alert alert2 = driver.switchTo().alert();
		// alert2.dismiss();
		String alerttitle2 = driver.switchTo().alert().getText();
		System.out.println("Alert title is:" + alerttitle2);
		Thread.sleep(3000);
		alert2.dismiss();

		// next alert3 option is checked here
		driver.findElement(By.xpath("//a[contains(text(),'Alert with Textbox')]")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).sendKeys("Automation Testing");
		Alert alert3 = driver.switchTo().alert();
		alert3.sendKeys("Testing");
		System.out.println("hxdbfgjh scf jiosdf usdfbg ");
		String alerttitle3 = alert3.getText();
		System.out.println("Alert title is:" + alerttitle3);
		alert3.accept();
		// driver.close();

	}

}

//This project is created 4 years ago. Thank you!!
