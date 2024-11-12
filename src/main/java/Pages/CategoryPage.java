package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class CategoryPage extends AppiumBase {
    public CategoryPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Category\"]")
    private WebElement categoryTab;

    @FindBy(xpath = "//android.widget.GridView[@resource-id=\"wrteam.multivendor.customer:id/categoryRecycleView\"]/android.widget.LinearLayout")
    private List<WebElement> categoriesList;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"eCart Multi Vendor - Customer\"])[3]")
    private WebElement fastFoodItem;

    @FindBy(xpath = "(//android.widget.ImageView[@content-desc=\"eCart Multi Vendor - Customer\"])[5]")
    private WebElement beveragesItem;

    public void clickCategory(){
        webDriverWait.until(ExpectedConditions.visibilityOf(categoryTab));
        categoryTab.click();
    }

    public int totalCategories() throws InterruptedException {
        Thread.sleep(6000);
        return categoriesList.size();
    }

    public void clickToFastFood(){
        webDriverWait.until(ExpectedConditions.visibilityOf(fastFoodItem));
        fastFoodItem.click();
    }

    public void clickToBeverages(){
        webDriverWait.until(ExpectedConditions.visibilityOf(beveragesItem));
        beveragesItem.click();
    }
}
