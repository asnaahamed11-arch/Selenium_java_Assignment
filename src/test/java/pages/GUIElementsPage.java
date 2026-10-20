package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class GUIElementsPage {
	WebDriver driver;
	
	 public GUIElementsPage(WebDriver driver)
	 {
		 this.driver=driver;
	
	 }
	public void Name(String Name,String Email,String Phone,String Address) 
	{
	
		WebElement name1 = driver.findElement(By.id("name"));
		name1.sendKeys(Name);	
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys(Email);
		WebElement phone= driver.findElement(By.id("phone"));
		phone.sendKeys(Phone);
		WebElement address= driver.findElement(By.id("textarea"));
		address.sendKeys(Address);
		WebElement radioBtn = driver.findElement(By.id("female"));
		radioBtn.click();
		WebElement sunday = driver.findElement(By.id("sunday"));
		sunday.click();
		WebElement monday = driver.findElement(By.id("monday"));
		monday.click();
		WebElement datePicker1= driver.findElement(By.id("datepicker"));
		datePicker1.sendKeys("22/04/2026");	
		WebElement datePicker2= driver.findElement(By.id("txtDate"));
		datePicker2.click();
		WebElement date= driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[2]/a"));
		date.click();
	}

}
