package page.objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PetStoreMenu {

	// header
	
	public static final String LOGO_XPATH ="//div[@id='LogoContent']//a//img";
	public static final String SHOPPINGCART_XPATH ="//img[@name='img_cart']";
	public static final String SIGNIN_XPATH ="//a[contains(text(),'Sign In')]";
	public static final String HELP_XPATH ="//a[contains(text(),'?')]";
	public static final String SEARCHBOX_XPATH ="//input[@name='keyword']";
	public static final String SEARCHBUTTON_XPATH ="//input[@name='searchProducts']";

	// ispod header-a
	
	public static final String FISH_XPATH ="//div[@id='QuickLinks']//a[1]//img[1]";
	public static final String DOGS_XPATH ="//div[@id='Header']//a[2]//img[1]";
	public static final String REPTILES_XPATH ="//div[@id='Header']//a[3]//img[1]";
	public static final String CATS_XPATH ="//div[@id='Header']//a[4]//img[1]";
	public static final String BIRDS_XPATH ="//div[@id='Header']//a[5]//img[1]";
	
	// meni sa leve strane
	
	public static final String LFISH_XPATH ="//div[@id='Content']//a[1]//img[1]";
	public static final String LDOGS_XPATH ="//div[@id='Content']//a[2]//img[1]";
	public static final String LREPTILES_XPATH ="//div[@id='Content']//a[4]//img[1]";
	public static final String LCATS_XPATH ="//div[@id='Content']//a[3]//img[1]";
	public static final String LBIRDS_XPATH ="//div[@id='Content']//a[5]//img[1]";
	
	//meni sa slikama
	
	public static final String PFISH_XPATH ="//body//area[2]";
	public static final String PDOGS_XPATH ="//body//area[3]";
	public static final String PREPTILES_XPATH ="//body//area[4]";
	public static final String PCATS_XPATH ="//body//area[5]";
	public static final String PBIRDS_XPATH ="//body//area[6]";
	
	// footer
	
	public static final String BATIS_XPATH ="//a[contains(text(),'www.mybatis.org')]";
	
		public static WebElement getLogo(WebDriver driver) {
		return driver.findElement(By.xpath(LOGO_XPATH));
		}
		public static void clickOnLogo(WebDriver driver)  {
			getLogo(driver).click();
		}
		
		public static WebElement getShoppingCart(WebDriver driver) {
			return driver.findElement(By.xpath(SHOPPINGCART_XPATH));
			}
		public static void clickShoppingCart(WebDriver driver)  {
				getShoppingCart(driver).click();
		
		}
		public static WebElement getSignIn(WebDriver driver) {
			return driver.findElement(By.xpath(SIGNIN_XPATH));
			}
		public static void clickSignIn(WebDriver driver)  {
				getSignIn(driver).click();
		
		}
		public static WebElement getHelp(WebDriver driver) {
			return driver.findElement(By.xpath(HELP_XPATH));
			}
		public static void clickHelp(WebDriver driver)  {
				getHelp(driver).click();
		
		}
		public static WebElement getSearchBox(WebDriver driver) {
			return driver.findElement(By.xpath(SEARCHBOX_XPATH));
			}
		public static void clickSearchBox(WebDriver driver)  {
				getSearchBox(driver).click();
		}
		public static void inputData(WebDriver driver,String data) {
			getSearchBox(driver).sendKeys(data);
		}
		
		public static WebElement getSearchButton(WebDriver driver) {
			return driver.findElement(By.xpath(SEARCHBUTTON_XPATH));
			}
		public static void clickSearchButton(WebDriver driver)  {
				getSearchButton(driver).click();
		
		}
		public static WebElement getFish(WebDriver driver) {
			return driver.findElement(By.xpath(FISH_XPATH));
			}
		public static void clickFish(WebDriver driver)  {
				getFish(driver).click();
		
		}
		public static WebElement getDogs(WebDriver driver) {
			return driver.findElement(By.xpath(DOGS_XPATH));
			}
		public static void clickDogs(WebDriver driver)  {
				getDogs(driver).click();
		
		}
		public static WebElement getReptiles(WebDriver driver) {
			return driver.findElement(By.xpath(REPTILES_XPATH));
			}
		public static void clickReptiles(WebDriver driver)  {
				getReptiles(driver).click();
		
		}
		public static WebElement getCats(WebDriver driver) {
			return driver.findElement(By.xpath(CATS_XPATH));
			}
		public static void clickCats(WebDriver driver)  {
				getCats(driver).click();
		
		}
		public static WebElement getBirds(WebDriver driver) {
			return driver.findElement(By.xpath(BIRDS_XPATH));
			}
		public static void clickBirds(WebDriver driver)  {
				getBirds(driver).click();
		
		}
		public static WebElement getLFish(WebDriver driver) {
			return driver.findElement(By.xpath(LFISH_XPATH));
			}
		public static void clickLFish(WebDriver driver)  {
				getLFish(driver).click();
		
		}
		public static WebElement getLDogs(WebDriver driver) {
			return driver.findElement(By.xpath(LDOGS_XPATH));
			}
		public static void clickLDogs(WebDriver driver)  {
				getLDogs(driver).click();
		
		}
		public static WebElement getLReptiles(WebDriver driver) {
			return driver.findElement(By.xpath(LREPTILES_XPATH));
			}
		public static void clickLReptiles(WebDriver driver)  {
				getLReptiles(driver).click();
		
		}
		public static WebElement getLCats(WebDriver driver) {
			return driver.findElement(By.xpath(LCATS_XPATH));
			}
		public static void clickLCats(WebDriver driver)  {
				getLCats(driver).click();
		
		}
		public static WebElement getLBirds(WebDriver driver) {
			return driver.findElement(By.xpath(LBIRDS_XPATH));
			}
		public static void clickLBirds(WebDriver driver)  {
				getLBirds(driver).click();
		
		}
		
		public static WebElement getPFish(WebDriver driver) {
			return driver.findElement(By.xpath(PFISH_XPATH));
			}
		public static void clickPFish(WebDriver driver)  {
				getPFish(driver).click();
		
		}
		public static WebElement getPDogs(WebDriver driver) {
			return driver.findElement(By.xpath(PDOGS_XPATH));
			}
		public static void clickPDogs(WebDriver driver)  {
				getPDogs(driver).click();
		
		}
		public static WebElement getPReptiles(WebDriver driver) {
			return driver.findElement(By.xpath(PREPTILES_XPATH));
			}
		public static void clickPReptiles(WebDriver driver)  {
				getPReptiles(driver).click();
		
		}
		public static WebElement getPCats(WebDriver driver) {
			return driver.findElement(By.xpath(PCATS_XPATH));
			}
		public static void clickPCats(WebDriver driver)  {
				getPCats(driver).click();
		
		}
		public static WebElement getPBirds(WebDriver driver) {
			return driver.findElement(By.xpath(PBIRDS_XPATH));
			}
		public static void clickPBirds(WebDriver driver)  {
				getPBirds(driver).click();
		
		}
		
		public static WebElement getBatis(WebDriver driver) {
			return driver.findElement(By.xpath(BATIS_XPATH));
			}
		public static void clickBatis(WebDriver driver)  {
				getBatis(driver).click();
		
		}
		
}
