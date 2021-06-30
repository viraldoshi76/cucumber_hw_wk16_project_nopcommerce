package com.nopcommerce.demo.cucumber.stepDefs;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuStepdefs {
    @Given("^I am on Homepage$")
    public void iAmOnHomepage() {
    }

    @When("^I click on computers tab$")
    public void iClickOnComputersTab() {
        new HomePage().clickOnComputerLink();
    }

    @Then("^I should navigate to computers page$")
    public void iShouldNavigateToComputersPage() {
        Assert.assertEquals("Computers",new ComputerPage().getComputerNavigationText());
    }
}
