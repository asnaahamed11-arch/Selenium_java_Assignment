package tests;

import java.io.IOException;



import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.GUIElementsPage;
import utils.ConfigReader;

public class GUIElementsTest extends Base_Class{

	@Test
	public void  ValidName() throws IOException, InterruptedException{
	GUIElementsPage obj=new GUIElementsPage(driver);
	ConfigReader con=new ConfigReader();
	String name=con.getValues("username1");
	obj.Name(name,con.getValues("email1"),con.getValues("phone1"),con.getValues("Address"));
	
	}
		

}
