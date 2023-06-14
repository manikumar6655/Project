package StepDefinition;

import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;

import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.searchCustomer;


public class BaseClass {

	
	
	public WebDriver driver;
	public LoginPage lp;
	public AddCustomerPage addcus;
	public searchCustomer srchcus;
	//spublic static Logger logger;
	public static Properties prop;
	
	
	public static String randomString()
	{
		String generatedString1=RandomStringUtils.randomAlphabetic(5);
		
		return generatedString1;
	
	}
	
	
	
	
	
}
