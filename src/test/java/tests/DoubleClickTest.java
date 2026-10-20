package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.DoubleClickPage;

public class DoubleClickTest extends Base_Class {
@Test
	public void Dbclick()
	{
		DoubleClickPage dd= new DoubleClickPage(driver);
		dd.DoubleClick();
	
	}

}
