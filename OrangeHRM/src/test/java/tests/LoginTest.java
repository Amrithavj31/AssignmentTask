package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Login;

public class LoginTest extends BaseTest {
	private Login login;
	
	 @BeforeMethod
	    public void initPage() {
		 login = new Login(driver);
	    }
	 @Test(priority=1)
	 public void verifyUsernameField() {
		  String url=login.clickUsername();
		  Assert.assertTrue(url.contains("login"));
	 }
	 @Test(priority=2)
	 public void verifyPasswordField() {
		  String url=login.clickPassword();
		  Assert.assertTrue(url.contains("login"));
	 }
	 @Test(priority=3)
	 public void verifySubmitButton() {
		  login.clickSubmitButton();
	 }
	 @Test(priority=4)
	 public void verifyDashboardPage() {
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
	 }
}
