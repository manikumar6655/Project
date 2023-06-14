package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\JavaEclipse\\Cucumber\\src\\main\\java\\features\\xyzBank.feature",
		glue="StepDefinitions")
		
	
public class TestRunner{

	
}
