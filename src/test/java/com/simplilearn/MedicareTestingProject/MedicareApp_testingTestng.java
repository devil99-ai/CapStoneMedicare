package com.simplilearn.MedicareTestingProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import PageObject.Add_products_element;
import PageObject.CheckOutAndOrderWebElement;
import PageObject.Login_webElement;
import PageObject.OtherElements;
import PageObject.Payment_webElement;
import PageObject.SignUp_webElement;
import PageObject.logout_Element;
import SnapShot.takeSnapShot;
import io.github.bonigarcia.wdm.WebDriverManager;

public class MedicareApp_testingTestng {
	WebDriver driver;
	Add_products_element add;
	CheckOutAndOrderWebElement checkout;
	Login_webElement login;
	logout_Element logout;
	OtherElements others;
	Payment_webElement pay;
	takeSnapShot takeSnapshot;
	SignUp_webElement signUp;
	ExtentSparkReporter htmlReporter;
	ExtentReports extent;
	ExtentTest test1;
	
	@BeforeClass
	public void setUp() {
		add = new Add_products_element();
		checkout = new CheckOutAndOrderWebElement();
		login= new Login_webElement();
		logout= new logout_Element();
		others=new OtherElements();
		pay=new Payment_webElement();
		takeSnapshot=new takeSnapShot();
		new SignUp_webElement();
		//driver setup and open url
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost:12082/medicare_new");
		//logging setup
		htmlReporter=new ExtentSparkReporter("C://Users//svksh//eclipse-workspace//MedicareTestingProject//src//test//reports//extentReport1.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		test1 = extent.createTest("medicare site automation", "test to validate workflow ");
		
	}
	@Test
	public void SignUpValidationTest() throws Exception {
		try{
			Thread.sleep(5000);
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/webpage.png");
			test1.info("Medicare Website opened");
		}catch(Exception e) {
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/photo1.png");
		}
		try {
			driver.findElement(signUp.sign_up).click();
			driver.findElement(signUp.fill_first_name).sendKeys("souvik");
			driver.findElement(signUp.fill_last_name).sendKeys("sharma");
			driver.findElement(signUp.fill_email).sendKeys("souvik@sjllharggmaciiqckkkkkqbqkknnqvfkkaoggokka.clom");
			driver.findElement(signUp.fill_password).sendKeys("Souvik99@");
			driver.findElement(signUp.fill_confirm_password).sendKeys("Souvik99@");
			driver.findElement(signUp.fill_phone).sendKeys("9876543210");
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/fill_details.png");
			driver.findElement(signUp.next_billing_button).click();
			test1.pass("successfully filled details");
			
		}catch(Exception e){
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/fill_details.png");
			test1.fail("Error while filling details");
		}
		try {
			driver.findElement(signUp.fill_Address_1).sendKeys("116/4 A.C.Road");
			driver.findElement(signUp.fill_Address_2).sendKeys("post. Khagra, Indrapasta baghajatin club");
			driver.findElement(signUp.fill_city).sendKeys("Berhampore");
			driver.findElement(signUp.fill_postal_code).sendKeys("742103");
			driver.findElement(signUp.fill_state).sendKeys("West Bengal");
			driver.findElement(signUp.fill_country).sendKeys("India");
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/fill_address.png");
			driver.findElement(signUp.click_next).click();
			test1.pass("Successfully added address details");
			Thread.sleep(5000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getCause());
			test1.fail("failed to add address");
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/fill_address.png");
		}
		try {
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/confirm_details.png");
			test1.pass("successfully navigated to confirm page");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/failed_to_confirm_details.png");
			test1.fail("failed to navigated to confirm page");
		}
		try {
			driver.findElement(signUp.click_on_confirm).click();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/failed_to_confirm.png");
		}
		Thread.sleep(5000);
		try {
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/successfully_registered.png");
			test1.pass("successfully registered as a user");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			test1.fail("failed to register");
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/failed_to_register.png");
		}
		Assert.assertEquals(driver.getTitle(), "Medicare - Membership","user able to register successfully");
		
	}
	@Test
	public void validatingFailedLogin() throws Exception {
		try {
			driver.findElement(login.clickonlogin).click();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/login_page.png");
			driver.findElement(login.fill_email).sendKeys("svjshrm@faff.ccc");
			driver.findElement(login.fill_password).sendKeys("Souvik98@");
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/login_deatils_filling.png");
			driver.findElement(login.click_on_submit).click();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/loginFailed.png");
			boolean failed = driver.findElement(login.failed_login).isDisplayed();
			Assert.assertEquals(failed, true);
			test1.fail("failed to login as a user");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/login_not_failed.png");
		}
			String alertMessage= driver.findElement(By.xpath("/html/body/div/div[1]/div/div[1]/div/div")).getText(); // capture alert message
			Assert.assertEquals(alertMessage, "Username and Password is invalid!");
			System.out.println(alertMessage);
			Thread.sleep(5000);
		
	}
	@Test
	public void SuccessfulLiginTest() throws Exception {
		try {
			driver.findElement(login.fill_email).sendKeys("svkshrm@gmail.com");
			driver.findElement(login.fill_password).sendKeys("Souvik99@");
			driver.findElement(login.click_on_submit).click();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/able_to_fill_details.png");
			
		}catch(Exception e1) {
				e1.printStackTrace();
				test1.fail("Failed in 2nd login attempt");
			}
		try {
			Thread.sleep(5000);
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/homePage.png");
			test1.pass("After login user successfully navigated to homepage");
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/not_able_to_login.png");
			test1.fail("failed to navigated to homepage");
		}

	}
	@Test
	public void AddProductsToCart() throws Exception {
		try {
			driver.findElement(add.click_on_more_products).click();
			Thread.sleep(5000);
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/products.png");
			test1.pass("User navigated to product page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/products.png");
			test1.fail("failed to navigated to product page");
		}
		try {
			driver.findElement(add.product_1_add_cart).click();
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/add_product1.png");
			boolean qty = driver.findElement(add.product1).isDisplayed();
			Assert.assertEquals(qty, true,"successfully added one item");
			test1.pass("successfully added 1 item");
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getCause());
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/failed_add_products.png");
			test1.fail("Failed to add item");
		}
		try {
			driver.findElement(add.continue_shopping_btn);
			driver.findElement(add.product_2_Add_cart).click();
			Thread.sleep(5000);
			takeSnapShot.takeSnapShot1(driver, "Snapshot/pass_snapshot/add_product2.png");
			boolean qty1 = driver.findElement(add.product2).isDisplayed();
			Assert.assertEquals(qty1, true,"Successfully added two items");
			test1.pass("successfully added 2nd item");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getCause());
			takeSnapShot.takeSnapShot1(driver, "Snapshot/Failed_snapshot/not_add_product2.png");
			test1.fail("failed to add second item");
		}
	}
	@AfterClass
	public void tearDown() {
		driver.close();
		driver.quit();
		test1.pass("User successfully closed the driver session");
		extent.flush();
	}

}
