package stepdefinitions;

import io.cucumber.java.en.Then;
import pages.EditorPage;

public class EditorStepDefinitions {
    EditorPage editorPage=new EditorPage();

    @Then("new butonuna basar")
    public void new_butonuna_basar() {
        editorPage.newButonu.click();
    }
    @Then("editor firstName kutusuna {string} bilgileri girer")
    public void editor_first_name_kutusuna_bilgileri_girer(String firstName) {
        editorPage.firtNameKutusu.sendKeys(firstName);
    }
    @Then("editor lastName kutusuna {string} bilgileri girer")
    public void editor_last_name_kutusuna_bilgileri_girer(String lastName) {
        editorPage.lastNameKutusu.sendKeys(lastName);
    }
    @Then("editor position kutusuna {string} bilgileri girer")
    public void editor_position_kutusuna_bilgileri_girer(String position) {
        editorPage.positionKutusu.sendKeys(position);
    }
    @Then("editor office kutusuna {string} bilgileri girer")
    public void editor_office_kutusuna_bilgileri_girer(String office) {
        editorPage.officeKutusu.sendKeys(office);
    }
    @Then("editor extension kutusuna {string} bilgileri girer")
    public void editor_extension_kutusuna_bilgileri_girer(String extension) {
        editorPage.extensionKutusu.sendKeys(extension);
    }
    @Then("editor startDate kutusuna {string} bilgileri girer")
    public void editor_start_date_kutusuna_bilgileri_girer(String startDate) {
        editorPage.startDateKutusu.sendKeys(startDate);
    }
    @Then("editor salary kutusuna {string} bilgileri girer")
    public void editor_salary_kutusuna_bilgileri_girer(String salary) {
        editorPage.salaryKutusu.sendKeys(salary);
    }
    @Then("Create tusuna basar")
    public void create_tusuna_basar() {
        editorPage.createButonu.click();
    }




}
