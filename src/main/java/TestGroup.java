import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class TestGroup {
	
	WebDriver driver;
	
	@Test(groups = "smoke")
	public void login() {
		System.out.println("Login successfully");
		System.out.println("Smoke scenarios are done");
	}
	
	@Test(groups = "Regression")
	public void ragister() {
		System.out.println("Ragister successfully");
		System.out.println("Regrssion scenarios are done");
	}
	
	

}
