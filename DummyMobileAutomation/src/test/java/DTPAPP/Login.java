package DTPAPP;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import Mobile.Automations.BaseTest;

public class Login  extends extends  BaseTest {

	@SuppressWarnings({ "unused" })
	@Test(priority = 1)
	public void MobileAppLogin() throws MalformedURLException, InterruptedException {
	  
		Thread.sleep(3000);
		driver.findElement(By.id("com.android.packageinstaller:id/permission_allow_button")).click();
		
		driver.findElement(By.id("com.drivetrackplus.uat:id/userName")).sendKeys("4000000277");
		driver.findElement(By.id("com.drivetrackplus.uat:id/password")).sendKeys("Test@23");
		driver.findElement(By.id("com.drivetrackplus.uat:id/submit")).click();
		
		Thread.sleep(5000);
 
		// Verify successful login
		
		
		// Validate the successfully logged in
		WebElement actualSuccessMessage=driver.findElement(By.id("com.drivetrackplus.uat:id/welcome"));

		 actualSuccessMessage.getText();
		String expectedSuccessMessage ="Welcome";
		
		 if (isUserLoggedIn(driver)) {
	            System.out.println("Test Passed: User logged in successfully!");
	        } else {
	            System.out.println("Test Failed: User login unsuccessful.");
	        }

	   
	    }

	    // Helper method to check if the user is logged in
	    private static boolean isUserLoggedIn(WebDriver driver) {
	        try {
	            WebElement welcomeMessage = driver.findElement(By.id("com.drivetrackplus.uat:id/welcome"));
	            return welcomeMessage.isDisplayed();
	        } catch (Exception e) {
	            // If the element is not found, return false
	            return false;
	        }
	    } 
	    
	 @SuppressWarnings("unused")
	@Test(priority = 2)   
	public void NLoginFailed() {
		
	
    	WebElement actualValidationMessage=driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.drivetrackplus.uat:id/message"));

		//log in with Invalid credentials.
		actualValidationMessage.getText();
	    String expectedValidationMessage ="Invalid Username or Password";
        	
	    if (isUserLoggedIn(driver)) {
            System.out.println("Test Passed: error message is displayed");
        } else {
            System.out.println("Test Failed: error message is not displayed");
        }

	    
    }

    @SuppressWarnings("unused")
	private static boolean isUserLoggedIn1(WebDriver driver) {
        try {
            WebElement validationMessage =driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.drivetrackplus.uat:id/message"));

            System.out.println(validationMessage.getText());
            return validationMessage.isDisplayed();
        } catch (Exception e) {
            // If the element is not found, return false
            return false;
        }
    } 
      

    @Test
     public  void verifyCredentialretains () {
      

            // Find the username, password input fields, and the login button
            WebElement usernameInput = driver.findElement(By.id("username"));
            WebElement passwordInput = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

            // Enter invalid credentials
            usernameInput.sendKeys("invalid_username");
            passwordInput.sendKeys("invalid_password");

            // Click the login button
            loginButton.click();

            // Verify that the login attempt failed
            if (isLoginFailed(driver)) {
                System.out.println("Login failed as expected.");
            } else {
                System.out.println("Test Failed: Unexpected login success.");
            }

            // Verify that the entered values are retained
            if (usernameInput.getAttribute("value").equals("invalid_username") &&
                passwordInput.getAttribute("value").equals("invalid_password")) {
                System.out.println("Test Passed: Username and password fields retain entered values.");
            } else {
                System.out.println("Test Failed: Entered values are not retained.");
            }

        }

        // Helper method to check if the login attempt failed
        private static boolean isLoginFailed(WebDriver driver) {
            try {
                WebElement errorMessage = driver.findElement(By.id("errorMessage"));
                return errorMessage.isDisplayed();
            } catch (Exception e) {
                // If the element is not found, return false
                return false;
            }
        }
            @Test
         public void LoginButtonDisable() {
            	

                
            WebElement usernameInput = driver.findElement(By.id("username"));
            WebElement passwordInput = driver.findElement(By.id("password"));
            WebElement loginButton = driver.findElement(By.id("loginButton"));

           // Verify that the login button is initially disabled
            if (!loginButton.isEnabled()) {
            System.out.println("Test Passed: Login button is initially disabled.");
           } else {
        System.out.println("Test Failed: Login button is unexpectedly enabled.");
           }

             // Enter values in the username and password fields
           usernameInput.sendKeys("test_username");
            passwordInput.sendKeys("test_password");

             // Verify that the login button is enabled after entering values
        if (loginButton.isEnabled()) {
    System.out.println("Test Passed: Login button is enabled after entering values.");
      } else {
    System.out.println("Test Failed: Login button remains disabled after entering values.");
       }

      // Clear the input fields
          usernameInput.clear();
         passwordInput.clear();

            // Verify that the login button is disabled after clearing the fields
         if (!loginButton.isEnabled()) {
    System.out.println("Test Passed: Login button is disabled after clearing fields.");
        } else {
    System.out.println("Test Failed: Login button is unexpectedly enabled after clearing fields.");
        }


       }
   
            
            
             
          public void LoginButtonEnable() {
        	  WebElement usernameInput = driver.findElement(By.id("username"));
              WebElement passwordInput = driver.findElement(By.id("password"));
              WebElement loginButton = driver.findElement(By.id("loginButton"));

              // Verify that the login button is initially disabled
              if (!loginButton.isEnabled()) {
                  System.out.println("Test Passed: Login button is initially disabled.");
              } else {
                  System.out.println("Test Failed: Login button is unexpectedly enabled.");
              }

              // Enter invalid values in the username and password fields
              usernameInput.sendKeys("invalid_username");
              passwordInput.sendKeys("invalid_password");

              // Verify that the login button remains disabled with invalid input
              if (!loginButton.isEnabled()) {
                  System.out.println("Test Passed: Login button is disabled with invalid input.");
              } else {
                  System.out.println("Test Failed: Login button is unexpectedly enabled with invalid input.");
              }

              // Clear the input fields
              usernameInput.clear();
              passwordInput.clear();

              // Enter valid values in the username and password fields
              usernameInput.sendKeys("valid_username");
              passwordInput.sendKeys("valid_password");

              // Verify that the login button becomes enabled with valid input
              if (loginButton.isEnabled()) {
                  System.out.println("Test Passed: Login button is enabled with valid input.");
              } else {
                  System.out.println("Test Failed: Login button is unexpectedly disabled with valid input.");
              }

          }
      
          


