package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class Customer extends BaseTest{

	@Test(testName = "Verify customer drop down....")
	public static void clickOnCustomersDropDown() {
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customersAt_4_dropDown_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customersAt_4_dropDown_loc"))).click();
		log.info("Customer Drop down has been clicked.");

	}
	
	@Test(testName = "Click on customers option under customers drop down")
	public void clickOnCustomersUnderDropDown() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customers_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customers_loc"))).click();
		log.info("customers option has been clicked!");
	}
	
	@Test(testName = "Click on Customer roles option under customers drop down")
	public void clickOnCustomerRolesUnderDropDown() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customer_roles_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customer_roles_loc"))).click();
		log.info("customer roles option has been clicked!");
	}
	
	@Test(testName = "Click on Online Customer option under customers drop down")
	public void clickOnOnlineCustomers() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("onlineCustomers_loc"))));
		driver.findElement(By.xpath(loc.getProperty("onlineCustomers_loc"))).click();
		log.info("Online Customers has been clicked!");
	}
	
	@Test(testName = "Click on Vendors option....")
	public void clickOnVendors() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("vendors_loc"))));
		driver.findElement(By.xpath(loc.getProperty("vendors_loc"))).click();
		log.info("Vendors option has been clicked successfully!");
	}
	
	@Test(testName = "Click on Activity Log option....")
	public void clickOnActivityLog() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("activityLog_loc"))));
		driver.findElement(By.xpath(loc.getProperty("activityLog_loc"))).click();
		log.info("Activity Log option has been clicked successfully!");
	}
	
	
	@Test(testName = "Click on Activity Types....")
	public void clickOnActivityTypes() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("activityTypes_loc"))));
		driver.findElement(By.xpath(loc.getProperty("activityTypes_loc"))).click();
		log.info("Activity types option has been clicked successfully!");
	}
	
	@Test(testName = "Click on GDPR Request..")
	public void clickOnGDPRRequest() {
		clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("gdprRequest_loc"))));
		driver.findElement(By.xpath(loc.getProperty("gdprRequest_loc"))).click();
		log.info("GDPR Request option has been clicked successfully!");
	}
	

}
