package dbStepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DbStepDefinition {

    String url="jdbc:sqlserver://184.168.194.58:1433;databaseName=qaconcorthotel; user=Ahmet_User;password=Ahmet123!";
    String username="Ahmet_User";
    String password="Ahmet123!";
    Connection connection;
    Statement statement;
    ResultSet resultSet;

    @Given("kullanici CHQA database ine baglanir")
    public void kullaniciCHQADatabaseIneBaglanir() throws SQLException {
        connection=DriverManager.getConnection(url, username, password); // bunu yazinca .getConnection altini cizdi ve exception firlatinca duzeldi
        statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
    }

    @Then("kullanici {string} tablosundaki {string} verilerini alir")
    public void kullaniciTablosundakiVerileriniAlir(String table, String field) throws SQLException {
        // SELECT Price FROM tHOTELROOM
        String readQuery="SELECT " + field + " FROM " + table; // anlami select price from tHotelroom
        resultSet=statement.executeQuery(readQuery);
    }

    @And("kullanici {string} sutunundaki verileri okur ve istedigi islemleri yapar")
    public void kullaniciSutunundakiVerileriOkurVeIstedigiIslemleriYapar(String field) throws SQLException {

        // resultSet iterator gibi calisir.
        resultSet.first();// bu satiri yazmayinca hata verdi ve calismadi
        // oncelikle adresi belirtmemiz gerekir. bu sekilde 1. ye git dedik ve getirdi

        System.out.println(resultSet.getObject(field).toString());

        System.out.println(resultSet.next()); // bu sekilde yazdirirsak boolean sonuc verir.
        // resultSet.next(); bir sonraki objeye gecer sonraki eleman varsa true yoksa false doner

        System.out.println(resultSet.getObject(field).toString());

        // son objeye gider ve sonra resultSet.last(); calistirirsak bir sonraki meleman olmayacagi icin bize false doner
        resultSet.last();
        System.out.println(resultSet.next());

        // tum listeyi yazdirmak istersek while loop ile birlikte resultSet.next() kullanabiliriz.
        // cunku resultSet.next() bir sonraki obje var oldukca bize true dondurecek ve while loop
        // calismaya devam edecek.
        // son objeye ulastigimizda resultSet.next() false donecek ve while loop bitecek
        // ancak biz yukarda resultSet.last(); ile son objeye gittigimiz icin while loop u calistirirsak
        // birsey yazdirmayacak ve hata verecek
        // bunun icin while loop u calistirmadan resultSet.next() ile ilk objeye yeniden gitmeliyiz

        /*
        resultSet.next();// bununla tekrar 1. objeye gittik
        while (resultSet.next()) { // ustteki satir ilk nesneye goturdu bizi ancak buradaki resultSet.next()
            // bizi bir sonraki nesneye gecirir ve liste ikinciden baslar.
            System.out.println(resultSet.getObject(field.toString()));
        }
         */

        /*
        resultSet.absolute(0);
        while (resultSet.next()) {
            System.out.println(resultSet.getObject(field).toString());
        }
        // bura hata verdigi icin yoruma aldik asagiya devam edebilmek icin
         */

        // varsa ilk yuz fiyati bir liste olarak kaydedelim.
        int count=1;
        resultSet.absolute(0);
        List<Double> ilkYuzSayi=new ArrayList<>();

        while (count<=100 && resultSet.next()) {
            ilkYuzSayi.add(resultSet.getDouble(field));
            count++;
        }
        System.out.println(ilkYuzSayi);
        System.out.println(ilkYuzSayi.size()); // burda kac tane oldugunu gormek icin yazdik

        // 7. fiyatin double olarak 620.0 oldugunu test edin.
        resultSet.absolute(7);
        double yedinciSayi=resultSet.getDouble(field);

        Assert.assertTrue(yedinciSayi==620.0);

    }
}
