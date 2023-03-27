package commands;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test2 {

	@BeforeTest
	public void Initializedriver()
	{
		System.out.println("First we are initialize browser");
		System.out.println("so, we use before test annotate");
		System.out.println("then we write normal test cases");
				
	}
	
	@Test
	public void Testcase() {
		
		System.out.println("we are writting testcases in this annotation");
		System.out.println("for automation we are using Rest Assured testing");
	}
}
