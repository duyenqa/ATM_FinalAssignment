package Core;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumBase {
    public static AndroidDriver androidDriver;
    public static WebDriverWait webDriverWait;

    public void createDriver() throws MalformedURLException {
        UiAutomator2Options uiAutomator20ptions = new UiAutomator2Options();
        uiAutomator20ptions.setAutomationName("UiAutomator2");
        uiAutomator20ptions.setAppPackage("wrteam.multivendor.customer");
        uiAutomator20ptions.setAppActivity("wrteam.multivendor.customer.activity.SplashActivity");
        uiAutomator20ptions.setUdid("emulator-5554");
        uiAutomator20ptions.setPlatformName("Android");
        androidDriver = new AndroidDriver(new URL("http://localhost:4723"), uiAutomator20ptions);
        webDriverWait = new WebDriverWait(androidDriver, Duration.ofSeconds(30));
    }

    public void closeDriver(){
//        androidDriver.quit();
    }
}
