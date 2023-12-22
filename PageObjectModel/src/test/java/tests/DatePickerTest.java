package tests;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.DatePickerPageClass;

public class DatePickerTest extends BaseClass {
	DatePickerPageClass datepickerpageclass;
	
	 @Test
	  public void open_datepickerPage() {
	    datepickerpageclass =new DatePickerPageClass(driver);
	    datepickerpageclass.date_picker();
	    datepickerpageclass.select_Date();

	
	
}
}


