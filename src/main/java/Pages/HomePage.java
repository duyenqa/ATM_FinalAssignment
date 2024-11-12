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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HomePage extends AppiumBase {
    public HomePage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvMore\"])[1]")
    private WebElement viewAllVegetable;

    @FindBy(id = "wrteam.multivendor.customer:id/tvMore")
    private WebElement viewAllCoffee;

    @FindBy(id = "wrteam.multivendor.customer:id/tvStyle2_1")
    private WebElement itemProduct;

    @FindBy(xpath = "(//androidx.recyclerview.widget.RecyclerView[@resource-id=\"wrteam.multivendor.customer:id/recyclerView\"])[1]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.TextView")
    private List<WebElement> itemsProduct;

    public void scrollToFreshVegetables(){
        try{
            Thread.sleep(3000);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void clickToViewAllAtFresherVegetable(){
        webDriverWait.until(ExpectedConditions.visibilityOf(viewAllVegetable));
        viewAllVegetable.click();
    }

    public int verifyItemsAtFreshVegetable(){
        List<String> lsProduct = new ArrayList<>();
        WebElement itemFirst = webDriverWait.until(ExpectedConditions.visibilityOf(itemProduct));
        String item = itemFirst.getAttribute("text");
        lsProduct.add(item);

        for (WebElement element : itemsProduct){
            String rs = element.getAttribute("text");
            lsProduct.add(rs);
        }
        return lsProduct.size();
    }

    public void scrollToCoffeeAndClickViewAll() {
        try{
            Thread.sleep(3000);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);
            swipeContentHome(androidDriver);

            WebElement item = webDriverWait.until(ExpectedConditions.visibilityOf(viewAllCoffee));
            item.click();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void swipeContentHome(AndroidDriver driver) {
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
