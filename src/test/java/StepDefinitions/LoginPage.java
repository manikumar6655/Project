package StepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.en.*;

public class LoginPage {

	public static WebDriver driver;
	@Given("I launch the chrome browser")
	public void i_launch_the_chrome_browser() {

		driver=new EdgeDriver();
		System.setProperty("webdriver.edge.driver", "//Cucumber//Driver//msedgedriver.exe");

	}

	@When("I open xyz home page")
	public void i_open_xyz_home_page() {
		driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");

	}

	@Then("I verify that the Name present on page")
	public void i_verify_that_the_name_present_on_page() throws InterruptedException {
		Thread.sleep(3000);
		boolean status=driver.findElement(By.xpath("//strong[text()='XYZ Bank']")).isDisplayed();
		Assert.assertEquals(true, status);
	

	}

	@And("close the browser")
	public void close_the_browser() {
		driver.quit();

	}
}
