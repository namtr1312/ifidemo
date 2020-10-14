import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class google {
	private WebDriver driver;
	WebElement element;
	String setupBtnXpath = "//*[@id='fsettl']";
	String advancesearchBtnXpath = "//*[@id='fsett']/a[2]";
	String languageFieldXpath = "//*[@id='lr_button']";
	String languageOptionXpath = "//*[@id=':19']/div";
	String regionFieldXpath = "//*[@id='cr_button']";
	String regionOptionXpath = "//*[@id=':7s']/div";
	String url = "https://www.google.com";

	public void clickToElement(WebDriver driver, String locator) {
		element = driver.findElement(By.xpath(locator));
		element.click();
	}

	@Test (groups = ("Google Advance Search"))
	public void step1() {
		driver.get(url);
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("Google"));
	}

	@Test //Switch to Google advance search
	public void step2() throws InterruptedException {
		clickToElement(driver, setupBtnXpath);
		Thread.sleep(500);
		clickToElement(driver, advancesearchBtnXpath);
	}

	@Test
	public void step3() throws InterruptedException {
		element = driver.findElement(By.xpath("//*[@name='as_q']"));
		element.clear();
		Thread.sleep(500);
		element.sendKeys("Covid 19");
	}

	@Test //Select language
	public void step4() throws InterruptedException {
		clickToElement(driver, languageFieldXpath);
		Thread.sleep(500);
		clickToElement(driver, languageOptionXpath);
	}

	@Test //Select region
	public void step5() throws InterruptedException {
		clickToElement(driver, regionFieldXpath);
		Thread.sleep(500);
		clickToElement(driver, regionOptionXpath);
	}

	@Test
	public void step6() throws InterruptedException {
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(500);
	}

	@Test
	public void step7() {
		element = driver.findElement(By.xpath("//*[@class='PyJv1b gsmt PZPZlf']"));
		String text = element.getText().toLowerCase();
		Assert.assertTrue(text.contains("covid"));
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}
}
