package com.gdn.qa.module.ui.testautothon.pages;

import com.gdn.qa.module.ui.testautothon.configuration.DriverProperties;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

@Component("com.gdn.qa.module.ui.testautothon.pages.StockbitLoginPage")
@DefaultUrl("https://stockbit.com/#/login")
public class StockbitLoginPage extends PageObject{

    @Autowired
    DriverProperties driverProperties;


    @FindBy(id = "username")
    public WebElementFacade txtUsername;

    @FindBy(id = "password")
    public WebElementFacade txtPassword;

    @FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div[2]")
    List<WebElementFacade> spaceBarUsername;

    @FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div[3]")
    List<WebElementFacade> spaceBarPassword;

    @FindBy(xpath = "//*[@id=\"main-wrapper\"]/div[3]")
    WebElementFacade errMessage;

    @FindBy(xpath = "//*[@id=\"loginbutton\"]")
    WebElementFacade loginButton;

    @FindBy(xpath = "//*[@id=\"form-login\"]/div[1]/div[4]/p/a")
    WebElementFacade linkForgot;

    @FindBy(xpath = "//*[@id=\"input-1\"]")
    WebElementFacade inputEmail;

    @FindBy(xpath = "//*[@id=\"request-password-reset\"]/div[2]/input[2]")
    WebElementFacade submitButton;

    @FindBy(xpath = "//*[@id=\"loginwrapperx\"]/div[1]/div[2]")
    WebElementFacade checkEmailMsg;

    public void setInputUsername(String username) {txtUsername.type(username);}

    public void setInputPassword(String password) {txtPassword.type(password);}

    public void setInputEmail(String email) {
        waitABit(2000);
        inputEmail.type(email);
    }

    public void clickLoginButton() {loginButton.click();}

    public void clickLinkForgot() {linkForgot.click();}

    public void clickSubmitButton() { submitButton.click();}

    public boolean isLoginButtonStillAvailable() {return loginButton.isVisible();}

    public boolean isErrorMessageShowing() { return errMessage.isVisible();  }

    public boolean isCheckEmailMsgShow() { return checkEmailMsg.isVisible();}




}
