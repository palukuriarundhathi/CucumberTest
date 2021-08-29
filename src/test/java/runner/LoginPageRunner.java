package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "/CucumberTestProject/src/test/java/features/Test2",
				glue={"stepDefinition"}
				)

public class LoginPageRunner {

}
