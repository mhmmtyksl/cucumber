package stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
public class Hooks {

    @Before
    public void setUp(){

    }
    @After
    public void tearDown(Scenario scenario){ // bu classin amaci testin Failed olmasi durumunda screnshot almasi icin.
        final byte[] screenshot=((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
        if (scenario.isFailed()) {
            scenario.attach(screenshot, "image/png","screenshots");
        } // failed durumunda cekilen resimler raporun alt kisminda Attached image kisminda gozukur.
        Driver.closeDriver();
    }
}


// eger @Before ve @After notasyonlari ile bir method olusturacaksal Hooks adinda bir Class
// acariz ve bunlari bunun icine koyariz. kullanicilar rahatlikla bulabilsinler diye.
// yoksa Cucumber diger stepDefiniton larda da olsa bulur ve calistirir.
