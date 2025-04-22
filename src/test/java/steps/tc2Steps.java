package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc2Page;
import util.WebDriverManager;

public class tc2Steps {
    WebDriver driver = WebDriverManager.getDriver();
    tc2Page page = PageFactory.initElements(driver, tc2Page.class);

    @Given("I navigate to the Google Sheets URL")
    public void iNavigateToTheGoogleSheetsUrl() {
        String url = "YOUR_GOOGLE_SHEETS_URL";
        page.openGoogleSheets(url);
    }

    @Then("I should see the test case matrix displayed with the correct data")
    public void iShouldSeeTheTestCaseMatrixDisplayedWithTheCorrectData() {
        Assert.assertTrue(page.isTestCaseMatrixDisplayedCorrectly());
    }
}