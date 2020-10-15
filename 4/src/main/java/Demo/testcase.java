package Demo;

//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
//import org.testng.annotations.DataProvider;

public class testcase {
	
	@Test
	public void samsungS20price() {
		System.out.println("Test");
		commonAct.startTesting();
		Homepage.gotoLoginpage();
		Loginpage.performLogin();
		Homepage.closePopup01();
		Homepage.searchProduct();
//		Homepage.closePopup02();
		commonAct.visibilityElement(Instances.Result01);
		String s20Price =commonAct.getPrice(Instances.Result01);
		System.out.println(s20Price);
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
		
	}

	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
		commonAct.endTesting();
	}
}
