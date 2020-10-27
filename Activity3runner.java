package cucumberTest;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
    features = "Features",
    glue = {"stepDefinition"},
    tags = "@Activity3",
    monochrome = true,
    publish=true,
    plugin= {"pretty","html:target/cucumber-reports/reports"}
)
public class Activity3runner
{

}
