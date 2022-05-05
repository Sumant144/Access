package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login 
{
	
	public WebElement uname(WebDriver driver)
	{
		WebElement e = driver.findElement(By.xpath("//input[@id='user-name']"));
		return e;
	}
	
	public WebElement password(WebDriver driver)
	{
		WebElement e = driver.findElement(By.xpath("//input[@id='password']"));
		return e;
	}
	
	public WebElement login_btn(WebDriver driver) 
	{
		WebElement e = driver.findElement(By.xpath("//input[@id='login-button']"));
		return e;
	}

}
