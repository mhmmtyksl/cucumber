package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

// bunlar class in disinda package seviyesin olusturulur

@RunWith(Cucumber.class) // bunun anlami testlerimizi cucumber ile birlikte calistir demektir.
@CucumberOptions (
        features = "src/test/resources/features", // dosayanin uzerine sag tiklayip copy/content ile kopyaladik
        glue = "stepdefinitions", // bu adresi de content ile alinca hata verdi calismadi o sebeple sadece boyle yazdim
        tags = "@editor", // buraya feuatures da yazan notasyonlari yaziyoruz
        // anlami bu notasyonun yazili olduklarini calistir demek
        // burada and veya or yazabiliriz
        // and olursa ikisininde yazili olduguklarini calistirir
        // or olursa ikisinden birinin yazili olduklarini calistirir.

        dryRun = true
        // burasi false iken calistirirsak testi calistirir eksik bir adimla karsilasirsa
        // test failed olur ve bize eksik adimi raporlar
        // dryRun true dedigimizde testi calistirmadan bize eksik adimi verir ama run etmez
        // run etmesini istiyorsak false yazmaliyiz

        // burada true veya false farketmez run edince altta olusturulmayan methodlari veriyor ve bunlari olustur diyor.
        // direkt kopyalayip stepDefinitions a yapistir yapip yoruz ve gereksiz kisimlari siliyoruz
        // ardindan calistiriyoruz.
        // veya feature sayfasinda taminladigimizda altini koyu ciziyor ve uzerine gidince method olustur diyor
        // oradan da olustur deyince stepdefinitons ta method olusturuluyor.




)

public class Runner {
    // class icerisine birsey yazmiyoruz

    // Cucumber ile gelen 3 yeni yapi var bunlar Runner, stepDefinitions ve feature.
    // Runner dosyalarimizi run etmeyi sagliyor bunu sadece taglarla yapar bu taglari ararken feature icinde arar
    // bunlarin ilgili kodlarini ise stepDefinition da arar. tagi buldugunda calistirir.
    // bu tagdaki adimlari  ise stepDefinitonda arar ve bulur.
    //
}
