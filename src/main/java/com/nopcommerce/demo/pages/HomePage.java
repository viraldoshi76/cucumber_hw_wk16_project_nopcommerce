package com.nopcommerce.demo.pages;

import com.cucumber.listener.Reporter;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[contains(text(),'Computers')]")
    WebElement computersLink;

    @FindBys({@FindBy(xpath = "//div[@class='header-menu']/ul[1]/li/a")})
    List<WebElement> homePageMenuTabs;

    @FindBy(xpath = "//div[@class='page-title']")
    WebElement pageTitleText;

    @FindBy(xpath = "//ul[@class='top-menu notmobile']//a[@href='/computers']")
    WebElement computerTab;

    @FindBy(xpath = "//a[contains(text(),'Desktops')]")
    WebElement desktopTabLink;

    public void clickOnComputerLink() {
        clickOnElement(computersLink);
        log.info("Clicking on Computer link"+ computersLink.toString());
    }

    public void hooverOnComputerTab(){
        mouseHoverToElement(computerTab);
        log.info("mouse hoover on computer tab"+ computerTab.toString());
    }

    public void hooverAndClickOnDesktopLink(){
        mouseHoverToElementAndClick(desktopTabLink);
        log.info("mouse hoover and click on desktoplink" + desktopTabLink);
    }
}
