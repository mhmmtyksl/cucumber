package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Background", // burada and veya or yazabiliriz
        // and olursa ikisininde yazili olduguklarini calistirir
        // or olursa ikisinden birinin yazili olduklarini calistirir.

        dryRun = false
        // burasi false iken calistirirsak testi calistirir eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar
        // dryRun true dedigimizde testi calistirmadan bize eksik adimi verir



)

public class Runner {
}
