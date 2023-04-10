package commandsdemo;
import org.testng.annotations.Test;

public class priorityDemo {
	@Test
	public void startup()
	{
		System.out.println("Statt Application");
	}

	@Test(priority=1)
	
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test(priority=2)
	
	public void logoff()
	{
		System.out.println("log out of application");
	}
}


// This project is craeted 4 years ago.
