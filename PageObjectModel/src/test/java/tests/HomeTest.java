package tests;

import org.bouncycastle.jcajce.spec.DHExtendedPrivateKeySpec;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;

public class HomeTest extends BaseClass {
	
	HomePage homepage;//aggregation
	
	@Test
	public void verify_logo()
	{
	    homepage=new HomePage(driver);
		homepage.is_logo_displayed();
	}
    
}


