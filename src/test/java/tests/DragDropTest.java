package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.DragNDropPage;

public class DragDropTest extends Base_Class {
	@Test
	public void DragDroppMethod()
	{
	DragNDropPage dd=new DragNDropPage(driver);
	dd.DragDrop();
	dd.Slider();
}
}