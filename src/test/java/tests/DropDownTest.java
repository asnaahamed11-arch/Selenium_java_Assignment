package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.DropdownPage;

public class DropDownTest extends Base_Class {
@Test
	public void dropdowntest()
	{
	DropdownPage dd = new DropdownPage(driver);
	dd.dropdown();
	}

}
