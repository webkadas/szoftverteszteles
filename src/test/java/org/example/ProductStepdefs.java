package org.example;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductStepdefs extends InitialSteps{
    @Given("the {string} label  is clicked")
    public void productIsClicked(String product) {
        homePage.pushProduct(product);
    }

   

    @Then("the Badge content is {string}")
    public void theBadgeContentIs(String target) {
        assertEquals(Integer.parseInt(target),homePage.getBadgeValue());
    }

    @And("the {string} label is clicked")
    public void theSauceLabsBikeLightLabelIsClicked(String product) {
        homePage.pushProduct(product);
    }
}
