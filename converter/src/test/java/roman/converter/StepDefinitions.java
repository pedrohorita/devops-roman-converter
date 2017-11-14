package roman.converter;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/roman/converter/features",
        glue = "roman.converter.StepDefinitions",
        plugin = { 
                    "pretty",
                    "html:target/converter",
                } 

        )
public class StepDefinitions {
}