          @Test
	    public void ForgetPassord() {
	    	
	    	
	    	WebElement forgotPasswordLink = driver.findElement(By.linkText("Forgot Password"));

	        // Click the 'Forgot Password' link
	        forgotPasswordLink.click();

	        // Verify that the user is redirected to the password recovery page
	        if (isOnPasswordRecoveryPage(driver)) {
	            System.out.println("Test Passed: Clicking 'Forgot Password' link redirects to the password recovery page.");
	        } else {
	            System.out.println("Test Failed: User is not redirected to the password recovery page.");
	        }

	      
	    }

	    // Helper method to check if the user is on the password recovery page
	    private static boolean isOnPasswordRecoveryPage(WebDriver driver) {
	        try {
	            WebElement recoveryForm = driver.findElement(By.id("recoveryForm"));
	            return recoveryForm.isDisplayed();
	        } catch (Exception e) {
	            // If the element is not found, return false
	            return false;
	        }
	    }
	
	    
           public void DoForgetpassord() {
        	   
        	   driver.findElement(By.id("Forget Passord link")).click();
        	   driver.findElement(By.id("Email")).sendKeys("test@gmail.com");
        	   driver.findElement(By.id("Recovery button")).click();
        	   
        	   WebElement successMessage=driver.findElement(By.id("Success Message"));
        	  
        	     String actualSuccessMessage = successMessage.getText();

        	        // Expected success message
        	        String expectedSuccessMessage = "reset passord link has been sent in your email";

        	        // Verify the success message using TestNG assertion
        	      
        	        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Success message mismatch");
           }  
        	        @Test
        	        public void Simulating() {
        	        
        	     // Click the 'Recover Password link' button
        	        WebElement recoverPasswordButton = driver.findElement(By.id("recoverPasswordButton"));
        	        recoverPasswordButton.click();
        	        
        	        System.out.println("Simulating email access and retrieving recovery instructions...");

        	        driver.findElement(By.id("Enter New Password")).sendKeys("Test@123");
        	        driver.findElement(By.id("Enter Confirm Passord")).sendKeys("Test@123");
        	        driver.findElement(By.id("Click set passord button")).click();
        	        
        	        
        	        WebElement successMessage=driver.findElement(By.id("Success Message"));
              	  
           	     String actualSuccessMessage = successMessage.getText();

           	        // Expected success message
           	        String expectedSuccessMessage = "Passord reset sucessfuly, Please Login with new password";

           	        // Verify the success message using TestNG assertion
           	      
           	        Assert.assertEquals(actualSuccessMessage, expectedSuccessMessage, "Success message mismatch");
              }  
        	    
       
           @Test
           public void LoginwithNewPassword() {
        	   
        	   driver.findElement(By.id("Username")).sendKeys("4000000277");
        	   driver.findElement(By.id("New Password")).sendKeys("Test@123");
        	   driver.findElement(By.id("Login Button")).click();
        	   
        		WebElement actualSuccessMessage=driver.findElement(By.id("com.drivetrackplus.uat:id/welcome"));

       		 actualSuccessMessage.getText();
       		@SuppressWarnings("unused")
			String expectedSuccessMessage ="Welcome";
       		
       		 if (isUserLoggedIn(driver)) {
       	            System.out.println("Test Passed: User logged in successfully!");
       	        } else {
       	            System.out.println("Test Failed: User login unsuccessful.");
       	        }

       	   
       	    }

       	    // Helper method to check if the user is logged in
       	    @SuppressWarnings("unused")
			private static boolean isUserLoggedIn11(WebDriver driver) {
       	        // Use a condition to check if a certain element is present after successful login
       	        try {
       	            WebElement welcomeMessage = driver.findElement(By.id("com.drivetrackplus.uat:id/welcome"));
       	            return welcomeMessage.isDisplayed();
       	        } catch (Exception e) {
       	            // If the element is not found, return false
       	            return false;
       	        }
       	    }
        	   
           }
           


	    