package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AddressPage extends AppiumBase {
    public AddressPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvConfirmOrder\"]")
    private WebElement continueButton;

    public void clickToContinueToPayment(){
        webDriverWait.until(ExpectedConditions.visibilityOf(continueButton));
        continueButton.click();
    }
}
