package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DatePickerPageClass  {
	WebDriver driver;
	DatePickerPageClass datepickerpageclass;
	
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	WebElement dateelements;
	 
	  @FindBy(xpath="(//span[@id='basic-addon1']//i[@class='fa fa-calendar'])[1]")
	  WebElement clickCalender;
	  
	  @FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[2])[1]")
	  WebElement monthElement;
	  
	  @FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[1])[1]")
	  WebElement previousArrow;
	  
	  @FindBy(xpath="(//table[@class='table-condensed']//tr[2]//th[3])[1]")
	  WebElement nextArrow;

	
	
	
	public DatePickerPageClass(WebDriver driver)
	{
	this.driver=driver;
	PageFactory.initElements(driver, this);

}
	public void date_picker()
	{
		dateelements.click();
	}
	
	
	
	public void select_Date()
	
	{
		clickCalender.click();
		String date="7-8-2001";
		String arr[]=date.split("-");
		String day=arr[0];
		String monthindex=arr[1]; 
		String yearindex=arr[2];
		int m=Integer.parseInt(monthindex);
		int y=Integer.parseInt(yearindex);
		String month="";
		switch (m) {
		case 01:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			
	}
		String month_year=month+" "+yearindex;
		System.out.println(month_year);
		while(true) 
		{
			String actualdate=monthElement.getText();
			if(month_year.equals(actualdate))
			{
				break;
			}
			else if(m<12 && y<2023)
			{
				previousArrow.click();
			}
			else
			{
				nextArrow.click();
			}
		}
		WebElement element=driver.findElement(By.xpath("//td[text()='"+day+"' and @class='day']"));
		element.click();
		
}
}