package page.page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.Registration;
import page.objects.SignIn;

public class RegistationTestNG {
	
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
		HomePageUrl = "https://petstore.octoperf.com/actions/Catalog.action";
		String RegistrationUrl = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
		driver.get(RegistrationUrl);
	}
	//registracija jednog korisnika
  @Test(enabled=false)
  public void  registerOneUser() throws InterruptedException {
	  String RegistrationUrl = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	  driver.get(RegistrationUrl);
	  
	  ExcelUtils.setExcell("petstore1user.xls");
	  ExcelUtils.setWorkSheet(0);
	  
	  String UserId1 = ExcelUtils.getDataAt(1, 0);
	  double Id = Double.parseDouble(UserId1);
	  int UserIdInt = (int) Id;
	  String UserId =""+UserIdInt;
	  
	  String Password1 = ExcelUtils.getDataAt(1, 1);
	  double pass = Double.parseDouble(Password1);
	  int PasswordInt = (int) pass;
	  String Password =""+PasswordInt;
	  
	  String RPassword1 = ExcelUtils.getDataAt(2, 1);
	  double rpass = Double.parseDouble(RPassword1);
	  int RPasswordInt = (int) rpass;
	  String RPassword =""+RPasswordInt;
	  
	  String FName = ExcelUtils.getDataAt(3, 1);
	  String LName = ExcelUtils.getDataAt(4, 1);
	  String Email = ExcelUtils.getDataAt(5, 1);
	  String Phone = ExcelUtils.getDataAt(6, 1);
	  String Address1 = ExcelUtils.getDataAt(7, 1);
	  String City = ExcelUtils.getDataAt(8, 1);
	  String State = ExcelUtils.getDataAt(9, 1);
	  String Zip1 = ExcelUtils.getDataAt(10, 1);
	  double zip = Double.parseDouble(Zip1);
	  int ZipInt = (int) zip;
	  String Zip =""+ZipInt;
	  String Country = ExcelUtils.getDataAt(11, 1);
	  
	  Registration.inputUserID(driver, UserId);
	  Registration.inputPassword(driver, Password);
	  Registration.inputRepeatPassword(driver, RPassword);
	  Registration.inputFName(driver, FName);
	  Registration.inputLName(driver, LName);
	  Registration.inputEmail(driver, Email);
	  Registration.inputPhone(driver, Phone);
	  Registration.inputAddress1(driver, Address1);
	  Registration.inputCity(driver, City);
	  Registration.inputState(driver, State);
	  Registration.inputZip(driver, Zip);

	  Registration.inputCountry(driver, Country);
	  
	  
	  Registration.inputLanguage(driver, "japanese");
	  Registration.inputFavouriteCategory(driver, "DOGS");
	  Registration.clickEnableList(driver);
	  Registration.clickEnableBanner(driver);
	  Registration.clickSaveAccount(driver);
	  driver.navigate().refresh();
	  Thread.sleep(2000);
	  SoftAssert test = new SoftAssert();
	  test.assertEquals(driver.getCurrentUrl(), "https://petstore.octoperf.com/actions/Catalog.action");
	  test.assertAll();
	  
  }
  
  @Test
  //registracija 50 korisnika
  public void testRegister50Users() throws InterruptedException {
  
	  ExcelUtils.setExcell("MOCK_DATA.xls");
	  ExcelUtils.setWorkSheet(0);
  
	  
	  for(int i=1; i<=ExcelUtils.getRowNumber();i++) {
		  
		  
		  
	  
		  String UserId1 = ExcelUtils.getDataAt(i, 0);
		  double Id = Double.parseDouble(UserId1);
		  int UserIdInt = (int) Id;
		  String UserId =""+UserIdInt;
		  
		  String Password = ExcelUtils.getDataAt(i, 1);
		  String RPassword = ExcelUtils.getDataAt(i, 2);
		  String FName = ExcelUtils.getDataAt(i, 3);
		  String LName = ExcelUtils.getDataAt(i, 4);
		  String Email = ExcelUtils.getDataAt(i, 5);
		  String Phone = ExcelUtils.getDataAt(i, 6);
		  String Address1 = ExcelUtils.getDataAt(i, 7);
		  String Address2 = ExcelUtils.getDataAt(i, 8);
		  String City = ExcelUtils.getDataAt(i, 9);
		  String State = ExcelUtils.getDataAt(i, 10);
		  
		  String Zip1 = ExcelUtils.getDataAt(i, 11);
		  double zip = Double.parseDouble(Zip1);
		  int ZipInt = (int) zip;
		  String Zip =""+ZipInt;
		  
		  String Country = ExcelUtils.getDataAt(i, 12);
		  
		  Registration.inputUserID(driver, UserId);
		  Registration.inputPassword(driver, Password);
		  Registration.inputRepeatPassword(driver, RPassword);
		  Registration.inputFName(driver, FName);
		  Registration.inputLName(driver, LName);
		  Registration.inputEmail(driver, Email);
		  Registration.inputPhone(driver, Phone);
		  Registration.inputAddress1(driver, Address1);
		  Registration.inputAddress2(driver, Address2);
		  Registration.inputCity(driver, City);
		  Registration.inputState(driver, State);
		  Registration.inputZip(driver, Zip);
		  Registration.inputCountry(driver, Country);
		  
		  Registration.inputLanguage(driver, "english");
		  Registration.inputFavouriteCategory(driver, "DOGS");
		  Registration.clickEnableList(driver);
		  Registration.clickEnableBanner(driver);
		  Registration.clickSaveAccount(driver);
		  driver.get(SignIn.SIGNIN_URL);
		  driver.get(Registration.REGISTRATION_URL);
		  
		  Registration.deleteUserID(driver);
		  Registration.deletePassword(driver);
		  Registration.deleteRepeatPassword(driver);
		  Registration.deleteFName(driver);
		  Thread.sleep(1000);
		  Registration.deleteLName(driver);
		  Registration.deleteEmail(driver);
		  Registration.deletePhone(driver);
		  Registration.deleteAddress1(driver);
		  Registration.deleteAddress2(driver);
		  Registration.deleteCity(driver);
		  Thread.sleep(1000);
		  Registration.deleteState(driver);
		  Registration.deleteZip(driver);
		  Registration.deleteCountry(driver);
		  Thread.sleep(2000);
		  
		  
		  
  }
	  
  }
}
