package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
public WebDriver driver;

@BeforeMethod
public void launch_browser()
{
	
	WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.navigate().to("https://selenium.obsqurazone.com/index.php");
    driver.manage().window().maximize();
}
}
