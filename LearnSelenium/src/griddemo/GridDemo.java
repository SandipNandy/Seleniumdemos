package griddemo;

import java.net.MalformedURLException;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
public class GridDemo {
	public WebDriver driver;
	@Test
	public void verifylogin() throws MalformedURLException {
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		capabilities.setBrowserName("chrome");
		capabilities.setPlatform(Platform.WINDOWS);
		driver = new RemoteWebDriver(new URL("http://172.23.102.19:4455/wd/hub"), capabilities);
		driver.get("http://demowebshop.tricentis.com/login");
		String title = driver.getTitle();
		System.out.println(title);
		driver.manage().window().maximize();
		driver.findElement(By.id("Email")).sendKeys("kumar62922@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("Dks@7139");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		System.out.println("login successful");
		driver.findElement(By.linkText("Log out")).click();
		driver.close();
	}

}
//This project is created 4 years back.
