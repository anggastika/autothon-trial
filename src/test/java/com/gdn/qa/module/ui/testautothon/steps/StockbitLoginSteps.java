package com.gdn.qa.module.ui.testautothon.steps;

import com.gdn.qa.module.ui.testautothon.annotation.BlibliSteps;
import com.gdn.qa.module.ui.testautothon.pages.StockbitHomepage;
import com.gdn.qa.module.ui.testautothon.pages.StockbitLoginPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.steps.ScenarioSteps;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.equalTo;

@BlibliSteps
public class StockbitLoginSteps extends ScenarioSteps {

    @Autowired
    StockbitLoginPage stockbitLoginPage;

    @Autowired
    StockbitHomepage stockbitHomepage;

    @Given("^\\[stockbit - Login] user open stockbit login page$")
    public void givenUserOpenStockbitLoginPage() {
        stockbitLoginPage.open();
    }

    @When("^\\[stockbit - Login] user input username '(.*)'$")
    public void whenUserInputUsername(String username) { stockbitLoginPage.setInputUsername(username);}

    @When("^\\[stockbit - Login] user click link forgot password$")
    public void whenUserClickLoginButton() {stockbitLoginPage.clickLinkForgot();}

    @And("^\\[stockbit - Login] user input password '(.*)'$")
    public void andUserInputPassword(String password) {stockbitLoginPage.setInputPassword(password);}

    @And("^\\[stockbit - Forgot] user input valid email '(.*)'$")
    public void andInputValidEmail(String email) {stockbitLoginPage.setInputEmail(email);}

    @And("^\\[stockbit - Login] user click login button$")
    public void andUserClickLoginButton() {stockbitLoginPage.clickLoginButton();}

    @And("^\\[stockbit - Forgot] user click submit$")
    public void andUserClickSubmit() {stockbitLoginPage.clickSubmitButton();}

    @Then("^\\[stockbit - Homepage] user is in homepage$")
    public void thenUserIsInHomepage() {
        assertThat("user not able to see stockbit header logo",
                stockbitHomepage.isHeaderLogoVisible(), equalTo(true));
    }

    @Then("^\\[stockbit - Login] showing tooltip and button login is still visible$")
    public void thenButtonLoginIsStillVisible() {
        assertThat("user not able to see login button",
                stockbitLoginPage.isLoginButtonStillAvailable(), equalTo(true));
    }

    @Then("^\\[stockbit - Login] showing error message$")
    public void thenShowingErrorMessage() {
        assertThat("user not able to see error message",
                stockbitLoginPage.isErrorMessageShowing(), equalTo(true));
    }

    @Then("^\\[stockbit - Forgot] user get info to check email$")
    public void thenUserGetInfoToCheckEmail() {
        assertThat("user not able to see info",
                stockbitLoginPage.isCheckEmailMsgShow(), equalTo(true));
    }



}
