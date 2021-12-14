package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.SignInPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class SignInPageSteps {
    @Then("^I navigate to sign in page successfully with authentication message$")
    public void iNavigateToSignInPageSuccessfullyWithAuthenticationMessage() {
        String expectedMessage = "AUTHENTICATION";
        String actualMessage = new SignInPage().getAuthenticationText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }

    @And("^I enter username \"([^\"]*)\"$")
    public void iEnterUsername(String email)  {
        new SignInPage().enterYouremail(email);

    }

    @And("^I enter password \"([^\"]*)\"$")
    public void iEnterPassword(String password)  {
        new SignInPage().enterYourPassword(password);

    }

    @And("^I click on signin button$")
    public void iClickOnSigninButton() {
        new SignInPage().clickOnSignInButton();
    }

    @Then("^I should see the error message\"([^\"]*)\"$")
    public void iShouldSeeTheErrorMessage(String text)  {
      new SignInPage().verifyTextSuccessfully(text);
    }

    @Then("^I can see signout link$")
    public void iCanSeeSignoutLink() {
        new SignInPage().verifySignOutButtonIsDisplayed();
    }

    @And("^I click on signout button$")
    public void iClickOnSignoutButton() {
        new SignInPage().clickOnSignOutButton();
    }

    @Then("^I can see sign in link again$")
    public void iCanSeeSignInLinkAgain() {
        new HomePage().verifySignInLinkIsDisplayed();
    }
}
