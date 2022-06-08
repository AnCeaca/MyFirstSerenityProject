package org.fasttrackit.features.search;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.utils.Constants;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTests extends BaseTests {

    @Managed(uniqueSession = true)
    public WebDriver webDriver;
    @Steps
    private LoginSteps loginSteps;

    @Test
    public void loginWithValidCredentialsTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials(Constants.USER_EMAIL, Constants.USER_PASS);
        loginSteps.clickLogin();
        loginSteps.verifyUsernameMessage("Cosmin Fast");
    }

    @Test
    public void loginWithInvalidPasswordTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("cosmin@fasttrackit.org", "123456234");
        loginSteps.clickLogin();
        loginSteps.verifyLogin("Invalid login or password.");
    }

    @Test
    public void loginWithEmptyCredentialsTest() {
        loginSteps.navigateToHomepage();
        loginSteps.navigateToLogin();
        loginSteps.setCredentials("", "");
        loginSteps.clickLogin();
        loginSteps.verifyError("This is a required field.");
    }





}
