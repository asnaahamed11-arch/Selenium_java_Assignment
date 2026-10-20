package tests;

import org.testng.annotations.Test;

import basePackage.Base_Class;
import pages.AlertsPages;

public class AlertTest extends Base_Class {
@Test
	public void alertscallMethod() throws InterruptedException {

	AlertsPages al= new AlertsPages(driver);
	al.AlertHandler();
	
	}
	
}
