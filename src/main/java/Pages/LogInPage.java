package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class LogInPage extends AppiumBase {
    public LogInPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnLogin\"]")
    private WebElement loginButton;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"wrteam.multivendor.customer:id/edtLoginMobile\"]")
    private WebElement mobiTextbox;

    @FindBy(xpath = "//android.widget.EditText[@resource-id=\"wrteam.multivendor.customer:id/imgLoginPassword\"]")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvForgotPass\"]")
    private WebElement forgotpassLink;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/tvSignUp\"]")
    private WebElement signupButton;

    public void clickButtonLogin(){
        webDriverWait.until(ExpectedConditions.visibilityOf(loginButton));
        loginButton.click();
    }

    public void verifyLogInScreen(){
        WebElement tbMobile = webDriverWait.until(ExpectedConditions.visibilityOf(mobiTextbox));
        Assert.assertTrue(tbMobile.isDisplayed(), "The mobile textbox is not display");

        WebElement tbPassword = webDriverWait.until(ExpectedConditions.visibilityOf(passwordTextbox));
        Assert.assertTrue(tbPassword.isDisplayed(), "The password textbox is not display");

        WebElement login = webDriverWait.until(ExpectedConditions.visibilityOf(loginButton));
        Assert.assertTrue(login.isDisplayed(), "The log in button is not display");

        WebElement forgotPass = webDriverWait.until(ExpectedConditions.visibilityOf(forgotpassLink));
        Assert.assertTrue(forgotPass.isDisplayed(), "The forgot password link is not display");

        WebElement signUp = webDriverWait.until(ExpectedConditions.visibilityOf(signupButton));
        Assert.assertTrue(signUp.isDisplayed(), "The sign up button is not display");
    }
}
