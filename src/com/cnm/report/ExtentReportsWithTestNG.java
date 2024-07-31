package com.cnm.report;

<<<<<<< HEAD
=======
//import org.testng.Assert;
//import static org.junit.Assert.*;
//import static org.assertj.core.api.assertions.*;
>>>>>>> c212156 (New Module)
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
<<<<<<< HEAD

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ExtentReportsWithTestNG {

	public ExtentReports extent;
	public ExtentSparkReporter spark;
	public ExtentTest test;
	
	public static void createExtentReportsWithTestNG(WebDriver driver) {
		// TODO Auto-generated method stub
		
=======
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ExtentReportsWithTestNG {
	
	ExtentReports extent = new ExtentReports();
	ExtentSparkReporter spark = new ExtentSparkReporter("Extentreport.html");
	//public ExtentReports extent;
	//public ExtentSparkReporter spark;
	public ExtentTest test;
	
	//WebElement menu_text = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Desktops']")));
			//String text = menu_text.getText();
			//assertThat(text).as("Verify text of Menu link").isEqualToIgnoringCase("Desktops");
	
	public static void createExtentReportsWithTestNG(WebDriver driver) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver.findElement(By.id("email")).sendKeys("rubaet@bs.com");
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys("rubaet1@R");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("rc-anchor-container")).click();
		//Thread.sleep(2000);
	    driver.findElement(By.cssSelector(".bigger-110")).click();
	    Thread.sleep(2000);
	    
	    driver.findElement(By.cssSelector(".user-info > span:nth-child(3)")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//div[@id='navbar-container']/div[2]/ul/li[3]/ul/li[3]/a/span")).click();
		Thread.sleep(2000);
>>>>>>> c212156 (New Module)
	}
	
	@Test
	public void setUpTest(){
<<<<<<< HEAD
	ExtentTest Test = extent.createTest("Launch Browser and Website").assignAuthor("Mohammad").assignCategory("UI Test").assignDevice("Desktop_chrome");
=======
	ExtentTest Test = extent.createTest("Launch Browser and Website").assignAuthor("John").assignCategory("UI Test").assignDevice("Desktop_chrome");
>>>>>>> c212156 (New Module)
	Test.log(Status.PASS,"Browser lunched");
	Test.pass("Browser launched successfully");
	test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void AboutUs() {
		test = extent.createTest("Verify About Us Menu Page")
				.assignAuthor("Rubaet")
=======
	public void ChangePasswordTest() {
		test = extent.createTest("Verify Change Password Menu Page")
				.assignAuthor("Tester")
>>>>>>> c212156 (New Module)
				.assignCategory("Smoke Test")
				.assignDevice("Desktop_chrome");
		test.pass("About Us page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void Products() {
		test = extent.createTest("Verify Products Menu Page")
				.assignAuthor("Qaiyum")
=======
	public void LogoutTest() {
		test = extent.createTest("Verify Logout Menu Page")
				.assignAuthor("End User")
>>>>>>> c212156 (New Module)
				.assignCategory("Sanity Test")
				.assignDevice("Desktop_chrome");
		test.pass("Product page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void FAQ() {
		test = extent.createTest("Verify FAQ Menu Page")
				.assignAuthor("Mitul")
				.assignCategory("RE Test")
=======
	public void ProfileTest() {
		test = extent.createTest("Verify Profile Menu Page")
				.assignAuthor("Client User")
				.assignCategory("Re Test")
>>>>>>> c212156 (New Module)
				.assignDevice("Desktop_chrome");
		test.pass("FAQ page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void Contact() {
		test = extent.createTest("Verify Contact Menu Page")
				.assignAuthor("John")
				.assignCategory("Smoke Test")
=======
	public void ActionTest() {
		test = extent.createTest("Verify Contact Menu Page")
				.assignAuthor("John")
				.assignCategory("Black Box Test")
>>>>>>> c212156 (New Module)
				.assignDevice("Desktop_chrome");
		test.pass("Contact page is able to clickable");
		test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void Login() {
=======
	public void ActSettingTest() {
>>>>>>> c212156 (New Module)
		test = extent.createTest("Verify user unable to login with invalid credentials")
				.assignAuthor("Smith")
				.assignCategory("User Acceptance Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User not able to login successfully");
		test.info("Displaying Page");
	}
	
	@Test
<<<<<<< HEAD
	public void Register() {
=======
	public void NonConformanceTest() {
>>>>>>> c212156 (New Module)
		test = extent.createTest("Verify user unable to register with invalid credentials")
				.assignAuthor("Robert")
				.assignCategory("Security Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to register to complete the application registration form");
		test.info("Displaying Page");;
	}
	
	@Test
<<<<<<< HEAD
	public void ResetPassword() {
		test = extent.createTest("Verify user unable to sent with invalid credentials")
=======
	public void MaintainSettingTest() {
		test = extent.createTest("Verify Setting Menu Page")
>>>>>>> c212156 (New Module)
				.assignAuthor("Carlo")
				.assignCategory("User Acceptance Testing")
				.assignDevice("Desktop_chrome");
		test.pass("User unable to reset passoword is not responding");
		test.warning("Reset password after first login credentials are invalid");
		test.info("Displaying Page");;
	}
	
<<<<<<< HEAD
	@Test
	public void ProductsAdd_DeleteCart() {
		test = extent.createTest("Verify user able to ProductsAdd_DeleteCart Successfully")
=======
    @Test
	public void AssetTest() {
		test = extent.createTest("Verify Asset Menu Page")
>>>>>>> c212156 (New Module)
				.assignAuthor("Rian")
				.assignCategory("Functionality Testing")
				.assignDevice("Desktop_chrome");
		test.fail("User unable to checkout selected items and after it is not responding");
		test.info("Displaying Page");
	}
	
<<<<<<< HEAD
	@Before
	public void beforeTest() {
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("ExtentReport.html");
		extent.attachReporter(spark);
	}

	@After
	public void afterTest() {
=======
	@BeforeTest
	public void BeforeTest() {
		
		extent.attachReporter(spark);
	}

	@AfterTest
	public void AfterTest() {
		
>>>>>>> c212156 (New Module)
		extent.flush();
	}

}