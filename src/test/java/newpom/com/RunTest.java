package newpom.com;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by suzi on 09/05/16.
 */


@RunWith(Cucumber.class)
@CucumberOptions(format = {"html:target/SushilaReports"},
        tags = "@login",
        features = "src/test/Resources/"
)
public class RunTest {
}
