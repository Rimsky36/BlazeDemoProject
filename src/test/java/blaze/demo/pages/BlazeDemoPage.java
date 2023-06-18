package blaze.demo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import blaze.demo.util.Constants;

public class BlazeDemoPage {

	@FindBy(id = "inputName")
	WebElement firstLastNameField;

	@FindBy(id = "address")
	WebElement addressField;

	@FindBy(id = "city")
	WebElement cityField;

	@FindBy(id = "state")
	WebElement stateField;

	@FindBy(id = "zipCode")
	WebElement zipCodeField;

	@FindBy(id = "cardType")
	WebElement cardTypeDropDown;

	@FindBy(id = "creditCardNumber")
	WebElement creditCardNumberField;

	@FindBy(id = "creditCardMonth")
	WebElement creditCardMonthField;

	@FindBy(id = "creditCardYear")
	WebElement creditCardYearField;

	@FindBy(id = "nameOnCard")
	WebElement nameOnCardField;

	@FindBy(xpath = "//input[@id='rememberMe']")
	WebElement rememberMeBox;

	@FindBy(xpath = "//input[@value='Purchase Flight']")
	WebElement PurchaseFlightField;

	@FindBy(xpath = "//h1[text()='Thank you for your purchase today!']")
	WebElement Message;
///////////////////////////////////////////////////////////////////	

	// Constructor
	public BlazeDemoPage() {
		PageFactory.initElements(Constants.driver, this);
	}

/////////////////////////////////////////////////////////////////////
	public void inputFirstLastName(String firstLastName) {
		firstLastNameField.sendKeys(firstLastName);

	}

	public void inputAddress(String address) {
		addressField.sendKeys(address);

	}

	public void inputcity(String city) {
		cityField.sendKeys(city);

	}

	public void inputState(String state) {
		stateField.sendKeys(state);

	}

	public void inputZipCode(String zipCode) {
		zipCodeField.sendKeys(zipCode);

	}

	public void inputCardType(String cardType) {
		Select selectCardType = new Select(cardTypeDropDown);
		selectCardType.selectByVisibleText(cardType);

	}

	public void inputCreditCardNumber(String creditCardNumber) {
		creditCardNumberField.sendKeys(creditCardNumber);

	}

	public void inputMonth(String month) {
		creditCardMonthField.sendKeys(month);

	}

	public void inputYear(String year) {
		creditCardYearField.sendKeys(year);

	}

	public void inputNameOnCard(String nameOnCard) {
		nameOnCardField.sendKeys(nameOnCard);

	}

	public void clickRememberMeBox() {
		nameOnCardField.click();

	}

	public void clickPurchaseButton() {
		PurchaseFlightField.click();

	}

	public void message(String message) {
		String confirmationMessager = Message.getText();
		if (confirmationMessager.equals(message)) {
			System.out.println("TEST PASSED");

		} else {
			System.out.println("TEST FAILED");

		}

	}
}
