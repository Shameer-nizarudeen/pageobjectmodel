package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPage {
	WebDriver driver;
	By inputformpagepath = By.xpath("//a[contains(text(),'Input Form')]");
	By showmessbutton = By.xpath("//button[@id='button-one']");

	public InputFormPage(WebDriver driver) {
		this.driver = driver;
	}

	public void clickonform() {
		WebElement inputformelement = driver.findElement(inputformpagepath);
		inputformelement.click();

	}

	public String get_show_message_button_label() 
	{

		WebElement messbutton = driver.findElement(showmessbutton);

		return messbutton.getText();

	}
}
