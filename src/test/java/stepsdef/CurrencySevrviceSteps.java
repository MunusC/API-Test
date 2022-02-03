package stepsdef;

import static io.restassured.RestAssured.given;
import static org.junit.Assert.assertTrue;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import utils.ReportHelper;

public class CurrencySevrviceSteps {

	private Response response;
	private Map<String, String> Currencies;

	@Given("^the end point is up with status code 200 for Get request$")
	public void endPointUp() throws Throwable {
		response = given().when().get().then().log().all().assertThat().statusCode(200).extract().response();
	}

	@When("^I count the number of currencies returned in the response$")
	public void i_count_the_number_of_currencies_returned_in_the_reposone() {

		Currencies = response.path("conversion_rates");
		ReportHelper.addStepLog("Total Number of Currencies are : " + Currencies.size());
	}

	@Then("^I am able to verify currency \"([^\"]*)\" is shown within the response$")
	public void i_am_able_to_verify_currency_something_is_shown_within_the_response(String gbp) throws Throwable {

		assertTrue(Currencies.containsKey(gbp));
		ReportHelper.addStepLog("Currency " + gbp + " is present in the Currency Conversion list");
	}

}
