package Steps;

import Pages.CartPage;
import Pages.CategoryPage;
import Pages.FastFoodPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyStepdefs5 {
    CategoryPage categoryPage = new CategoryPage();
    FastFoodPage fastFoodPage = new FastFoodPage();
    CartPage cartPage = new CartPage();

    @And("Click to Category menu item")
    public void clickToCategoryMenuItem() {
        categoryPage.clickCategory();
    }

    @And("Click to Fast Food")
    public void clickToFastFood() {
        categoryPage.clickToFastFood();
    }

    @And("Click Add to Cart with Quantity two of Kurkure Namkeen - Masala Munch product")
    public void clickAddToCartWithQuantityTwoOfKurkureNamkeenMasalaMunchProduct() {
        fastFoodPage.addToCartWithProduct();
    }

    @And("Click to Cart icon on top screen")
    public void clickToCartIconOnTopScreen() {
        fastFoodPage.clickToCart();
    }

    @And("Select 370405 location")
    public void selectLocation() {
        fastFoodPage.clickCodeLocation();
    }

    @Then("Verify The Cart should be display")
    public void verifyTheCartShouldBeDisplay() {
        cartPage.displayDetailProduct();
    }
}
