package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\JavaEclipse\\Cucumber\\features\\customer.feature",
		glue="StepDefinition",
		dryRun=false,
		monochrome =true,
		plugin={"pretty","html:test-ouput.html"}
		
		)
public class RunnerForEcommerce {

}
