package DTPAPP;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class CustomerApplication extends  BaseTest {

	@Test
	public void MobileAppLogin() throws MalformedURLException, InterruptedException {
	    // Android Driver, IOSDriver
	    // Appium code -> Appium server -> Mobile
	    // Actual Automation code
	    
	    // X path, id, accessiblityid, classname, AndroidUiAutomator
		
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		driver.findElement(By.id("com.drivetrackplus.uat:id/userName")).sendKeys("4000000277");
		driver.findElement(By.id("com.drivetrackplus.uat:id/password")).sendKeys("Test@123");
		
		driver.findElement(By.id("com.drivetrackplus.uat:id/submit")).click();
		
		///////recharge ccms account
		
//		driver.findElements(By.className("android.widget.RelativeLayout")).get(1).click();
//		Thread.sleep(3000);
//		System.out.println("Not clicked");
//
//		driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.drivetrackplus.uat:id/itemText\" and @text=\"Balance Summary\"]")).click();
//
//		System.out.println("clicked");
//		
//		Thread.sleep(3000);
//
//		driver.findElement(By.id("com.drivetrackplus.uat:id/rechargeYourAccount")).click();
//		driver.findElement(By.id("com.drivetrackplus.uat:id/amount")).sendKeys("100");
//	//select the payment gateway	
//	driver.findElements(By.className("android.widget.RadioButton")).get(1).click();
//	
//	driver.findElement(By.id("com.drivetrackplus.uat:id/submit")).click();
//	driver.findElement(By.id("com.drivetrackplus.uat:id/yesButton")).click();
//	
//	//Get recharge limit message
//	//driver.findElement(By.id("com.drivetrackplus.uat:id/message")).getText();
//	
//
////	 // Locate the element with the expected text
////    WebElement element = driver.findElement(By.id("com.drivetrackplus.uat:id/message"));
////
////    // Get the actual text from the element
////    String actualText = element.getText();
////
////    // Specify the expected text
////    String expectedText = "You have exceeded the daily limit of number of transactions permissible through Payment Gateways. On any day, you can do maximum 3 number of successful transactions through all Payment Gateways.";
////
////    // Compare the expected and actual text
////    if (actualText.equals(expectedText)) {
////        System.out.println("Text Validation Passed! Expected: " + expectedText + ", Actual: " + actualText);
////    } else {
////        System.out.println("Text Validation Failed! Expected: " + expectedText + ", Actual: " + actualText);
////    
////
////}
////	
//	driver.findElement(By.xpath("(//android.widget.ImageView[@resource-id=\"com.drivetrackplus.uat:id/imageView\"])[1]")).click();
//	
//	driver.findElement(By.id("com.drivetrackplus.uat:id/edtCardNumber")).sendKeys("4012001037141112");
//	driver.findElement(By.id("com.drivetrackplus.uat:id/edtDate")).sendKeys("12/24");
//	driver.findElement(By.id("com.drivetrackplus.uat:id/edtCVV")).sendKeys("123");
//	driver.findElement(By.id("com.drivetrackplus.uat:id/btnPay")).click();
//	Thread.sleep(9000);
//
//	driver.findElement(By.xpath("//android.widget.Button[@text=\"Return To the Merchant Site\"]")).click();
//	Thread.sleep(3000);
//
//	String m=driver.findElement(By.id("com.drivetrackplus.uat:id/transactionDetails")).getText();
//	
//	System.out.println(m);
//	
	}
	    

	    
	}

