package blaze.demo.steps;

import org.openqa.selenium.chrome.ChromeDriver;
import blaze.demo.pages.BlazeDemoPage;
import blaze.demo.util.Constants;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BlazeDemoSteps {
	
	BlazeDemoPage purchaseFlight;

	@Given("User navigates to Register Page {string}")
	public void user_navigates_to_register_page(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		Constants.driver = new ChromeDriver();
		Thread.sleep(2000);
		Constants.driver.manage().window().maximize();
		Constants.driver.get(url);
		Thread.sleep(2000);
		
		purchaseFlight = new BlazeDemoPage();
	}

	@When("User enters FirstAndLastName {string}")
	public void userEntersFirstAndLastName(String firstLastName) {
		purchaseFlight.inputFirstLastName(firstLastName);
	}

	@When("User enters Address {string}")
	public void userEntersAddress(String address) {
		purchaseFlight.inputAddress(address);
	}

	@When("User enters City {string}")
	public void userEntersCity(String city) {
		purchaseFlight.inputcity(city);
	}

	@When("User enters State {string}")
	public void userEntersState(String state) {
		purchaseFlight.inputState(state);
	}

	@When("User enters ZipCode {string}")
	public void userEntersZipcode(String zipCode) {
		purchaseFlight.inputZipCode(zipCode);
	}

	@When("User selects CardType {string}")
	public void userSelectsCardType(String cardType) {
		purchaseFlight.inputCardType(cardType);
	}

	@When("User enters CreditCardNumber {string}")
	public void userEntersCreditCardNumber(String creditCardNumber) {
		purchaseFlight.inputCreditCardNumber(creditCardNumber);
	}

	@When("User enters Month {string}")
	public void userEntersMonth(String month) {
		purchaseFlight.inputMonth(month);
	}

	@When("User enters Year {string}")
	public void userEntersYear(String year) {
		purchaseFlight.inputYear(year);
	}

	@When("User enters NameOnCard {string}")
	public void userEntersNameOnCard(String nameOnCard) {
		purchaseFlight.inputNameOnCard(nameOnCard);
	}

	@When("User clicks on Remember Me box")
	public void userClicksOnRememberMeBox() {
		purchaseFlight.clickRememberMeBox();
	}

	@When("User clicks on Purchase Flight button")
	public void userClicksOnPurchaseFlightButton() {
		purchaseFlight.clickPurchaseButton();
	}

	@Then("User verifies correct message {string}")
	public void userVerifiesCorrectMessage(String message) throws InterruptedException {
		purchaseFlight.message(message);
		
		Thread.sleep(2000);
		Constants.driver.quit();
	}
}
