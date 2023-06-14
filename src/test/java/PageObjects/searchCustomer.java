package PageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import StepDefinition.BaseClass;
import Utilities.WaitHelper;

public class searchCustomer extends BaseClass  {

	WebDriver driver;
	WaitHelper wait;
	
	public searchCustomer(WebDriver driver)
	{
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(id = "SearchEmail")WebElement email;
	@FindBy(id="SearchFirstName")WebElement firstName;
	@FindBy(id="SearchLastName")WebElement lastName;
	@FindBy(id="search-customers")WebElement button;
	@FindBy(xpath = "//table[@id='customers-grid']")WebElement table;
	@FindBy(xpath = "//table[@id='customers-grid']//tbody/tr")
	List<WebElement> tableRows;
	
	@FindBy(xpath ="//table[@id='customers-grid']//tbody/tr/td")
	List<WebElement>tableColumns;
	
	
	
	public void setEmail(String emailid) throws InterruptedException
	{
		Thread.sleep(3000);
		email.sendKeys(emailid);
	}
	public void setfirstname(String frstname) throws InterruptedException
	{
		
		Thread.sleep(3000);

		firstName.sendKeys(frstname);
	}
	public void setLastName(String LastName)
	{
		lastName.sendKeys(LastName);
	}
	
	 public void clickSearch()
	 {
		 
		 button.click();
	 }
	
	 public int getNoOfRows()
	 {
		 
		 return (tableRows.size());
	 }
	 public int getNoOfCoulmns()
	 {
		 
		 return (tableColumns.size());
	 }	
	public boolean searchCustomerByemail(String email )
	{
		boolean flag=false;
		
		for(int i=1;i<=getNoOfRows();i++)
		
		///html/body/div[3]/div[1]/form[1]/section/div/div/div/div[2]/div/div[2]/div[1]/div/div/div[2]/table/tbody/tr[1]/td[1]	
		{
			String emailid=table.findElement(By.xpath("//table[@id='customers-grid']/tbody/tr["+i+"]/td/[2]")).getText();
			
			System.out.println(emailid);
			
			if(emailid.equals(email))
			{
				flag=true;
			}
		}
		
		
	
		return flag;
	
	
	
	}	
	
}
