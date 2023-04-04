package grouppackage;
import org.testng.annotations.Test;
public class TestGroup2 {
	@Test(groups = { "regression"})
	  public void test5() {
		 System.out.println("regression test 2");
	  } 
	  @Test(groups = {"regression"} )
	  public void test6() {
		  System.out.println("regression test 3"); 
	  }	 
	  @Test(groups = { "smoke" })
	  public void test7() {
		  System.out.println("smoke test 4");   
	  }

	  @Test(groups = { "regression" })
	  public void test8() {
		  System.out.println("regression  test 4");   
	  }
}

//This project is created 4 years ago.
