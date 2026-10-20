package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.MouseHoverPage;

public class MouseHoverTests extends Base_Class {
@Test
	public void MHoverMethod()
	{
		 MouseHoverPage mh= new MouseHoverPage(driver);
		 mh.MouseHover();
		
	}

}
