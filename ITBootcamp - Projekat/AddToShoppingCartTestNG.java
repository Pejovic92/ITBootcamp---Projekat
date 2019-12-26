package page.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.Animals;
import page.objects.ExcelUtils;
import page.objects.HomePage;
import page.objects.PetStoreMenu;
import page.objects.SignIn;

public class AddToShoppingCartTestNG {
	
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
		ExcelUtils.setExcell("C:\\Users\\Pejovic\\Desktop\\OneUserInfoChange.xls");
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
		
		}
	// provera da li se zivotinja nalazi u korpi
  @Test
  public void testAddToCart() {
	  PetStoreMenu.clickFish(driver);
	  driver.findElement(By.xpath(Animals.FISHANGEL_XPATH)).click();
	  driver.findElement(By.xpath(Animals.ADDFISH_SMALLANGELFISH_XPATH)).click();
	  SoftAssert test = new SoftAssert();
	  test.assertEquals(driver.findElement(By.xpath(Animals.FISH_SMALLANGELFISH_XPATH)).getText(), "EST-2");
	  test.assertAll();
  }
}
