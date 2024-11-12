package Steps;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyStepdefs6 {
    CategoryPage categoryPage = new CategoryPage();
    BeveragesPage beveragesPage = new BeveragesPage();
    CartPage cartPage = new CartPage();
    LogInPage logInPage = new LogInPage();
    AddressPage addressPage = new AddressPage();
    PaymentPage paymentPage = new PaymentPage();

    @And("Click to Beverages")
    public void clickToBeverages() {
        categoryPage.clickToBeverages();
    }

    @And("Click Add to Cart with Quantity two of Sunfeast Dark Fantasy Choco Fills, 600g")
    public void clickAddToCartWithQuantityTwoOfSunfeastDarkFantasyChocoFillsG() {
        beveragesPage.clickToItemProduct();
    }

    @And("Click to Cart icon on top screen at Beverages screen")
    public void clickToCartIconOnTopScreenAtBeveragesScreen() {
        beveragesPage.clickToCart();
    }

    @And("Select 370001 location")
    public void selectLocation() {
        beveragesPage.clickToCodeLocation();
    }

    @And("Click to Continue button one time")
    public void clickToContinueButtonOneTime() {
        cartPage.clickContinueToLoginScreen();
    }

    @And("Click to Login button")
    public void clickToLoginButton() {
        logInPage.clickButtonLogin();
    }

    @And("Click to Continue button two time")
    public void clickToContinueButtonTwoTime() {
        cartPage.clickContinueToAddressScreen();
    }

    @And("Select default address and click Continue")
    public void selectDefaultAddressAndClickContinue() {
        addressPage.clickToContinueToPayment();
    }

    @Then("Verify the Payment screen")
    public void verifyThePaymentScreen() {
        paymentPage.verifyPaymentScreen();
    }
}
