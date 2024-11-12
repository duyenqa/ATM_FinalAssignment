package Steps;

import Pages.CoffeePage;
import Pages.DetailProductPage;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyStepdefs4 {
    HomePage homePage = new HomePage();
    CoffeePage coffeePage = new CoffeePage();
    DetailProductPage detailProductPage = new DetailProductPage();

    @And("Scroll to Coffee And Click to View All")
    public void scrollToCoffeeAndClickToViewAll() {
        homePage.scrollToCoffeeAndClickViewAll();
    }

    @And("Click to High Octane Instant Coffee")
    public void clickToHighOctaneInstantCoffee() {
        coffeePage.clickToHighOctaneInstantCoffee();
    }

    @Then("Verify the product detail screen should be displayed: Product Name, Product Price, Add to Cart button, Go to Cart button, Similar Products text")
    public void verifyTheProductDetailScreenShouldBeDisplayedProductNameProductPriceAddToCartButtonGoToCartButtonSimilarProductsText() {
        detailProductPage.verifyProductDetail();
    }
}
