package steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TestSetup {
    public static AndroidDriver driver;
    private static DesiredCapabilities caps = new DesiredCapabilities();

    protected static void startDriver() {
        try {
            caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung Galaxy S8+");
            caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
            caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "1200");
            caps.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, "true");
            caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "6");
            caps.setCapability(MobileCapabilityType.APP, System.getProperty("user.dir") + "/App/PreciseUnitConversion.apk");
            caps.setCapability(MobileCapabilityType.FULL_RESET, "false");
            caps.setCapability(MobileCapabilityType.NO_RESET, "true");
            Logger.getLogger("org.openqa.selenium").setLevel(Level.OFF);
            driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    protected static void stopDriver() {
        if (driver != null)
            driver.quit();
    }
}
