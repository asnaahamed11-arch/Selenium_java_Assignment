package pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsPages {

	WebDriver driver ;
	public AlertsPages(WebDriver driver)
	{
		this.driver=driver;
		
	}
	public void AlertHandler() throws InterruptedException
	{
		//Simple Alert
		WebElement simpleAlert =driver.findElement(By.id("alertBtn"));
		simpleAlert.click();
		Alert sAlert= driver.switchTo().alert();
		sAlert.accept();
		 //ConfirmationAlert
		WebElement confmAlert =driver.findElement(By.id("confirmBtn"));
		confmAlert.click();
		Alert cAlert= driver.switchTo().alert();
		cAlert.accept();
		//PromptAlert
		WebElement promptAlert =driver.findElement(By.id("promptBtn"));
		promptAlert.click();
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(20));
		Alert pAlert =wait.until(ExpectedConditions.alertIsPresent());
		String alertText = pAlert.getText();
	   System.out.println("Alert message content: " + alertText);
	  
		pAlert.sendKeys("ASNA AHAMED");
		
		pAlert.accept();
		
		
		
		}
	
	
}
