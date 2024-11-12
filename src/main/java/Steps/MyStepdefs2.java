package Steps;

import Pages.CategoryPage;
import Pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class MyStepdefs2 {
    WelcomePage welcomePage = new WelcomePage();
    CategoryPage categoryPage = new CategoryPage();

    @When("Click Next one time")
    public void clickNextOneTime() {
        welcomePage.clickNextButtonOneTime();
    }

    @And("Click Next two time")
    public void clickNextTwoTime() {
        welcomePage.clickNextButtonTwoTime();
    }

    @And("Click Get Start")
    public void clickGetStart() {
        welcomePage.clickGetStartButton();
    }

    @And("The Default Delivery Location screen displays items")
    public void theDefaultDeliveryLocationScreenDisplaysItems() {
        welcomePage.verifyInformationLocations();
    }

    @And("Select “All” location")
    public void selectAllLocation() {
        welcomePage.clickSelectAllLocation();
    }

    @And("And Click to Category menu item")
    public void andClickToCategoryMenuItem() {
        categoryPage.clickCategory();
    }

    @Then("The Category screen displays six categories")
    public void theCategoryScreenDisplaysSixCategories() throws InterruptedException {
        Assert.assertEquals(categoryPage.totalCategories(), 6, "The number of categories displayed is not 6");
    }
}
