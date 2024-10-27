package grouppackage;

import org.testng.annotations.Test;

public class TestGroup1 {
	
	 @Test(groups = { "smoke"})
	  public void test1() {
		 System.out.println("smoke test 1");
	  }
	
	  @Test(groups = {"smoke"} )
	  public void test2() {
		  System.out.println("smoke test 2"); 
	  }	 
	  @Test(groups = { "smoke" })
	  public void test3() {
		  System.out.println("smoke test 3");   
	  }
	  @Test(groups = { "regression" })
	  public void test4() {
		  System.out.println("regression  test 1");   
	  }
}

// This project is created 4 years ago.
