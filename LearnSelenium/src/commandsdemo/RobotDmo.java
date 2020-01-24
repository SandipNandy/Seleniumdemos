package commandsdemo;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDmo {
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Softwares Required For Testing Batch\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/search?q=natural+image&oq=NATURAL+&aqs=chrome.1.69i57j0l7.20154j1j7&sourceid=chrome&ie=UTF-8");
		driver.manage().window().maximize();
		Robot robot = new Robot();
		robot.setAutoDelay(3000);
		driver.findElement(By.xpath("//img[@id='dimg_70']")).click();
		StringSelection stringselection = new StringSelection("D:\\img12.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		robot.setAutoDelay(3000);

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);

		robot.setAutoDelay(3000);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
