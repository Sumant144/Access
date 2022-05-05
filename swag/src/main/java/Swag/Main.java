package Swag;



import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import ObjectRepository.Login;

public class Main 
{
	public static WebDriver driver = null;
	
	
	public void sendkeys(WebElement ele, WebDriver driver, int t, String value)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.sendKeys(value);
	}
	
	public void click(WebElement ele, WebDriver driver, int t)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(t));
		wait.until(ExpectedConditions.visibilityOf(ele));
		ele.click();
		
	}
	
	@Parameters("url")
	@Test
	public void setup(String url)
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\eclipse-workspace\\swag\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(url);
	}
	
	@Test
	public void login()
	{
		Login l1 = new Login();
		
		sendkeys(l1.uname(driver), driver, 5, "standard_user");
		sendkeys(l1.password(driver), driver, 5, "secret_sauce");
		click(l1.login_btn(driver), driver, 5);
	}
	
	@Test
	public void close()
	{
		driver.close();
	}
	


}
