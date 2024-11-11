import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-html-report"},
        features = {"src/main/resources/features/Sanity.feature","src/main/resources/features/Smoke.feature","src/main/resources/features/Sanity_Postgres.feature","src/main/resources/features/Smoke_Postgres.feature"},
        monochrome = true,
        tags = {"@Sanity","@Smoke","@Sanity_Postgres","@Smoke_Postgres"}
)
public class RunCukes {


}
