package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.NewTabPage;

public class NewTabTest extends Base_Class{
	
	@Test
	public void TestNewTab()
	{
		NewTabPage page= new NewTabPage(driver);
		page.getWindow();
		
	}

}
