package page.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.ExcelUtils;
import page.objects.HomePage;

import page.objects.SignIn;

public class LoginTestNG {
	
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
		String SignInUrl=SignIn.SIGNIN_URL;
		driver.get(SignInUrl);
	}
	
	// logovanje svih korisnika nakon ciscenja polja za password
  @Test//(enabled=false)
  public void testLoginUsers() throws InterruptedException {
	  ExcelUtils.setExcell("MOCK_DATA.xls");
	  ExcelUtils.setWorkSheet(0);
	  String LogedUserUrl="https://petstore.octoperf.com/actions/Account.action?signonForm=";
	  for(int i=1; i<ExcelUtils.getRowNumber();i++) {
	  SignIn.deletePassword(driver);
	  SignIn.deleteUser(driver);
	  
	  String UserId1 = ExcelUtils.getDataAt(i, 0);
	  double Id = Double.parseDouble(UserId1);
	  int UserIdInt = (int) Id;
	  String UserId =""+UserIdInt;
	  
	  String Password = ExcelUtils.getDataAt(i, 1);
	    
	  SignIn.inputUsername(driver, UserId);
	  SignIn.inputPassword(driver, Password);
	 
	  SignIn.clickLoginButton(driver);
	  Thread.sleep(1000);
	  SignIn.clickLogOut(driver);
	  driver.get(SignIn.SIGNIN_URL);
	  SoftAssert test = new SoftAssert();
	  test.assertEquals(driver.getCurrentUrl(), LogedUserUrl);
	  test.assertAll();
	  Thread.sleep(2000);
	  
   }
  }
  
  //test koji pada zbog vec postojece sifre
	@Test(enabled=false)
	
 public void testUserInfoChange() throws InterruptedException {
		
		ExcelUtils.setExcell("login1user.xls");
		ExcelUtils.setWorkSheet(0);
		
		String LogedUserUrl="https://petstore.octoperf.com/actions/Account.action?signonForm=";
		String UserId1 = ExcelUtils.getDataAt(1, 0);
		double Id = Double.parseDouble(UserId1);
		int UserIdInt = (int) Id;
		String UserId =""+UserIdInt;
		String Password = ExcelUtils.getDataAt(1, 1);

		SignIn.inputUsername(driver, UserId);
		SignIn.inputPassword(driver, Password);
		SignIn.clickLoginButton(driver);
		Thread.sleep(3000);
		//boolean b = driver.findElement(By.xpath("//li[contains(text(),'Signon failed.')]")).isDisplayed();
		SoftAssert test =new SoftAssert();
		test.assertEquals(driver.getCurrentUrl(), LogedUserUrl);
		test.assertAll();
		Thread.sleep(2000);
		//driver.close();
 }
	
	
}
