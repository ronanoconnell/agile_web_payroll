package uk.co.keyoflife;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class PayrollSteps {
  private final WebDriver driver = new ChromeDriver();
	
  @Given("I visit the payroll web site")
  public void given() {
	  driver.get("http://localhost:8080");
  }

  @Then("The Page title should be {string}")
  public void checkTitle(String expectedPageTitle) {
	 assertEquals(expectedPageTitle, driver.getTitle()); 
  }
  
  @After()
  public void closeBrowser() {
    driver.quit();
  }
}
