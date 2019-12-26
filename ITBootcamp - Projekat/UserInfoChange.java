package page.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.Registration;
import page.objects.SignIn;

public class UserInfoChange {
  
	WebDriver driver;
	String HomePageUrl;
	
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	String URL = HomePage.MainUrl;
	driver.get(URL);
	HomePage.getMainUrl(driver);
	HomePage.enterStore(driver);
	driver.get(SignIn.SIGNIN_URL);
	}
	// menjanje informacija o korisniku i citanje izmenjenih  informacija bez Logout-a
	@Test(enabled=false)
	public void testUserInfoChange() throws InterruptedException {
		
		ExcelUtils.setExcell("OneUserInfoChange.xls");
		ExcelUtils.setWorkSheet(0);
		SignIn.deletePassword(driver);
		String UserId1 = ExcelUtils.getDataAt(1, 0);
		double Id = Double.parseDouble(UserId1);
		int UserIdInt = (int) Id;
		String UserId =""+UserIdInt;
		String Password = ExcelUtils.getDataAt(1, 1);
		SignIn.inputUsername(driver, UserId);
		SignIn.inputPassword(driver, Password);
		SignIn.clickLoginButton(driver);
		Thread.sleep(1000);
		SignIn.clickMyAccount(driver);
		Registration.deleteFName(driver);
		Registration.deleteLName(driver);
		Registration.getFName(driver).sendKeys("Predrag");
		Registration.getLName(driver).sendKeys("Pejovic");
		String SaveInfo_Xpath = "//input[@name='editAccount']";
		driver.findElement(By.xpath(SaveInfo_Xpath)).click();
		Thread.sleep(2000);
		PetStoreMenu.clickOnLogo(driver);
		SignIn.clickMyAccount(driver);
		String FName =driver.findElement(By.xpath(Registration.FNAME_XPATH)).getAttribute("value");
		String LName =driver.findElement(By.xpath(Registration.LNAME_XPATH)).getAttribute("value");
		System.out.println(FName);
		System.out.println(LName);
		SoftAssert test = new SoftAssert();
		test.assertEquals(FName, "Predrag");
		test.assertEquals(LName, "Pejovic");
		test.assertAll();
		driver.close();
		
	}
	
	// menjanje informacija o korisniku i citanje izmenjenih  informacija nakon Logout-a, i ponovnog LogIn-a
	@Test//(enabled=false)
	public void testUserInfoChange2() throws InterruptedException {
		
		ExcelUtils.setExcell("OneUserInfoChange.xls");
		ExcelUtils.setWorkSheet(0);
		SignIn.deletePassword(driver);
		String UserId1 = ExcelUtils.getDataAt(1, 0);
		double Id = Double.parseDouble(UserId1);
		int UserIdInt = (int) Id;
		String UserId =""+UserIdInt;
		String Password = ExcelUtils.getDataAt(1, 1);
		SignIn.inputUsername(driver, UserId);
		SignIn.inputPassword(driver, Password);
		SignIn.clickLoginButton(driver);
		Thread.sleep(1000);
		SignIn.clickMyAccount(driver);
		Registration.deleteFName(driver);
		Registration.deleteLName(driver);
		Registration.getFName(driver).sendKeys("Predrag");
		Registration.getLName(driver).sendKeys("Pejovic");
		String SaveInfo_Xpath = "//input[@name='editAccount']";
		driver.findElement(By.xpath(SaveInfo_Xpath)).click();
		Thread.sleep(2000);
		PetStoreMenu.clickOnLogo(driver);
		String SignOut ="//a[contains(text(),'Sign Out')]";
		driver.findElement(By.xpath(SignOut)).click();
		driver.get(SignIn.SIGNIN_URL);
		SignIn.deletePassword(driver);
		SignIn.inputUsername(driver, UserId);
		SignIn.inputPassword(driver, Password);
		SignIn.clickLoginButton(driver);
		SignIn.clickMyAccount(driver);
		String FName =driver.findElement(By.xpath(Registration.FNAME_XPATH)).getAttribute("value");
		String LName =driver.findElement(By.xpath(Registration.LNAME_XPATH)).getAttribute("value");
		System.out.println(FName);
		System.out.println(LName);
		SoftAssert test = new SoftAssert();
		test.assertEquals(FName, "Predrag");
		test.assertEquals(LName, "Pejovic");
		test.assertAll();
		driver.quit();
	}
}