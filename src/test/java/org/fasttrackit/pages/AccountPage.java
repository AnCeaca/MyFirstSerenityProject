package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class AccountPage extends PageObject {

    @FindBy (css = "p.hello strong")
    private WebElementFacade welcomeText;
    @FindBy (css = "#advice-required-entry-email")
    private WebElementFacade errorText;
    @FindBy (css = "body > div > div.page > div.main-container.col1-layout > div > div > div.account-login > ul > li > ul > li")
    private WebElementFacade invalidText;

    public void verifyWelcomeMessage(String userName){
        welcomeText.shouldContainOnlyText("Hello, "+userName+"!");
    }

    public void verifyErrorMessage(String errorMessage){
        errorText.shouldContainOnlyText("This is a required field.");
    }

    public void verifyInvalidLogin (String invalidLoginText){
        invalidText.shouldContainOnlyText("Invalid login or password.");
    }
}
