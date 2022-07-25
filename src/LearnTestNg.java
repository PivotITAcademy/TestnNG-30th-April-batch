import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LearnTestNg {

	
	
	@BeforeMethod
	public void openBrowser() {
		System.out.println("Opening Browser");
	}

	@Test(priority = 1)
	public void printHelloSwaroop() {
		System.out.println("Hello World Swaroop");
		Assert.fail();
	}

	@Test(priority = 2,dependsOnMethods = "printHelloSwaroop")
	public void printHelloSimar() {
		System.out.println("Hello World Simar");
	}
	
	@Test(priority = 3,dependsOnMethods = "printHelloSimar")
	public void printHelloMamatha() {
		System.out.println("Hello World Mamatha");
	}

	@Test(priority = 4)
	public void printHelloNeeru() {
		System.out.println("Hello World Neeru");
	}

	@AfterMethod
	public void closeBrowser() {
		System.out.println("Closing browser");
	}
	
	@AfterClass
	public void afterClassExecution() {
		System.out.println("After Class");
	}
	
	@BeforeClass
	public void beforeExecutingClass() {
		System.out.println("Before class execution");
	}

}
