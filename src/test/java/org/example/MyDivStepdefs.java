package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.*;

public class MyDivStepdefs extends InitialSteps{
    @Then("the div contains the {string}")
    public void theDivContainsTheText(String text) {
        System.out.println("EZ AZ: "+homePage.getDivElement());

    }

    @Then("the div contains the {string} and the result is {string}")
    public void divAndResult(String text, String r) {
        boolean result= Boolean.parseBoolean(r);
        if (!result) assertFalse(homePage.getDivElement().contains(text));
        else assertTrue(homePage.getDivElement().contains(text));
    }
}
