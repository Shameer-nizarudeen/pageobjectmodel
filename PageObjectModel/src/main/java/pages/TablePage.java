package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.UtilityClass;

public class TablePage {

	WebDriver driver;
	UtilityClass utility;

	@FindBy(xpath = "(//a[contains(text(),'Table')])[1]")
	WebElement tablelink;
	@FindBy(xpath = "//div[contains(text(),'Table with Pagination Example')]")
	WebElement tableheadinglink;
	@FindBy(xpath = "//table[@id='dtBasicExample']//tbody//td[1]")
	List<WebElement> nameelements;
	@FindBy(xpath = "//a[contains(text(),'Date Pickers')]")
	List<WebElement> dateelements;
	
	

	public TablePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void click_on_table() {
		tablelink.click();
	}

	public String get_heading() {
		return tableheadinglink.getText();

	}

	public String check_attribute() {

		utility = new UtilityClass();
		String attribute = utility.get_attribute(tableheadinglink, "text");
		return attribute;

	}

	public void printAllNames() {
		List<String> names = new ArrayList<String>();
		utility = new UtilityClass();
		names = utility.get_text_of_elements(nameelements);
		System.out.println(names);

	}

	public String getofficeofperson(String personname) {
		int index = 0;
		List<String> names = new ArrayList<String>();
		utility = new UtilityClass();
		names = utility.get_text_of_elements(nameelements);
		for (index = 0; index < names.size(); index++) 
		{
			if (personname.equals(names.get(index))) 
			{

				index++;
				break;
			}
		}
		
	WebElement officepath=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr["+index+"]//td[3]"));
	return officepath.getText();
	}
	public void date_elements(String datepicking)
	{
		
		
			}
		}

