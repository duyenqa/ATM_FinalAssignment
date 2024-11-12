package Pages;

import Core.AppiumBase;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FreshVegetables extends AppiumBase {
    public FreshVegetables() {
        PageFactory.initElements(new AppiumFieldDecorator(androidDriver), this);
    }

    public int getTotalFreshVegetables()  {
        List<String> newArr = new ArrayList<>();

        List<String> productNames = Arrays.asList("Fresh Coriander, 100g", "Fresh Mango, Thothapuri, 1 kg", "Fresh Drumstick, 250g",
                "Fresh Capsicum - Green", "Fresh Mint Leaves", "Fresh Watermelon Striped, 1 Piece (3-5 kg)",
                "Fresh Sapota", "Fresh Tomato Hybrid", "Fresh Spinach", "Fresh Onion");
        try {
            List<WebElement> productElements = androidDriver.findElements(By.xpath("//android.widget.TextView[@resource-id=\"wrteam.multivendor.customer:id/productName\" and (" +
                    String.join((CharSequence) " or ", productNames.stream().map(name -> "contains(@text, '" + name + "')").collect(Collectors.toList())) +
                    ")]"));
            Thread.sleep(3000);
            swipeContentFreshVegetables(androidDriver);
            Thread.sleep(3000);
            swipeContentFreshVegetables(androidDriver);

            //neu phan tu chua co trong mang newArr thi them vao
            for (WebElement element : productElements) {
                String nameProduct = element.getAttribute("text");
                newArr.add(nameProduct);
                if (newArr.contains("Fresh Watermelon Striped, 1 Piece (3-5 kg)")) {
                    continue;
                }else if (!newArr.contains("Fresh Sapota")) {
                    newArr.add("Fresh Sapota");
                }else if (!newArr.contains("Fresh Tomato Hybrid")) {
                    newArr.add("Fresh Tomato Hybrid");
                }else if (!newArr.contains("Fresh Spinach")) {
                    newArr.add("Fresh Spinach");
                }else if (!newArr.contains("Fresh Onion")) {
                    newArr.add("Fresh Onion");
                }
            }
//            System.out.println(newArr);
//            System.out.println("Total elements: " + newArr.size());
            return newArr.size();
        }catch (Exception e){
            System.out.println(e.getMessage());
            return -1;
        }
    }

    public void swipeContentFreshVegetables(AndroidDriver driver) {
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
