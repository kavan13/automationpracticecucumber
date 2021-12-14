package com.automation.pages;

import com.automation.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CreateAccountPage extends Utility {
    private static final Logger log = LogManager.getLogger(CreateAccountPage.class.getName());

    public CreateAccountPage() {
        PageFactory.initElements(driver, this);

    }

    @FindBy(css = "#customer_firstname")
    WebElement firstName;

    @FindBy(css = "#customer_lastname")
    WebElement lastName;

    @FindBy(css = "#passwd")
    WebElement password;

    @FindBy(css = "#address1")
    WebElement address;

    @FindBy(css = "#city")
    WebElement city;

    @FindBy(css = "#id_state")
    WebElement state;

    @FindBy(css = "#postcode")
    WebElement postcode;

    @FindBy(css = "#id_country")
    WebElement country;

    @FindBy(css = "#phone_mobile")
    WebElement phoneNumber;

    @FindBy(css = "button[id='submitAccount'] span")
    WebElement registerButton;

    public void enterYourFirstName(String name) {
        sendTextToElement(firstName, name);
        log.info("Enter firstname : "  + firstName.toString() );

    }

    public void enterYourLastName(String surname) {
        sendTextToElement(lastName, surname);
        log.info("Enter lastname : "   + lastName.toString() );

    }

    public void enterYourPassword(String pass) {
        sendTextToElement(password, pass);
        log.info("Enter password : " + password.toString());

    }

    public void enterYourAddress(String add) {
        sendTextToElement(address, add);
        log.info("Enter adress : "  + address.toString());

    }

    public void enterYourCity(String cityy) {
        sendTextToElement(city, cityy);
        log.info("Enter city : "  + city.toString() );

    }

    public void selectYourState(String st) {
        selectByValueFromDropDown(state, st);
        log.info("Enter State : " + state.toString() );

    }

    public void enterYourPhoneNumber(String phone) {
        sendTextToElement(phoneNumber, phone);
        log.info("Enter phone number : "   + phoneNumber.toString());

    }

    public void enterYourPostalCode(String postal) {
        sendTextToElement(postcode, postal);
        log.info("Enter postcode : "  + postcode.toString());

    }

    public void selectYourCountry(String countryy) {
        selectByValueFromDropDown(country, countryy);
        log.info("Enter Country : "  + country.toString());

    }

    public void clickOnRegisterButton() {
        clickOnElement(registerButton);
        log.info("clicking on Register Button : " + registerButton.toString() );

    }

}
