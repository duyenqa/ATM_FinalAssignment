package Pages;

import Core.AppiumBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.time.Duration;
import java.util.Arrays;

public class ProfilePage extends AppiumBase {
    public ProfilePage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Profile\"]")
    private WebElement profileTab;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvName\"]")
    private WebElement welcomeGuest;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnLogin\"]")
    private WebElement buttonLogin;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"All\"]")
    private WebElement allLocation;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuHome\"]")
    private WebElement home;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuCart\"]")
    private WebElement cart;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuNotification\"]")
    private WebElement notifications;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuOrders\"]")
    private WebElement orders;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuWalletHistory\"]")
    private WebElement walletHistory;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuTransactionHistory\"]")
    private WebElement transactionHistory;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuChangePassword\"]")
    private WebElement changePassword;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuManageAddresses\"]")
    private WebElement manageAddress;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuReferEarn\"]")
    private WebElement referAndEarn;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuContactUs\"]")
    private WebElement contactUs;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuAboutUs\"]")
    private WebElement aboutUs;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuRateUs\"]")
    private WebElement rateUs;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuShareApp\"]")
    private WebElement shareApp;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuFAQ\"]")
    private WebElement faq;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuTermsConditions\"]")
    private WebElement termAndConditions;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuPrivacyPolicy\"]")
    private WebElement privacyPolicy;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMenuLogout\"]")
    private WebElement logout;

    public void clickToProfileTab(){
        webDriverWait.until(ExpectedConditions.visibilityOf(profileTab));
        profileTab.click();
    }

    public void clickToWelcomeGuest(){
        webDriverWait.until(ExpectedConditions.visibilityOf(welcomeGuest));
        welcomeGuest.click();
    }

    public void clickToLoginButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(buttonLogin));
        buttonLogin.click();
    }

    public void verifyProfileScreen(){
        WebElement homeItem = webDriverWait.until(ExpectedConditions.visibilityOf(home));
        Assert.assertTrue(homeItem.isDisplayed(), "The home is not display");

        WebElement cartItem = webDriverWait.until(ExpectedConditions.visibilityOf(cart));
        Assert.assertTrue(cartItem.isDisplayed(), "The cart is not display");

        WebElement notificationsItem = webDriverWait.until(ExpectedConditions.visibilityOf(notifications));
        Assert.assertTrue(notificationsItem.isDisplayed(), "The notification is not display");

        try{
            Thread.sleep(3000);
            swipeContent(androidDriver);
            swipeContent(androidDriver);
            swipeContent(androidDriver);

            WebElement ordersItem = webDriverWait.until(ExpectedConditions.visibilityOf(orders));
            Assert.assertTrue(ordersItem.isDisplayed(), "The orders is not display");

            WebElement walletHistoryItem = webDriverWait.until(ExpectedConditions.visibilityOf(walletHistory));
            Assert.assertTrue(walletHistoryItem.isDisplayed(), "The wallet history is not display");

            WebElement transactionHistoryItem = webDriverWait.until(ExpectedConditions.visibilityOf(transactionHistory));
            Assert.assertTrue(transactionHistoryItem.isDisplayed(), "The transaction history is not display");

            WebElement changePasswordItem = webDriverWait.until(ExpectedConditions.visibilityOf(changePassword));
            Assert.assertTrue(changePasswordItem.isDisplayed(), "The change password is not display");

            WebElement manageAddressItem = webDriverWait.until(ExpectedConditions.visibilityOf(manageAddress));
            Assert.assertTrue(manageAddressItem.isDisplayed(), "The manage address is not display");

            WebElement referAndEarnItem = webDriverWait.until(ExpectedConditions.visibilityOf(referAndEarn));
            Assert.assertTrue(referAndEarnItem.isDisplayed(), "The refer and earn is not display");

            WebElement contactUsItem = webDriverWait.until(ExpectedConditions.visibilityOf(contactUs));
            Assert.assertTrue(contactUsItem.isDisplayed(), "The contact us is not display");

            WebElement aboutUsItem = webDriverWait.until(ExpectedConditions.visibilityOf(aboutUs));
            Assert.assertTrue(aboutUsItem.isDisplayed(), "The about us is not display");

            WebElement rateUsItem = webDriverWait.until(ExpectedConditions.visibilityOf(rateUs));
            Assert.assertTrue(rateUsItem.isDisplayed(), "The rate us is not display");

            WebElement shareAppItem = webDriverWait.until(ExpectedConditions.visibilityOf(shareApp));
            Assert.assertTrue(shareAppItem.isDisplayed(), "The share app is not display");

            WebElement faqItem = webDriverWait.until(ExpectedConditions.visibilityOf(faq));
            Assert.assertTrue(faqItem.isDisplayed(), "The faq is not display");

            WebElement termAndConditionsItem = webDriverWait.until(ExpectedConditions.visibilityOf(termAndConditions));
            Assert.assertTrue(termAndConditionsItem.isDisplayed(), "The term and conditions is not display");

            WebElement privacyPolicyItem = webDriverWait.until(ExpectedConditions.visibilityOf(privacyPolicy));
            Assert.assertTrue(privacyPolicyItem.isDisplayed(), "The privacy policy is not display");

            WebElement logoutItem = webDriverWait.until(ExpectedConditions.visibilityOf(logout));
            Assert.assertTrue(logoutItem.isDisplayed(), "The log out is not display");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void swipeContent(AndroidDriver driver) {
        Dimension size = driver.manage().window().getSize();
        int startx = size.width / 2;
        int starty = size.height / 2;
        swipeDown(driver, startx, starty);
    }

    public static void swipeDown(AndroidDriver driver, int startx, int starty) {
        PointerInput finger = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence dragNDrop = new Sequence(finger, 1);

        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(0), PointerInput.Origin.viewport(), startx, starty));
        dragNDrop.addAction(finger.createPointerDown(PointerInput.MouseButton.RIGHT.asArg()));
        dragNDrop.addAction(finger.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), 2, (int) (driver.manage().window().getSize().height * 0.1)));

        driver.perform(Arrays.asList(dragNDrop));
    }
}
