package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class tc2Page {
    WebDriver driver;

    @FindBy(css = "YOUR_MATRIX_CSS_SELECTOR")
    WebElement testCaseMatrixElement;

    public tc2Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openGoogleSheets(String url) {
        driver.get(url);
    }

    public boolean isTestCaseMatrixDisplayedCorrectly() {
        // Implement logic to verify if the test case matrix is displayed with the correct data
        return testCaseMatrixElement.isDisplayed(); // Modify this based on more precise validation needed
    }
}