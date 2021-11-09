package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions (
        plugin={"html:target/Pcucumber-reports1.html", // buradan raporlarin belli olmasi icin adina 1 ekledik
                "json:target/json-reports/Pcucumber1.json",
                "junit:target/xml-report/Pcucumber1.xml"},
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@Paralel1", // @ tagi Paralel1 olanlari calistir dedik

        dryRun = false


)
public class ParalelTestRunner1 {
}
