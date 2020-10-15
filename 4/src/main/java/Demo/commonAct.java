package Demo;

//import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;

public class commonAct{
	
	static WebDriver driver = null;
	static WebDriverWait myWait;
	
	
	public static void startTesting(){
		System.setProperty("webdriver.chrome.driver", "F:\\Eclipse\\webdriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Instances.testUrl);
		myWait = new WebDriverWait(driver, 500);
	}
	
	public static void endTesting(){
		driver.quit();
	}
		
	public static void selectElement(String xpathElement1, String  xpathElement2) {
		WebElement element = driver.findElement(By.xpath(xpathElement1));
		Select select = new Select(element);
		select.selectByVisibleText(xpathElement2);
	}

	public static void inputText(String xpathElement, String value) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.clear();
		element.sendKeys(value);
	}

	public static void clickElement(String xpathElement) {
		WebElement element = driver.findElement(By.xpath(xpathElement));
		element.click();
	}

	public static void visibilityElement(String xpathElement) {
		myWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpathElement)));
	}
	
	public static String getPrice(String xpathElement) { 
		WebElement element = driver.findElement(By.xpath(xpathElement));
		return(element.getText());
	}

	public static void sleep(long number) {
		try {
			Thread.sleep(number);
		} catch (Exception e) {
		}
	}
}
