package Pages;

import Core.AppiumBase;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PaymentPage extends AppiumBase {
    public PaymentPage(){
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    @FindBy(xpath = "(//android.widget.FrameLayout[@resource-id=\"wrteam.multivendor.customer:id/relativeLyt\"])[1]/android.widget.RelativeLayout/android.widget.TextView")
    private static List<WebElement> dateList;



    private final String deliverToPinCodeXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvAddress\"]";
    private final String grandTotalXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvGrandTotal\"]";
    private final String productNameXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvItemName\"]";
    private final String totalPriceXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvPrice\"]";
    private final String subTotalXpath = "(//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSubTotal\"])[2]";
    private final String deliveryChargeXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvDeliveryCharge\"]";
    private final String savedXpath = "//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/tvSaveAmount\"]";
    private List<String> ls = Arrays.asList(deliverToPinCodeXpath, grandTotalXpath, productNameXpath,totalPriceXpath,subTotalXpath,deliveryChargeXpath,savedXpath);
    private static List<String> elementTexts = new ArrayList<>();

    public void verifyPaymentScreen(){
        for (String element : ls){
            WebElement item = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(element)));
            String rsText = item.getAttribute("text");
            System.out.println(rsText);
        }
        System.out.println(handleDate());

    }

    public static String handleDate(){
        for (WebElement item : dateList){
            elementTexts.add(item.getAttribute("text"));
        }
        String result = String.join(", ", elementTexts);
        return result; //Wed, 9, Oct
    }
}
