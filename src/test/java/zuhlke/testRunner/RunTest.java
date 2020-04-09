package zuhlke.testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(
        features = "classpath:features",
        plugin = {"pretty", "html:target/cucumber-html-report","json:cucumber.json"},
        tags = {},
        glue = "/zuhlke/stepDefinations")
public class RunTest {

}
