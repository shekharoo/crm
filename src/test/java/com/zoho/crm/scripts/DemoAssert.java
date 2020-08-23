package com.zoho.crm.scripts;

import org.testng.Assert;
import org.testng.annotations.Test;



public class DemoAssert {
	
	@Test
	public void test1()
	{
		String title = "My name is Shekhar";
		
		//To verify the exact elements
		Assert.assertEquals(title, "My name is Shekhar");
		
		//To test for partial or dynamic elements
		Assert.assertTrue(title.contains("My"));
		System.out.println(1);
		
	}
}
