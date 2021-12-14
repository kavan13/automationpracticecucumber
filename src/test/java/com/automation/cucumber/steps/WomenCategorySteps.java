package com.automation.cucumber.steps;

import com.automation.pages.HomePage;
import com.automation.pages.ProductPage;
import com.automation.pages.WomenCategoryPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class WomenCategorySteps {
    @When("^I click on women tab$")
    public void iClickOnWomenTab() {
        new HomePage().clickonWomenButtonOnHomePage();
    }

    @Then("^I can see women category page$")
    public void iCanSeeWomenCategoryPage() {
        new WomenCategoryPage().verifyWomenText();

    }

    @And("^I select one \"([^\"]*)\"$")
    public void iSelectOne(String product)  {
       new ProductPage().selectedProduct(product);
    }

    @And("^I enter quantity \"([^\"]*)\"$")
    public void iEnterQuantity(String value)  {
       new ProductPage().enterQuantity(value);
    }

    @And("^I select size \"([^\"]*)\"$")
    public void iSelectSize(String size)  {
        new ProductPage().selectYourComfortSize(size);

    }

    @And("^I select color \"([^\"]*)\"$")
    public void iSelectColor(String colour)  {
         new ProductPage().selColour(colour);
    }

    @And("^I click on add to cart$")
    public void iClickOnAddToCart() {
        new ProductPage().clickOnAddToCartButton();
    }

    @Then("^I close popup$")
    public void iClosePopup() {
        new ProductPage().clickToClose();
    }
}
