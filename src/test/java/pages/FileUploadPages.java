package pages;

import java.awt.Window;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileUploadPages {
	WebDriver driver;
	public FileUploadPages(WebDriver driver)
	{
		this.driver=driver;
	}
	public void SingleFileUpload()
	{
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1250)");
	//	WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(5));
	// driver.findElement(By.id("singleFileInput"));
		WebElement sFile=driver.findElement(By.id("singleFileInput"));
		String sourceFilePath="C:\\Users\\USER\\OneDrive\\Desktop\\Tutorial SeleniumJava.rtf";
		sFile.sendKeys(sourceFilePath);
	}
	public void MultipleFileUpload()
	{
		
		WebElement mFile=driver.findElement(By.id("multipleFilesInput"));
		String file1="C:\\Users\\USER\\OneDrive\\Desktop\\Tutorial SeleniumJava.rtf";
		String file2="C:\\Users\\USER\\OneDrive\\Desktop\\Screenshots\\screenTutorial.png";
		mFile.sendKeys(file1+"\n"+file2);
	}
	

}
