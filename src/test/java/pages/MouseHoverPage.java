package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MouseHoverPage {

	WebDriver driver;
	public MouseHoverPage(WebDriver driver)
	{
		this.driver= driver;
		
	}
	public void MouseHover()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,800)");
		WebElement mHover=driver.findElement(By.xpath("//*[@id=\"HTML3\"]/div[1]/div/button"));
		Actions actn=new Actions(driver);
		actn.moveToElement(mHover).perform();
				
		
		
		
	}
	
}
