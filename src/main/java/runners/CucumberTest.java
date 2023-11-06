package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(value = Cucumber.class)
@CucumberOptions(
        features = "src/main/resources/features",
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class CucumberTest {
}
    