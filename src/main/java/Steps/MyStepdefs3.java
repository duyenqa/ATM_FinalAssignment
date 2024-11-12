package Steps;

import Pages.FreshVegetables;
import Pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

public class MyStepdefs3 {
    HomePage homePage = new HomePage();
    FreshVegetables freshVegetables = new FreshVegetables();

    @And("Scroll to Fresh Vegetables")
    public void scrollToFreshVegetables() {
        homePage.scrollToFreshVegetables();
    }

    @And("Click to View All")
    public void clickToViewAll() {
        homePage.clickToViewAllAtFresherVegetable();
    }

    @Then("Verify the Fresh Vegetables category should be displayed three products")
    public void verifyTheFreshVegetablesCategoryShouldBeDisplayedThreeProducts() {
        Assert.assertEquals(homePage.verifyItemsAtFreshVegetable(), 3, "The number of products displayed is not 3");
    }

    @And("Verify fresh Vegetables screen should be displayed ten products.")
    public void verifyFreshVegetablesScreenShouldBeDisplayedTenProducts() {
        Assert.assertEquals(freshVegetables.getTotalFreshVegetables(), 10, "The number of fresh vegetables displayed is not 10");
    }
}
