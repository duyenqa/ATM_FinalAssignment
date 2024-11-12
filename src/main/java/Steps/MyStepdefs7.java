package Steps;

import Pages.LogInPage;
import Pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class MyStepdefs7 {
    ProfilePage profilePage = new ProfilePage();
    LogInPage logInPage = new LogInPage();

    @And("Click to Profile on footer menu")
    public void clickToProfileOnFooterMenu() {
        profilePage.clickToProfileTab();
    }

    @And("Click to Welcome Guest")
    public void clickToWelcomeGuest() {
        profilePage.clickToWelcomeGuest();
    }

    @And("Verify log in screen")
    public void verifyLogInScreen() {
        logInPage.verifyLogInScreen();
    }

    @And("Click to login button")
    public void clickToLoginButton() {
        profilePage.clickToLoginButton();
    }

    @Then("Click again to Profile on footer menu")
    public void clickAgainToProfileOnFooterMenu() {
        profilePage.clickToProfileTab();
    }

    @Then("Verify the profile screen")
    public void verifyTheProfileScreen() {
        profilePage.verifyProfileScreen();
    }
}
