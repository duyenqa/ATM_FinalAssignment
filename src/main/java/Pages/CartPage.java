package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class CartPage extends AppiumBase {
    public CartPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvDelete\"]")
    private WebElement deleteButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvAction\"]")
    private WebElement saveLaterButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPromoCode\"]")
    private WebElement promoCodeButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvConfirmOrder\"]")
    private WebElement continueButton;

    private final String deliverToXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvLocation\"]";
    private final String productNameXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvProductName\"]";
    private final String productPriceXpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPrice\"])[7]";
    private final String productMeasurementXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMeasurement\" and @text=\"85 kg\"]";
    private final String productTotalPriceXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvTotalPrice\"]";
    private final String productQuantityXpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvQuantity\"])[7]";

    List<String> ls = Arrays.asList(deliverToXpath, productNameXpath, productPriceXpath, productMeasurementXpath, productTotalPriceXpath, productQuantityXpath);

    public void displayDetailProduct(){
        for(String item : ls){
            WebElement element = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(item)));
            String textValue = element.getAttribute("text");
            System.out.println(textValue);
        }

        WebElement buttondelete = webDriverWait.until(ExpectedConditions.visibilityOf(deleteButton));
        Assert.assertTrue(buttondelete.isDisplayed(), "The delete button is not display");

        WebElement buttonSaveLater = webDriverWait.until(ExpectedConditions.visibilityOf(saveLaterButton));
        Assert.assertTrue(buttonSaveLater.isDisplayed(), "The save later button is not display");

        WebElement buttonPromoCode = webDriverWait.until(ExpectedConditions.visibilityOf(promoCodeButton));
        Assert.assertTrue(buttonPromoCode.isDisplayed(), "The promo code button is not display");

        WebElement buttonContinue = webDriverWait.until(ExpectedConditions.visibilityOf(continueButton));
        Assert.assertTrue(buttonContinue.isDisplayed(), "The continue button is not display");
    }

    public void clickContinueToLoginScreen(){
        webDriverWait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }

    public void clickContinueToAddressScreen(){
        webDriverWait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
}
