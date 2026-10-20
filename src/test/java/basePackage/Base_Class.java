package basePackage;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import utils.ConfigReader;

public class Base_Class{

	public WebDriver driver;
	public WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	@BeforeTest
	public void Setup() throws IOException
	{
		driver=new ChromeDriver();
		ConfigReader reader =new ConfigReader();
		driver.get(reader.getValues("url"));
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
}
