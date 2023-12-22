package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	WebDriver driver;
	By logo=By.xpath("//img[@src='images/logo.png']");
	public HomePage(WebDriver driver)//constructor that is paramaterized
	{
		this.driver=driver;
	}
	
	

	public void is_logo_displayed()
	{
		WebElement logoelement=driver.findElement(logo);
		String print1=driver.getTitle();
		System.out.println(print1);
	}
}
