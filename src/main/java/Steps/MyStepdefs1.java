package Steps;

import Pages.WelcomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepdefs1 {
    WelcomePage welcomePage = new WelcomePage();

    @Given("Open eCart Multivendor Customer App")
    public void openECartMultivendorCustomerApp() {

    }

    @When("Verify Skip button")
    public void verifySkipButton() {
        welcomePage.verifySkipButton();
    }

    @And("Verify Next button")
    public void verifyNextButton() {
        welcomePage.verifyNextButton();
    }

    @Then("Verify Look for things around you text")
    public void verifyLookForThingsAroundYouText() {
        welcomePage.verifyTextScreenHome();
    }
}
