package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class HomePage {
    private static final String PAGE_URL = "https://www.saucedemo.com/";
    public final WebDriver driver;
    public HomePage(WebDriver driver) {this.driver = driver;}


    public void openPage(){
        driver.get(PAGE_URL);
        PageFactory.initElements(driver,this);
    }

    public void closePage(){
        driver.quit();
    }



    @FindBy(css = "#header_container > div.header_secondary_container > span")
    private WebElement loginCheckLabel;



    @FindBy(css = "#checkout_info_container > div > form > div.checkout_info > div.error-message-container.error > h3")
    private WebElement errorCheckoutLabel;
    @FindBy(css = "#__next > div.MuiBox-root.css-14ifkx6 > div.MuiContainer-root.MuiContainer-maxWidthLg.css-sv9kmg > div > div.MuiStack-root.css-mq2a14 > div.MuiStack-root.css-lu2zz1 > div > div.MuiBox-root.css-4q1zgn > p")
    private WebElement aboutLabel;

    @FindBy(css = "#ValidMsgEmail")
    private WebElement contactEmailLabel;
    @FindBy(css = "#inventory_item_container > div > div > div.inventory_details_desc_container > div.inventory_details_desc.large_size")
    private WebElement descriptionLabel;

    public boolean getInventoryItemName(String label) {
        for (WebElement x:driver.findElements(By.className("inventory_item_name"))){

            if (x.getText().equals(driver.findElement(products.get(label)).getText())) return true;
        }
        return false;
    }






    @FindBy(className = "inventory_details_price")
    private WebElement productPrice;



    @FindBy(css = "#shopping_cart_container > a > span")
    private WebElement badgeValue;


    @FindBy(css = "body > div.MuiDrawer-root.MuiDrawer-modal.MuiModal-root.css-y28f86 > div.MuiPaper-root.MuiPaper-elevation.MuiPaper-elevation16.MuiDrawer-paper.MuiDrawer-paperAnchorRight.css-11d19f4 > div > div > div > div.MuiStack-root.css-vpqjgu > div > ol > li:nth-child(1) > a > div > div > h6")
    private WebElement searchResult;

    @FindBy(id="remove")
    private WebElement removeButton;


    private final Map<String, By> inputFields = Map.of(
            "Username",By.id("user-name"),
            "Password", By.id("password"),
            "Firstname", By.id("first-name"),
            "Lastname", By.id("last-name"),
            "Postalcode", By.id("postal-code"),
            "ContactEmail", By.id("Email"),
            "Search", By.cssSelector("#__next > header > div > div > div.PrivateHiddenCss-root.PrivateHiddenCss-mdDown.css-9sga2b > div > button")

    );
    private Map<String, By> buttons = Map.of(
            "Login",By.id("login-button"),
            "Cart", By.cssSelector("#shopping_cart_container > a"),
            "Checkout",By.id("checkout"),
            "Continue",By.id("continue"),
            "Search",By.cssSelector("#__next > header > div > div > div.PrivateHiddenCss-root.PrivateHiddenCss-mdDown.css-9sga2b > div > div.MuiBox-root.css-1ay9vb9 > a > button"),
            "GetDemo",By.className("mktoButton"),
            "AddToCart",By.id("add-to-cart"),
            "BackToProduct",By.id("back-to-products"),
            "Remove",By.id("remove")


    );

    private Map<String, By> menuButtons = Map.of(
            "Menu",By.id("react-burger-menu-btn"),
            "AboutMenu",By.id("about_sidebar_link"),
            "AllItems",By.id("inventory_sidebar_link")

    );

    private Map<String, By> addButtons = Map.of(
            "Sauce Labs Backpack",By.id("add-to-cart-sauce-labs-backpack"),
            "Sauce Labs Bike Light",By.id("add-to-cart-sauce-labs-bike-light"),
            "Sauce Labs Bolt T-Shirt",By.id("add-to-cart-sauce-labs-bolt-t-shirt"),
            "Sauce Labs Fleece Jacket",By.id("add-to-cart-sauce-labs-fleece-jacket")

    );





    private final Map<String, By> products = Map.of(
            "Sauce Labs Backpack", By.cssSelector("#item_4_title_link > div"),
            "Sauce Labs Bike Light", By.cssSelector("#item_0_title_link > div"),
            "Sauce Labs Bolt T-Shirt", By.cssSelector("#item_1_title_link > div"),
            "Sauce Labs Fleece Jacket", By.cssSelector("#item_5_title_link > div")
    );
    public void writeTextToInputField(String field,String text){
        driver.findElement(inputFields.get(field)).sendKeys(text);

    }
    public void pushButton(String button){
        driver.findElement(buttons.get(button)).click();
    }
    public void pushMenuButton(String button){
        driver.findElement(menuButtons.get(button)).click();
    }

    public void pushProductAddButton(String button){driver.findElement(addButtons.get(button)).click();}
    public void pushProduct(String product){
        driver.findElement(products.get(product)).click();
    }

    public boolean descriptionContains(String keyword){
        if (descriptionLabel.getText().contains(keyword)) return true; else return false;
    }
    public String getProductPrice() {
        return productPrice.getText();
    }

    public String getDescriptionLabel(){
        return descriptionLabel.toString().toLowerCase();
    }

    public String getContactEmailLabel(){
        return contactEmailLabel.getText();
    }
    public String aboutLabelCheck(){
        return aboutLabel.getText();
    }
    public Integer getBadgeValue() {
        return Integer.parseInt(badgeValue.getText());
    }
    public String getErrorCheckoutLabel() {
        return errorCheckoutLabel.getText();
    }
    public String getLoginCheckLabel() {
        return loginCheckLabel.getText();
    }
    public String getSearchResult() {
        return searchResult.getText();
    }



    public int countElement(){
        // Find the elements you want to count (e.g., div elements with a specific class)
        return driver.findElements(By.cssSelector("#inventory_container > div > div:nth-child(1) > div.inventory_item_description")).size();
    }

    public boolean buttonDisplayed(String button){
        return driver.findElement(buttons.get(button)).isDisplayed();
    }

    public String getDivElement(){
        WebElement divElement = driver.findElement(By.id("login_credentials"));
        //String actualContent = divElement.getText();
        return divElement.getText();
    }
}
