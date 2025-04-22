package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc1Page;

import static org.junit.Assert.assertTrue;

public class tc1Steps {

    WebDriver driver;
    tc1Page page;

    public tc1Steps() {
        this.driver = Hooks.getDriver();
        page = PageFactory.initElements(driver, tc1Page.class);
    }

    @Given("que el documento PDF de pruebas está disponible")
    public void documento_pdf_disponible() {
        // Se asume que se monta algún sistema de archivos virtual o se navega
        // hacia donde el archivo está disponible.
        assertTrue(page.isDocumentAvailable());
    }

    @When("reviso el documento PDF de pruebas")
    public void reviso_documento_pdf() {
        page.reviewDocument();
    }

    @Then("el documento debe ser validado y confirmado correctamente")
    public void documento_validado_y_confirmado() {
        assertTrue(page.isDocumentValidated());
    }
}