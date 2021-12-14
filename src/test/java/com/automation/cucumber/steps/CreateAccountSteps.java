package com.automation.cucumber.steps;

import com.automation.pages.CreateAccountPage;
import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class CreateAccountSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {
    }

    @When("^I click on sign in link$")
    public void iClickOnSignInLink() {
        new HomePage().clickOnSignInLinkOnHomePage();
    }

    @And("^I enter email  \"([^\"]*)\"$")
    public void iEnterEmail(String email)  {
        new SignInPage().enterRandomEmailfornewacountcreation();

    }

    @And("^I click on create new account button$")
    public void iClickOnCreateNewAccountButton() {
        new SignInPage().clickOnCreateAnAccountButton();
    }

    @And("^I enter first name \"([^\"]*)\"$")
    public void iEnterFirstName(String name)  {
       new CreateAccountPage().enterYourFirstName(name);
    }

    @And("^I enter last name \"([^\"]*)\"$")
    public void iEnterLastName(String lastname)  {
        new CreateAccountPage().enterYourLastName(lastname);

    }

    @And("^I enter register password \"([^\"]*)\"$")
    public void iEnterRegisterPassword(String password)  {
        new CreateAccountPage().enterYourPassword(password);

    }

    @And("^I enter address \"([^\"]*)\"$")
    public void iEnterAddress(String address)  {
        new CreateAccountPage().enterYourAddress(address);

    }

    @And("^I enter city \"([^\"]*)\"$")
    public void iEnterCity(String city)  {
       new CreateAccountPage().enterYourCity(city);
    }

    @And("^I select state \"([^\"]*)\"$")
    public void iSelectState(String state)  {
     new CreateAccountPage().selectYourState(state);
    }

    @And("^I enter postal code \"([^\"]*)\"$")
    public void iEnterPostalCode(String postal)  {
       new CreateAccountPage().enterYourPostalCode(postal);
    }

    @And("^I select country \"([^\"]*)\"$")
    public void iSelectCountry(String country)  {
       new CreateAccountPage().selectYourCountry(country);
    }

    @And("^I enter phone number \"([^\"]*)\"$")
    public void iEnterPhoneNumber(String phone)  {
       new CreateAccountPage().enterYourPhoneNumber(phone);
    }

    @And("^I click on register button$")
    public void iClickOnRegisterButton() {
        new CreateAccountPage().clickOnRegisterButton();
    }
}
