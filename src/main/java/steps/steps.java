package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class steps {
    private WebDriver driver;

    @Given("I open the Google website")
    public void iOpenGoogleWebsite() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @When("I enter {string} in the search bar")
    public void iEnterSearchTerm(String searchTerm) {
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys(searchTerm);
    }

    @And("I click the search button")
    public void iClickSearchButton() {
        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();
    }

    @Then("I should see search results for {string}")
    public void iShouldSeeSearchResults(String expectedResults) {
        WebElement resultStats = driver.findElement(By.id("result-stats"));
        String actualResults = resultStats.getText();
        assertEquals("Search results do not match", expectedResults, actualResults);
        driver.quit();
    }
}