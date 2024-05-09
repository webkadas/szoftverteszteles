package org.example;

import io.cucumber.java.AfterAll;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.example.InitialSteps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonStepDefs extends InitialSteps {
    @Given("the page is opened")
    public void thePageIsOpened() {homePage.openPage();}




    @Given("the {string} is filled with {string}")
    public void theUsernameIsFilledWithStandard_user(String field, String text) {
        homePage.writeTextToInputField(field, text);
    }

    @Then("the {string} button is clicked")
    public void buttonIsClicked(String button) {
        homePage.pushButton(button);
    }

    @AfterAll
    public static void closeThePage(){homePage.closePage();}

    @Then("the display the {string}")
    public void theDisplayTheProducts(String text) {
        assertEquals(text,homePage.getLoginCheckLabel());
    }

    @Given("the {string} is clicked")
    public void theProductIsClicked(String product) {
        homePage.pushProduct(product);
    }


    @Then("the {string} is correct")
    public void thePriceIsCorrect(String price) {
        assertEquals(price,homePage.getProductPrice());
    }

    @Then("the message is {string}")
    public void theMessageIsErrorMessage(String text) {
        assertEquals(text,homePage.getErrorCheckoutLabel());
    }

    @Then("{string} is exists")
    public void theWorldReliesOnYourCodeTestOnThousandsOfDifferentDeviceBrowserAndOSConfigurationsAnywhereAnyTimeIsExists(String text) {
        assertEquals(homePage.aboutLabelCheck(),text);
    }

    @Then("the {string} is this")
    public void theErrorMessageIsThis(String message) {
        assertEquals(message,homePage.getContactEmailLabel());
    }

    @Then("the description contains {string}")
    public void theDescriptionContainsKeyword(String keyword) {
        assertTrue(homePage.descriptionContains(keyword));
    }

    @Then("the price format is correct")
    public void thePriceFormatIsCorrect() {
        assertTrue(homePage.getProductPrice().substring(0,1).equals("$") && Double.parseDouble(homePage.getProductPrice().substring(1))>=0);
    }

    @Given("the {string} menubutton is clicked")
    public void theMenuMenubuttonIsClicked(String menubutton) {
        homePage.pushMenuButton(menubutton);

    }

    @Then("the elements number more then {string}")
    public void theElementsNumberMoreThen(String number) {
        assertTrue(homePage.countElement()>Integer.parseInt(number));
    }

    @Then("the {string} button is displayed")
    public void theRemoveButtonIsDisplayed(String remove) {
        assertTrue(homePage.buttonDisplayed(remove));
    }



    @Then("the {string} product label is displayed")
    public void theProductLabelIsDisplayed(String label) {


        assertTrue(homePage.getInventoryItemName(label));

    }
}
