package test;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.BaseTest;

public class Customer extends BaseTest{

	@Test(testName = "Verify customer drop down....")
	public void clickOnCustomersDropDown() {
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customersAt_4_dropDown_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customersAt_4_dropDown_loc"))).click();
		log.info("Customer Drop down has been clicked.");

	}
	
	@Test(testName = "Click on customers option under customers drop down")
	public void clickOnCustomersUnderDropDown() {
		Customer c=new Customer();
		c.clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customers_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customers_loc"))).click();
		log.info("customers option has been clicked!");
	}
	
	@Test(testName = "Click on Customer roles option under customers drop down")
	public void clickOnCustomerRolesUnderDropDown() {
		Customer c=new Customer();
		c.clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("customer_roles_loc"))));
		driver.findElement(By.xpath(loc.getProperty("customer_roles_loc"))).click();
		log.info("customer roles option has been clicked!");
	}
	
	@Test(testName = "Click on Online Customer option under customers drop down")
	public void clickOnOnlineCustomers() {
		Customer c=new Customer();
		c.clickOnCustomersDropDown();
		WebDriverWait wait = new WebDriverWait(driver, 20);	
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(loc.getProperty("onlineCustomers_loc"))));
		driver.findElement(By.xpath(loc.getProperty("onlineCustomers_loc"))).click();
		log.info("Online Customers has been clicked!");
	}

}
