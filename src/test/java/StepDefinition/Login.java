package StepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.edge.EdgeDriver;
import PageObjects.AddCustomerPage;
import PageObjects.LoginPage;
import PageObjects.searchCustomer;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;

public class Login extends BaseClass {





	//	@Before
	//	public void setup() throws IOException
	//	{
	//		prop=new Properties();
	//		FileInputStream fis=new FileInputStream("Config.properties");
	//		prop.load(fis);
	//		driver=new EdgeDriver();
	//		String browser=prop.getProperty("browser");
	//		String chromepath=prop.getProperty("chromepath");
	//		String firefoxpath=prop.getProperty("firefoxpath");
	//
	//		
	//		if(browser.equals("edge"))
	//		{
	//			System.out.println(browser);
	//		}
	//		else if(browser.equals("chromepath"))
	//		{
	//			System.out.println(chromepath);
	//		}
	//		else
	//		{
	//			System.out.println(firefoxpath);
	//		}
	//		
	//		
	//	}

	@Given(": User Launch the browser")
	public void user_launch_the_browser() {

		//logger=Logger.getLogger("nopCommerce");
		//PropertyConfigurator.configure("log4j.properties");

		lp=new LoginPage(driver);
		driver=new EdgeDriver();
		//logger.info("---Browser opens----");



	}

	@Then(": page title should be {string}")
	public void page_title_should_be(String title) {
		String tittle=driver.getTitle();
		if(tittle.contains("Login was unsuccessful."))
		{
			Assert.assertTrue(true);
			driver.close();

		}
		else
		{
			Assert.assertEquals(title, driver.getTitle());
			System.out.println("mani");
		}


	}

	@When(": User click on logout button")
	public void user_click_on_logout_button() throws InterruptedException {

		//logger.info("---User click on logout button----");

		Thread.sleep(2000);
		lp.logout();

	}





	@When(":User opens the Url {string}")
	public void user_opens_the_url(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();

	}

	@When(":User enters email as {string} and Password {string}")
	public void user_enters_email_as_and_password(String email, String Password) throws InterruptedException {

		Thread.sleep(2000);
		lp.setUserName(email);
		lp.setPassword(Password);



	}

	@When(":Click on login")
	public void click_on_login() throws InterruptedException {

		Thread.sleep(3000);
		lp.btn();
	}

	@When(": Close browser")
	public void close_browser() {
		driver.quit();
	}


	//////Add customers







	@Then(":User can view dashboard")
	public void user_can_view_dashboard() {

		addcus=new AddCustomerPage(driver);
		Assert.assertEquals("Dashboard / nopCommerce administration", addcus.getPageTitle());
	}

	@When(":User click on customers menu")
	public void user_click_on_customers_menu() throws InterruptedException {

		Thread.sleep(3000);
		addcus.clickOnCustomerMenu();
	}

	@When(":click customer item")
	public void click_customer_item() throws InterruptedException {

		Thread.sleep(3000);
		addcus.clickOnCustomerItem();
	}

	@When(":click on add new button")
	public void click_on_add_new_button() throws InterruptedException {


		Thread.sleep(3000);
		addcus.clickOnAddNewButton();
	}

	@Then(":User can view add new customer page")
	public void user_can_view_add_new_customer_page() throws InterruptedException {

		Thread.sleep(3000);
		Assert.assertEquals("Add a new customer / nopCommerce administration", addcus.getPageTitle());
	}

	@When(":user enters customer info")
	public void user_enters_customer_info() {

		String email=randomString()+"@gmail.com";
		addcus.enterEmail(email);
		addcus.enterPassword("mani123@");
		addcus.enterfirstName("Mani kumar");
		addcus.enterlastName("Beemarapu");
		addcus.setGender("Male");
		addcus.enterDOB("12-01-1998");
		addcus.enterCompanyName("kairos");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, 800)");
		addcus.setCustomersRole("Guest");
		addcus.setVendor("Vendor 1");
		addcus.enterAdminContent("This is for testing");



	}

	@When(":click on save button")
	public void click_on_save_button() throws InterruptedException {

		Thread.sleep(2000);
		addcus.clicksaveButton();

	}

	@Then(":User can view confirmation message {string}")
	public void user_can_view_confirmation_message(String string) {

		Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("The new customer has been added succesfully"));
	}




	////Search Customer


	@When(": Enter customer email")
	public void enter_customer_email() throws InterruptedException {

		srchcus=new searchCustomer(driver);
		srchcus.setEmail("victoria_victoria@nopCommerce.com");
	}

	@When(":click on search button")
	public void click_on_search_button() {

		srchcus.clickSearch();

	}

	@Then(": user should found email in the Search table")
	public void user_should_found_email_in_the_search_table() {

		boolean status=srchcus.searchCustomerByemail("victoria_victoria@nopCommerce.com");
		Assert.assertEquals(true,status);

	}





}
