package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.Leave;

public class LeaveTest extends BaseTest {
	private Leave leave;
	@BeforeMethod
    public void initPage() {
		leave = new Leave(driver);
    }
	 @Test(priority=1)
	 public void verifyApplyLinkRedirection() {
		 String url =leave.clickApplyLink();
		 Assert.assertTrue(url.contains("applyLeave"));
	 }
	 @Test(priority=2)
	 public void verifyMyLeaveLinkRedirection() {
		 String url =leave.clickMyLeaveLink();
		 Assert.assertTrue(url.contains("viewMyLeaveList"));
	 }
	 @Test(priority=3)
	 public void verifyEntitlementsLinkRedirection() {
		 String url =leave.clickEntitlementLink();
		 Assert.assertTrue(url.contains("leave"));
	 }
	 @Test(priority=4)
	 public void verifyReportLinkRedirection() {
		 String url =leave.clickReportsLink();
		 Assert.assertTrue(url.contains("leave"));
	 }
	 @Test(priority=5)
	 public void verifyConfigureLinkRedirection() {
		 String url =leave.clickConfigureLink();
		 Assert.assertTrue(url.contains("leave"));
	 }
	 @Test(priority=6)
	 public void verifyLeaveListLinkRedirection() {
		 String url =leave.clickAssignLeaveListLink();
		 Assert.assertTrue(url.contains("leave"));
	 }
	 @Test(priority=7)
	 public void verifyAssignLeaveLinkRedirection() {
		 String url =leave.clickAssignLeaveListLink();
		 Assert.assertTrue(url.contains("assignLeave"));
	 }
}
