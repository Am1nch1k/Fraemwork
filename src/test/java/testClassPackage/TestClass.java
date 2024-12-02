

package testClassPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjectsPackage.LoginPage;
import pageObjectsPackage.NewUserRegistrationPage;
import java.util.concurrent.TimeUnit;


public class TestClass {
	public static WebElement element = null;
	String baseUrl;
	WebDriver driver;
	
	
	@BeforeMethod
	public void SetUp() {
		baseUrl = "http://thawing-shelf-73260.herokuapp.com/";
		System.setProperty("webdriver.gecko.driver", "/C:/Users/HP/Documents/workspace/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(baseUrl);
	}


	
	@Test(dataProvider="newUserData", dataProviderClass=DataProviderClass.class)
	public void testcase1_create_new_user(String username, String password, String confirmpassword) {
			NewUserRegistrationPage.newUserRegistration(driver, username, password, confirmpassword);		
	}
	
	
	

	
	@Test(dataProvider="loginData", dataProviderClass=DataProviderClass.class)
	public void testcase2_login_to_tracker(String username, String password) {
		LoginPage.loginToExpenseTracker(driver, username, password);
	}


	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}

