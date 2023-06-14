package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="//input[@id='Email']")private WebElement Email;
	@FindBy(id = "Password")private WebElement password;
	@FindBy(xpath ="//button[@type=\"submit\"]")private  WebElement btn;
	@FindBy(xpath = "//a[text()='Logout']")private WebElement logOut;

	
	public void setUserName(String uname) throws InterruptedException
	{
		Thread.sleep(2000);
		Email.clear();
		Thread.sleep(1000);
		Email.sendKeys(uname);
	}

	public void setPassword(String pass) throws InterruptedException
	{
		Thread.sleep(2000);
		password.clear();
		Thread.sleep(1000);
		password.sendKeys(pass);
	}
	public void btn() throws InterruptedException
	{
		Thread.sleep(1000);
		btn.click();
	}
	public void logout() throws InterruptedException
	{
		logOut.click();
	}





}
