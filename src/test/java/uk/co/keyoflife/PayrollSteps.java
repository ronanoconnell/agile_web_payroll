package uk.co.keyoflife;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

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

  @Given("An employee named {string}")
  public void anEmployeeNamed(String employeeName) {

  }

  @And("is paid £{double} per annum")
  public void paidPerAnnum(Double annualSalary) {
  }

  @And("has an annual Tax credit of £{double}")
  public void hasAnAnnualTaxFreeCrediteOf(Double annualTaxCredit) {

  }

  @When("their pay is calculated")
  public void therePayIsCalculated() {
  }

  @Then("their net pay is £{double}")
  public void theirNetPayIs(double netPay) {
      fail("Test not implemented");
  }
}
