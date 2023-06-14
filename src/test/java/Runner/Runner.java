package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\JavaEclipse\\Cucumber\\features\\Login.feature",
		glue="steps",
		dryRun=false
		
	
		
		)




public class Runner {

}
