package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

import java.util.List;

public class WelcomePage extends AppiumBase {
    public WelcomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMessage\"]")
    private WebElement text;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSkip\"]")
    private WebElement skipButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"All\"]")
    private WebElement selectAllLocation;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvNext\"]")
    private WebElement nextButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvNext\"]")
    private WebElement getStartButton;

    @FindBy(id = "wrteam.multivendor.customer:id/searchView")
    private WebElement searchPinTextBox;

    @FindBy(id = "wrteam.multivendor.customer:id/tvSearch")
    private WebElement searchButton;

    @FindBy(xpath = "//androidx.recyclerview.widget.RecyclerView[@resource-id=\"wrteam.multivendor.customer:id/recyclerView\"]/android.widget.TextView")
    private List<WebElement> lsLocation;

    public void verifySkipButton(){
        WebElement skip = webDriverWait.until(ExpectedConditions.visibilityOf(skipButton));
        Assert.assertTrue(skip.isDisplayed(), "The skip button is not displayed");
    }

    public void verifyNextButton(){
        WebElement next = webDriverWait.until(ExpectedConditions.visibilityOf(nextButton));
        Assert.assertTrue(next.isDisplayed(), "The next button is not displayed");
    }

    public void verifyTextScreenHome(){
        WebElement smallText = webDriverWait.until(ExpectedConditions.visibilityOf(text));
        String rsText = smallText.getAttribute("text");
        Assert.assertEquals(rsText, "Look for things around you", "The text is not match");
    }

    public void clickNextButtonOneTime(){
        webDriverWait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void clickNextButtonTwoTime(){
        webDriverWait.until(ExpectedConditions.visibilityOf(nextButton));
        nextButton.click();
    }

    public void clickGetStartButton(){
        webDriverWait.until(ExpectedConditions.visibilityOf(getStartButton));
        getStartButton.click();
    }

    public void verifyInformationLocations(){
        //Search Pin textbox
        webDriverWait.until(ExpectedConditions.visibilityOf(searchPinTextBox));
        Assert.assertTrue(searchPinTextBox.isDisplayed(),"The search pin text box is not display");
        //Search Button
        webDriverWait.until(ExpectedConditions.visibilityOf(searchButton));
        Assert.assertTrue(searchButton.isDisplayed(), "The search button is not display");
        //Location display (All, 370405, 841301, 800001, 370465, 370001)
        String rs1 = selectAllLocation.getAttribute("text");
        System.out.println(rs1);

        for (WebElement item : lsLocation){
            System.out.println(item.getAttribute("text"));
        }
    }

    public void clickSelectAllLocation(){
        webDriverWait.until(ExpectedConditions.visibilityOf(selectAllLocation));
        selectAllLocation.click();
    }
}
