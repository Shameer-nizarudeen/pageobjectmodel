package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.InputFormPage;

public class InputFormTest extends BaseClass {
	
	InputFormPage inputformpage;
	@Test
	public void verify_message()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickonform();
		
	}
	@Test
	public void verify_show_message()
	{
		inputformpage=new InputFormPage(driver);
		inputformpage.clickonform();
		String expectedshowmessage="Show Message";
		String actualshowmessage=inputformpage.get_show_message_button_label();
		Assert.assertEquals(actualshowmessage, expectedshowmessage);
		
		
	}
	
	
	

}
