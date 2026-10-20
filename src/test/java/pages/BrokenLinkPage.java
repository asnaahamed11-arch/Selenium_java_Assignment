package pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenLinkPage {
	WebDriver driver;
	public  BrokenLinkPage(WebDriver driver)
	{
		this.driver=driver;
	}
	public void brokenMethod() throws IOException {
	

	int brokenCount=0;
	List<WebElement> links=driver.findElements(By.tagName("a"));//Always use 'findElements' instead of 'findElement' in this case 
	System.out.println("Total links =" + links.size());
	
	for(WebElement link :links)
	{
		String url= link.getAttribute("href");
		if(url==null || url.isEmpty())
		{
			continue;
		}
		
		URL linkURL= new URL(url);
		
		HttpURLConnection connection = (HttpURLConnection) linkURL.openConnection();
		int responseCode = connection.getResponseCode();
		if(responseCode>=400)
		{
			brokenCount++;
			

		System.out.println("Broken Links "+ url);
		System.out.println("Response Code is" +responseCode);
		System.out.println("----------------------------------------------");
		}
	connection.disconnect();	
	}
	System.out.println("Total Broken count is "+ brokenCount);
	
}
}
