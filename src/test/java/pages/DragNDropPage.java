package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragNDropPage {
	WebDriver driver;
	public DragNDropPage(WebDriver driver)
	{	
		
		this.driver=driver;
		
	}
	public void DragDrop()
	{
		WebElement source= driver.findElement(By.id("draggable"));
		WebElement destination =driver.findElement(By.id("droppable"));
		Actions actn= new Actions(driver);
		actn.dragAndDrop(source, destination).perform();
	}
	public void Slider()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		WebElement slider1= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		WebElement slider2= driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[2]"));
		Actions action= new Actions(driver);
		action.dragAndDropBy(slider1,100,0).perform();
		action.dragAndDropBy(slider2,0,-50).perform();
		System.out.println("sliderCkass");
	}
		
}
