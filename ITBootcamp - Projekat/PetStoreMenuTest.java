package page.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


import page.objects.HomePage;
import page.objects.PetStoreMenu;

public class PetStoreMenuTest {
	WebDriver driver;
	String HomePageUrl;
	
	// postavka za metode
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
		
	}
	@AfterClass
	public void close() {
		driver.close();
	}
	
	//testiranje headera
  @Test
  public void testLogo() throws InterruptedException {
	 String LogoURL = "https://petstore.octoperf.com/actions/Catalog.action";
	 SoftAssert test = new SoftAssert();
	 PetStoreMenu.clickDogs(driver);
	 PetStoreMenu.clickOnLogo(driver);
	 test.assertEquals(driver.getCurrentUrl(), LogoURL);
	 System.out.println("Url loga je "+LogoURL+" a"+driver.getCurrentUrl());
	 driver.navigate().to(HomePageUrl);
	 test.assertAll();
	 

  }
	@Test
  public void testShopingCart() throws InterruptedException {
	  
	  SoftAssert test = new SoftAssert();
	  PetStoreMenu.clickShoppingCart(driver);
	  String CartTitle = driver.findElement(By.xpath("//h2[contains(text(),'Shopping Cart')]")).getText();
	  System.out.println(CartTitle);
	  test.assertEquals(CartTitle , "Shopping Cart");
	  test.assertAll();
	  driver.navigate().to(HomePageUrl);
	
  }
	@Test
	public void testSignInButton() throws InterruptedException {
		
		Thread.sleep(1000);
		SoftAssert test = new SoftAssert();
		PetStoreMenu.clickSignIn(driver);
		Thread.sleep(1000);
		String SignInTitle = driver.findElement(By.xpath("//p[contains(text(),'Please enter your username and password.')]")).getText();
		test.assertEquals(SignInTitle, "Please enter your username and password.");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
		
	}
	
	@Test
	public void testHelp() throws InterruptedException {
		String HelpUrl = "https://petstore.octoperf.com/help.html";
		Thread.sleep(1000);
		SoftAssert test = new SoftAssert();
		PetStoreMenu.clickHelp(driver);
		Thread.sleep(1000);
		test.assertEquals(driver.getCurrentUrl(), HelpUrl);
		Thread.sleep(1000);
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	
	// testiranje linkova ispod headera
	@Test
	public void testFishLink() throws InterruptedException {
		PetStoreMenu.clickFish(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String FishTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Fish')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(FishTableTitle, "Fish");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	@Test
	public void testDogsLink() throws InterruptedException {
		PetStoreMenu.clickDogs(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String DogsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Dogs')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(DogsTableTitle, "Dogs");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	@Test
	public void testReptilesLink() throws InterruptedException {
		PetStoreMenu.clickReptiles(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String ReptilesTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Reptiles')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(ReptilesTableTitle, "Reptiles");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	@Test
	public void testCatsLink() throws InterruptedException {
		PetStoreMenu.clickCats(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String CatsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Cats')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(CatsTableTitle, "Cats");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	@Test
	public void testBirdsLink() throws InterruptedException {
		PetStoreMenu.clickBirds(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String BirdsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Birds')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(BirdsTableTitle, "Birds");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}

	// left menu linkovi
	@Test
	public void testLFishLink() throws InterruptedException {
		PetStoreMenu.clickLFish(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String FishTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Fish')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(FishTableTitle, "Fish");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	@Test
	public void testLDogsLink() throws InterruptedException {
		PetStoreMenu.clickLDogs(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String DogsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Dogs')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(DogsTableTitle, "Dogs");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		//driver.close();
		//driver.quit();
		test.assertAll();
	}
	
	@Test
	public void testLReptilesLink() throws InterruptedException {
		PetStoreMenu.clickLReptiles(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String ReptilesTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Reptiles')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(ReptilesTableTitle, "Reptiles");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		//driver.close();
	}
	@Test
	public void testLCatsLink() throws InterruptedException {
		PetStoreMenu.clickLCats(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String CatsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Cats')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(CatsTableTitle, "Cats");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		//driver.close();
	}
	
	
	@Test
	public void testLBirdsLink() throws InterruptedException {
		PetStoreMenu.clickLBirds(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String BirdsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Birds')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(BirdsTableTitle, "Birds");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	// linkovi sa slikama
	@Test
	public void testPFishLink() throws InterruptedException {
		PetStoreMenu.clickPFish(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String FishTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Fish')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(FishTableTitle, "Fish");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	@Test
	public void testPDogsLink() throws InterruptedException {
		PetStoreMenu.clickPDogs(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String DogsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Dogs')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(DogsTableTitle, "Dogs");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
		
	}
	
	@Test
	public void testPReptilesLink() throws InterruptedException {
		PetStoreMenu.clickPReptiles(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String ReptilesTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Reptiles')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(ReptilesTableTitle, "Reptiles");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	@Test
	public void testPCatsLink() throws InterruptedException {
		PetStoreMenu.clickPCats(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String CatsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Cats')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(CatsTableTitle, "Cats");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	
	@Test
	public void testPBirdsLink() throws InterruptedException {
		PetStoreMenu.clickLBirds(driver);
		SoftAssert test = new SoftAssert();
		Thread.sleep(1000);
		String BirdsTableTitle = driver.findElement(By.xpath("//h2[contains(text(),'Birds')]")).getText();
		Thread.sleep(1000);
		test.assertEquals(BirdsTableTitle, "Birds");
		driver.navigate().to(HomePageUrl);
		test.assertAll();
		
	}
	// test footera
	@Test
	public void testBatisLink() throws InterruptedException {
		String BatisUrl = "https://blog.mybatis.org/";
		Thread.sleep(1000);
		SoftAssert test = new SoftAssert();
		PetStoreMenu.clickBatis(driver);
		Thread.sleep(1000);
		test.assertEquals(driver.getCurrentUrl(), BatisUrl);
		System.out.println("Url korpe je "+BatisUrl+" a stvarni Url je "+driver.getCurrentUrl());
		Thread.sleep(1000);
		driver.navigate().to(HomePageUrl);
		test.assertAll();
	}
	
}

