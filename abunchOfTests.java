import io.appium.java_client.MobileElement;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
import org.testng.Assert;


public class abunchOfTests extends startUp {

    @Ignore
    @Test
    public void continueButton() {
        MobileElement startButton = driver.findElementById("com.mobisystems.fileman:id/button_start");
        startButton.click();
        MobileElement firstOnbording = driver.findElementById("com.mobisystems.fileman:id/feature_title");
        Assert.assertEquals(firstOnbording.getText(), "Manage files and folders");
    }

    @Test
    public void switchingOnbordings() throws InterruptedException {
        MobileElement nextButton = driver.findElementById("com.mobisystems.fileman:id/button_start");
        nextButton.click();
        MobileElement next1 = driver.findElementById("com.mobisystems.fileman:id/btn_next");
        next1.click();
        next1.click();
        next1.click();
        next1.click();
        next1.click();
        next1.click();
        Thread.sleep(1000);
        MobileElement premiumButton = driver.findElementById("com.mobisystems.fileman:id/go_premium_button_main");
        Assert.assertEquals(premiumButton.getText(), "Continue to trial");
    }
}
