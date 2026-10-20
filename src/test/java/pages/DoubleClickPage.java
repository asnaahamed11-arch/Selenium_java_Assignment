package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickPage {
	WebDriver driver;

	public DoubleClickPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void DoubleClick()
	{
		WebElement dbClick= driver.findElement(By.xpath("//*[@id=\"HTML10\"]/div[1]/button"));
		Actions actn= new Actions(driver);
		actn.doubleClick(dbClick).perform();
		
		
	}
	
	
}
