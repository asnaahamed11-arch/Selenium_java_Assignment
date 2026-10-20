package pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewTabPage {

	WebDriver driver;
	public NewTabPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void getWindow()
	{
		WebElement btn= driver.findElement(By.xpath("//*[@id=\"HTML4\"]/div[1]/button"));
		btn.click();
		String parentWindow= driver.getWindowHandle();
		Set<String>allWindows= driver.getWindowHandles();
		for(String window : allWindows)
		{
			if(!window.equals(parentWindow))
			{
				driver.switchTo().window(window);				
			}
		}
		
	}
}