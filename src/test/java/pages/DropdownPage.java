package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownPage {
	WebDriver driver;
	public  DropdownPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void  dropdown()
	{
	WebElement country= driver.findElement(By.id("country"));
	Select dropdn= new Select(country);
	dropdn.selectByVisibleText("India");
	WebElement colors=driver.findElement(By.id("colors"));
	Select colr=new Select(colors);
	colr.selectByValue("blue");
	WebElement animals=driver.findElement(By.id("animals"));
	Select anim=new Select(animals);
	anim.selectByIndex(5);
	}
}
