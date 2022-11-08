package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Assertion1 {
	@Test
	public void actiTime() 
	{
		Reporter.log("enter the url",true);
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(false,true);
        Reporter.log("varify the login page",true);
        Reporter.log("Enter the username",true);
        Reporter.log("Enter the password",true);
        
        Reporter.log("click on login button",true);
        Reporter.log("varify the home page",true);
        Reporter.log("create user",true);
        Reporter.log("delete user",true);
        Reporter.log("creates reports",true);
        
        softassert.assertAll();
	}
}
