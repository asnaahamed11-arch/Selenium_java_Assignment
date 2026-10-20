package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.FileUploadPages;

public class FileUploadTests extends Base_Class{
@Test
public void File()
{
	FileUploadPages fl=new FileUploadPages(driver);
	fl.SingleFileUpload();
	fl.MultipleFileUpload();
	
}
	
}
