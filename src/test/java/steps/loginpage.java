package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


import StepDefinition.BaseClass;
import io.cucumber.java.en.*;

public class loginpage  extends BaseClass{




	@Given("User Launch the browser")
	public void User_launch_the_browser() {

		driver=new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "//Cucumber//Driver//msedgedriver.exe");

	}






	@When(": User opens the Url {string}")
	public void user_opens_the_url(String Url) {

		driver.get(Url);
		driver.manage().window().maximize();

	}

	@When(": User enters email as {string} and Password {string}")
	public void user_enters_email_as_and_password(String email, String password) throws InterruptedException {

		Thread.sleep(2000);
		lp.setUserName(email);
		lp.setPassword(password);



	}

	@When(": Click on login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(2000);
		lp.btn();

	}

	@When(": close browser")
	public void close_browser() {
		
		driver.quit();
	}
}
