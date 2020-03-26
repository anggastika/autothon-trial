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
import java.util.stream.Collectors;

@Component("com.gdn.qa.module.ui.testautothon.pages.StockbitHomepage")
public class StockbitHomepage extends PageObject{
    @Autowired
    DriverProperties driverProperties;

    @FindBy(xpath = "//*[@id=\"header-logo\"]")
    WebElementFacade headerLogo;

    public boolean isHeaderLogoVisible() {
        waitABit(5000);
        return headerLogo.isVisible();
    }

}
