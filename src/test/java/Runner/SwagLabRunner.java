package Runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\sanja\\IdeaProjects\\22ndMarBDDCucumberFramewor\\src\\test\\java\\Features\\Ex3_SwagLabsPlaceOrderE2E.feature",
        glue = {"Steps","Hooks"},
        publish = true,
        plugin = {"pretty","html:Reports/SwagLabLoginReport.html"}
)

public class SwagLabRunner extends AbstractTestNGCucumberTests
{
}
