package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage {

	WebDriver driver;

	public AddCustomerPage(WebDriver driver)
	{

		this.driver=driver;

	}




	By customerMenu=By.xpath("//i[@class=\"nav-icon far fa-user\"]");
	By customerItem=By.xpath("//a[@href=\"/Admin/Customer/List\"]//i[@class=\"nav-icon far fa-dot-circle\"]");
	By addNewButton=By.xpath("//a[@class=\"btn btn-primary\"]");


	By emailid=By.xpath("//input[@id=\"Email\"]");
	By password=By.xpath("//input[@id=\"Password\"]");
	By firstName=By.xpath("//input[@id=\"FirstName\"]");
	By lastName=By.xpath("//input[@id=\"LastName\"]");
	By genderMale=By.xpath("//input[@id=\"Gender_Male\"]");
	By genderFemale=By.xpath("//input[@id=\"Gender_Female\"]");
	By DateOfBirth=By.xpath("//input[@id=\"DateOfBirth\"]");

	By company=By.xpath("//input[@id=\"Company\"]");
	By CustomerRoles=By.xpath("//div[@class=\"card-body\"]//div[@class=\"form-group row\"][10]");
	By drpVendor=By.xpath("//select[@class=\"form-control valid\"]");
	By adminstrators=By.xpath("//li[contains(text(),'Administrators')]");
	By Registered=By.xpath("//li[contains(text(),'Registered')]");
	By Guests=By.xpath("//li[contains(text(),'Guests')]");
	By Vendors=By.xpath("//li[contains(text(),'Vendors')]");


	By adminContent=By.xpath("//textarea[@id=\"AdminComment\"]");
	By saveButton=By.xpath("adminContent");


	//Action Methods

	public String getPageTitle()
	{
		return driver.getTitle();
	}


	
	
	
	
	public void clickOnCustomerMenu()
	{
		driver.findElement(customerMenu).click();
	}
	public void clickOnCustomerItem()
	{
		driver.findElement(customerItem).click();
	}
	public void clickOnAddNewButton()
	{
		driver.findElement(addNewButton).click();
	}


	public void enterEmail(String email)
	{
		driver.findElement(emailid).sendKeys(email);
	}
	public void enterPassword(String psd)
	{
		driver.findElement(password).sendKeys(psd);
	}
	public void enterfirstName(String firstname)
	{
		driver.findElement(firstName).sendKeys(firstname);;
	}
	public void enterlastName(String lastname)
	{
		driver.findElement(lastName).sendKeys(lastname);
	}
//	public void enterGender(String male)
//	{
//		driver.findElement(genderMale).sendKeys(male);
//	}
//	public void enterGender1(String female)
//	{
//		driver.findElement(genderFemale).sendKeys(female);
//	}
	public void enterDOB(String date)
	{
		driver.findElement(DateOfBirth).sendKeys(date);
	}
	public void enterCompanyName(String cmpnyname)
	{
		driver.findElement(company).sendKeys(cmpnyname);
	}
	public void clickCustomerRoles()
	{
		driver.findElement(CustomerRoles).click();;
	}
	public void setCustomersRole(String role)
	{
		if(!role.equals("Vendors"))
		{
			driver.findElement(By.xpath("//ul[@id=\"SelectedCustomerRoleIds_taglist\"]"));	
		}
		driver.findElement(CustomerRoles).click();
		WebElement listitem ;

		if(role.equals("Administrators"))
		{
			listitem=driver.findElement(adminstrators);
		}
		else if(role.equals("Registered"))
		{
			listitem=driver.findElement(Registered);
		}
		else if(role.equals("Guests"))
		{
			listitem=driver.findElement(Guests);
		}
		else
		{
			listitem=driver.findElement(Guests);
		}

		//listitem.click();

		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", listitem);

		
	}
	public void setVendor(String value)
	{

		Select drp=new Select(driver.findElement(drpVendor));
		drp.selectByValue(value);
	}
	public void setGender(String gender)
	{
		if(gender.equals("Male"))
		{
			driver.findElement(genderMale).click();
		}
		else if(gender.equals("Female"))
		{
			driver.findElement(genderFemale).click();
		}


	}
	public void enterAdminContent(String content)
	{
		driver.findElement(adminContent).sendKeys(content);
	}
	public void clicksaveButton()
	{
		driver.findElement(saveButton).click();;
	}
	
}
