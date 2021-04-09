
package valuemomentum;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\testing\\testautomation\\src\\test\\java\\valuemomentum",plugin= {"pretty","html:target/cucumber"},dryRun=true)
public class RunCucumberTest {
	

}
