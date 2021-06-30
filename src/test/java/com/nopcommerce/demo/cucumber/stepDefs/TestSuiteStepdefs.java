package com.nopcommerce.demo.cucumber.stepDefs;

import com.nopcommerce.demo.pages.BuildYourOwnComputer;
import com.nopcommerce.demo.pages.DesktopPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestSuiteStepdefs {
    @When("^I hoover on computer tab$")
    public void iHooverOnComputerTab() {
        new HomePage().hooverOnComputerTab();
    }

    @And("^I click on Desktop Link$")
    public void iClickOnDesktopLink() {
        new HomePage().hooverAndClickOnDesktopLink();
    }

    @And("^I select sort by option Z to A$")
    public void iSelectSortByOptionZToA() {
        new DesktopPage().sortFilterAtoZ("6");
    }

    @Then("^I should see products are arrange alphabetically$")
    public void iShouldSeeProductsAreArrangeAlphabetically() throws InterruptedException {
        DesktopPage desktopPage = new DesktopPage();
        List<String> actualProductNameList = desktopPage.verifyProductSortedByZToAFilter();
        List<String> sortedList = new ArrayList<>(actualProductNameList);
        Collections.sort(sortedList,Collections.<String>reverseOrder());
        Assert.assertEquals(actualProductNameList,sortedList);
    }


    @And("^I select sort by option A to Z$")
    public void iSelectSortByOptionAToZ() {
        new DesktopPage().sortFilterAtoZ("5");
    }

    @And("^I click on Build Your own computer Add To Cart Button$")
    public void iClickOnBuildYourOwnComputerAddToCartButton() throws InterruptedException {
        new DesktopPage().clickOnAddToCartOnBuildYourOwnComputer();
    }

    @And("^I should navigate to Build You Own Computer Page \"([^\"]*)\"$")
    public void iShouldNavigateToBuildYouOwnComputerPage(String headTitleText)  {
        Assert.assertTrue(new BuildYourOwnComputer().verifyTextBuildYourOwnComputer().contains(headTitleText));

    }

    @And("^I select two\\.two processor$")
    public void iSelectTwoTwoProcessor() {
        new BuildYourOwnComputer().selectProcessor("1");
    }

    @And("^I Select eight GB Ram$")
    public void iSelectEightGBRam() {
        new BuildYourOwnComputer().selectRam("5");
    }

    @And("^I select four hundred GB HDD$")
    public void iSelectFourHundredGBHDD() {
        new BuildYourOwnComputer().selectHDD();
    }


    @And("^I Select Vista Home OS$")
    public void iSelectVistaHomeOS() {
        new BuildYourOwnComputer().selectOS();
    }

    @And("^I select Total Commander software$")
    public void iSelectTotalCommanderSoftware() {
        new BuildYourOwnComputer().selectSoftware();
    }

    @And("^I check the price \"([^\"]*)\"$")
    public void iCheckThePrice(String totalAmount) throws InterruptedException {
        Assert.assertTrue(new BuildYourOwnComputer().actualPriceValue().contains(totalAmount));

    }

    @And("^I click on Add to Cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputer().clickOnAddToCartButton();
    }

    @Then("^I should be able to add product successfully \"([^\"]*)\"$")
    public void iShouldBeAbleToAddProductSuccessfully(String alertMessage) throws InterruptedException {
        Assert.assertTrue(new BuildYourOwnComputer().actualGreenBarText().contains(alertMessage));
    }

    @And("^I click on alert message$")
    public void iClickOnAlertMessage() {
        new BuildYourOwnComputer().clickOnCrossOfGreenBar();
    }


}
