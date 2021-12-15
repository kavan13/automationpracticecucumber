package com.automation.pages;

import com.automation.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class SignInPage extends Utility {
    private static final Logger log = LogManager.getLogger(SignInPage.class.getName());
    public SignInPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='email']")
    WebElement emailadressField;

    @FindBy(xpath = "//input[@id='passwd']")
    WebElement passwordField;

    @FindBy(xpath = "//span[normalize-space()='Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//span[normalize-space()='Create an account']")
    WebElement createAccountButton;

    @FindBy(xpath = "//h1[@class='page-heading']")
    WebElement authenticationText;

    @FindBy(xpath = "//h3[normalize-space()='Create an account']")
    WebElement createAccountText;

    @FindBy(xpath = "//a[@title='Log me out']")
    WebElement singout;

    @FindBy(xpath = "//input[@id='email_create']")
    WebElement emailfornewaccount;

    @FindBy(css = "button[id='SubmitCreate'] span")
    WebElement createAccounTAB;


    public void clickOnCreateAnAccountButton() {
        clickOnElement(createAccounTAB);
        log.info("clicking on create an account button: " + createAccounTAB.toString());

    }

    public void enterRandomEmailfornewacountcreation() {
        sendRandomEmailToElement(emailfornewaccount);
        log.info("Enter RandomEmail : " + emailfornewaccount.toString());

    }


    public void enterEmailfornewacountcreation(String email) {
        log.info("Enter email to email adress field " + emailfornewaccount.toString());
        sendTextToElement(emailfornewaccount,email);
    }


    public void enterYouremail(String emailId) {                   //parameterized method
        log.info("Enter email to email adress field " + emailadressField.toString());
        sendTextToElement(emailadressField, emailId);

    }

    public void enterYourPassword(String password) {
        log.info("Enter Password to password field " + passwordField.toString());
        sendTextToElement(passwordField, password);
    }

    public void clickOnSignInButton() {
        log.info("clicking on SignInButton " + signInButton.toString());
        clickOnElement(signInButton);
    }

    public void loginToAutomationPractice(String emailId) {
        enterYouremail(emailId);

        clickOnSignInButton();
    }

    public String verifyTextSuccessfully(String text) {
        WebElement result = driver.findElement(By.cssSelector("div[class='alert alert-danger'] ol li"));
        return getTextFromElement(result);
    }

    public void verifySignOutButtonIsDisplayed() {
        singout.isDisplayed();
    }

    public void clickOnSignOutButton() {
        clickOnElement(singout);
        log.info("clicking on sign out button: " + singout.toString());

    }

    public String getAuthenticationText() {
        log.info("Get Authentication text: " + authenticationText.toString());

        return getTextFromElement(authenticationText);

    }

    public String createAccountText() {
        String textVerify1 = getTextFromElement(createAccountText);
        log.info("get create an account text: " + createAccountText.toString());

        return textVerify1;

    }


}
