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
        driver.get("https://duckduckgo.com/");
    }

    @When("I click the search box")
    public void iClickSearchBox() {
        WebElement searchButton = driver.findElement(By.xpath("//input[@id='searchbox_input']"));
        searchButton.click();
    }

    @And("I enter {string} in the search bar")
    public void iEnterSearchTerm(String searchTerm) {
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='searchbox_input']"));
        searchBox.sendKeys(searchTerm);
    }

    @Then("I click the search button")
    public void iClickSearchButton() {
            WebElement searchButton = driver.findElement(By.xpath("//body/div[@id='__next']/main[1]/article[1]/div[1]/div[1]/div[1]/section[1]/form[1]/div[1]/div[1]/button[1]"));
            searchButton.click();
    }

}