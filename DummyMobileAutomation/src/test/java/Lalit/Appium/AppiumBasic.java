package Lalit.Appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class AppiumBasic extends BaseTest {

	@Test
	public void AppiumTest() throws MalformedURLException {
	    // Android Driver, IOSDriver
	    // Appium code -> Appium server -> Mobile
	    // Actual Automation code
	    
	    // X path, id, accessiblityid, classname, AndroidUiAutomator
	    
	    driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	    driver.findElement(By.id("android:id/checkbox")).click();
	    driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	    
	    String alert=driver.findElement(By.id("android:id/alertTitle")).getText();
	    Assert.assertEquals(alert, "WiFi settings");
	    
	    driver.findElement(By.id("android:id/edit")).sendKeys("Lalit Wifi");
	    
	    driver.findElements(AppiumBy.className("android.widget.Button")).get(1).click();
	    

	    
	}
}
