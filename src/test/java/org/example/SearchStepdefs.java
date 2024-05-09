package org.example;

import io.cucumber.java.en.Then;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchStepdefs extends InitialSteps{
    @Then("the result contains {string}")
    public void theResultContainsSample(String sample) {
        assertTrue(homePage.getSearchResult().contains(sample)) ;
    }
}
