package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;

public class DetailProductPage extends AppiumBase {
    public DetailProductPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvProductName\"]")
    private WebElement productName;

    @FindBy(xpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPrice\"])[5]")
    private WebElement productPrice;

    @FindBy(xpath = "(//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnAddToCart\"])[1]")
    private WebElement addToCartButton;

    @FindBy(xpath = "//android.widget.Button[@resource-id=\"wrteam.multivendor.customer:id/btnCart\"]")
    private WebElement goToCartButton;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Similar Products\"]")
    private WebElement similarProducts;

    public void verifyProductDetail(){
        WebElement title = webDriverWait.until(ExpectedConditions.visibilityOf(productName));
        String textName = title.getAttribute("text");
//        System.out.println(textName);
        Assert.assertEquals(textName, "High Octane Instant Coffee Paste with Hazelnut and Coconut Flavors, 150G - Pack of 2 (Hazelnut and\n" +
                "Coconut Beaten Coffee Paste)", "The product name is not match");

        WebElement price = webDriverWait.until(ExpectedConditions.visibilityOf(productPrice));
        String textPrice = price.getAttribute("text");
//        System.out.println(textPrice);
        Assert.assertEquals(textPrice, "$718.31", "The product price is not match");

        WebElement buttonAddCart = webDriverWait.until(ExpectedConditions.visibilityOf(addToCartButton));
//        System.out.println(buttonAddCart.isDisplayed() ? "The Add to Cart button is displayed" : "The Add to Cart button is not display");
        Assert.assertTrue(buttonAddCart.isDisplayed(), "The Add to Cart button is not display");

        WebElement buttonGoToCart = webDriverWait.until(ExpectedConditions.visibilityOf(goToCartButton));
//        System.out.println(buttonGoToCart.isDisplayed() ? "The Go to Cart button is displayed" : "The Go to Cart button is not display");
        Assert.assertTrue(buttonGoToCart.isDisplayed(), "The Go to Cart button is not display");

        WebElement similarProduct = webDriverWait.until(ExpectedConditions.visibilityOf(similarProducts));
        String textSimilar = similarProduct.getAttribute("text");
//        System.out.println(textSimilar);
        Assert.assertEquals(textSimilar, "Similar Products", "The similar products is not match");
    }
}
