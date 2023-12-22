package tests;

import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.TablePage;

public class TableTest extends BaseClass{

	TablePage tablepage;
	
	@Test
	public void verify_heading()
	{
		tablepage=new TablePage(driver);
		tablepage.click_on_table();
	
	}
	@Test
	public void verify_tableheading() {
		tablepage=new TablePage(driver);
		tablepage.click_on_table();
		String expectedtxt="Table with Pagination Example";
		System.out.println(expectedtxt);
		String actualtxt=tablepage.get_heading();
		System.out.println(actualtxt);
		Assert.assertEquals(actualtxt, expectedtxt);
		String attr=tablepage.check_attribute();
		System.out.println(attr);
	
			
	}
	@Test
	public void verify_names()
	{
		tablepage=new TablePage(driver);
		tablepage.click_on_table();
		//tablepage.printAllNames();
		String printname=tablepage.getofficeofperson("Airi Satou");
		System.out.println(printname);
		
	}
	
	

	}

