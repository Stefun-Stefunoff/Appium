import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import io.appium.java_client.service.local.flags.GeneralServerFlag;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.net.MalformedURLException;

public class startUp {

    protected AppiumDriverLocalService server;
    protected AppiumDriver<MobileElement> driver;

    @BeforeSuite
    public void startTests() throws MalformedURLException {
        AppiumServiceBuilder serviceBuilder = new AppiumServiceBuilder();
        serviceBuilder.usingAnyFreePort();
        serviceBuilder.withArgument(GeneralServerFlag.LOG_LEVEL, "debug");

        server = AppiumDriverLocalService.buildService(serviceBuilder);
        server.start();

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", "Android");
        caps.setCapability("deviceName", "Android");
        caps.setCapability("udid", "5200fbc28d441657");
        caps.setCapability("appActivity", "com.mobisystems.files.FileBrowser");
        caps.setCapability("appPackage", "com.mobisystems.fileman");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", false);
        driver = new AppiumDriver<MobileElement>(server.getUrl(), caps);
    }

    @AfterSuite
    public void endTests() {
        driver.quit();
        server.stop();
    }

}
