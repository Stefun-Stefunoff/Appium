import io.appium.java_client.MobileElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class loginWithAccount extends startUp {

    @Test
    public void loginWithGoogle() throws InterruptedException {

        Thread.sleep(5000);
        MobileElement menu = driver.findElementByAccessibilityId("Navigate up");
        menu.click();
        Thread.sleep(1500);
        MobileElement sign = driver.findElementById("com.mobisystems.fileman:id/drawer_text_items_wrapper");
        sign.click();
        MobileElement signGoogle = driver.findElementById("com.mobisystems.fileman:id/signin_gp");
        signGoogle.click();
        Thread.sleep(2000);
        MobileElement account = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.LinearLayout");
        account.click();
        Thread.sleep(5000);
        MobileElement logged = driver.findElementById("com.mobisystems.fileman:id/drawer_header_text_user_name");
        Assert.assertNotNull(logged.getText(), "User is not logged with Google.");

    }
}
