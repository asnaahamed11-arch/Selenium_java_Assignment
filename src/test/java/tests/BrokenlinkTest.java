package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.BrokenLinkPage;

public class BrokenlinkTest extends Base_Class{
	@Test
	public void broken() throws IOException
	{
	BrokenLinkPage bb = new BrokenLinkPage(driver);
	bb.brokenMethod();

}
}