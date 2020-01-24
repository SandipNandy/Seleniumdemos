package commandsdemo;

import org.testng.annotations.Test;

public class DependsonMethodDemo {
	@Test
	public void startup()
	{
		System.out.println("Statt Application");
	}

	@Test(dependsOnMethods="startup")
	public void login()
	{
		System.out.println("Login to application");
		
	}
	
     @Test(dependsOnMethods="login")
	
	public void logoff()
	{
		System.out.println("Login to application");
		
	}
}
