import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/resources", glue = {"com.javaautomation.api.request","com.javaautomation.api.response" })
public class TestRunner extends AbstractTestNGCucumberTests {
}
