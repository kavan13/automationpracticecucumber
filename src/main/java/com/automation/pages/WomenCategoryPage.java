package com.automation.pages;

import com.automation.utility.Utility;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WomenCategoryPage extends Utility {
    private static final Logger log = LogManager.getLogger(WomenCategoryPage.class.getName());

    public WomenCategoryPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[@class='title_block']")
    WebElement womenText;

    @FindBy(xpath = "//div[@class='block_content']//a[normalize-space()='Tops']")
    WebElement topsLink;

    @FindBy(xpath = "//div[@class='block_content']//a[contains(@title,'Find your favorites dresses from our wide choice of evening, casual or summer dresses!')][normalize-space()='Dresses']")
    WebElement dresslink;

    @FindBy(xpath = "//select[@id='selectProductSort']")
    WebElement sortBy;

    public void clickOnDressesLink() {
        clickOnElement(dresslink);
    }

    public void clickOnTopsLink() {
        clickOnElement(topsLink);
    }

    public String verifyWomenText() {
        log.info("Varify Women Text : "  + womenText.toString());

        return getTextFromElement(womenText);
    }

    public void selectFromDropdown(String value) {
        selectByValueFromDropDown(sortBy, value);
    }


}
