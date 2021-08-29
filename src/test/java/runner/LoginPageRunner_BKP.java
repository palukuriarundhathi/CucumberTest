package runner;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
				features = "/src/main/test/features/Test2.feature",
				glue={"/src/main/test/stepDefinition"}
				)

public class LoginPageRunner_BKP {

}
