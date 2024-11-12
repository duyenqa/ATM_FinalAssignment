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

import java.time.Duration;
import java.util.Arrays;

public class BeveragesPage extends AppiumBase {
    public BeveragesPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "(//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnAddToCart\"])[5]")
    private WebElement addToCartButton;

    @FindBy(xpath = "(//android.widget.ImageButton[@content-desc=\"eCart Multi Vendor - Customer\"])[10]")
    private WebElement plusButton;

    @FindBy(xpath = "//android.widget.Button[@content-desc=\"Cart\"]")
    private WebElement cart;

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPinCode\" and @text=\"370001\"]")
    private WebElement codeLocation;

    public void clickToItemProduct(){
        try {
            Thread.sleep(3000);
            swipeContent(androidDriver);
            swipeContent(androidDriver);

            WebElement itemSelected = webDriverWait.until(ExpectedConditions.visibilityOf(addToCartButton));
            itemSelected.click();

            WebElement increaseQuantity = webDriverWait.until(ExpectedConditions.visibilityOf(plusButton));
            increaseQuantity.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void clickToCart(){
        webDriverWait.until(ExpectedConditions.visibilityOf(cart));
        cart.click();
    }

    public void clickToCodeLocation(){
        webDriverWait.until(ExpectedConditions.visibilityOf(codeLocation));
        codeLocation.click();
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
