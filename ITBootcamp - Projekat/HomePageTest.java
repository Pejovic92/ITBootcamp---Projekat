package page.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import page.objects.HomePage;


public class HomePageTest {
	// testiranje ulaska u pocetnu stranicu
  @Test
  public void enterStore() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String URL = HomePage.MainUrl;
		driver.get(URL);
		HomePage.getMainUrl(driver);
		HomePage.enterStore(driver);
		SoftAssert test = new SoftAssert();
		test.assertEquals(driver.getCurrentUrl(), HomePage.HomePage_Url);
		test.assertAll();
		Thread.sleep(2000);
		driver.close();
		
  }
  
}
