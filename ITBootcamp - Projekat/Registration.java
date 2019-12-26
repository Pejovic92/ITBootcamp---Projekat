package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	//user information
	public static final String REGISTRATION_URL = "https://petstore.octoperf.com/actions/Account.action?newAccountForm=";
	public static final String USERID_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]]";
	public static final String PASSWORD_XPATH = "//input[@name='password']";
	public static final String REPEATPASSWORD_XPATH = "//input[@name='repeatedPassword']";
	
	//account information
	public static final String FNAME_XPATH = "//input[@name='account.firstName']";
	public static final String LNAME_XPATH = "//input[@name='account.lastName']";
	public static final String EMAILXPATH = "//input[@name='account.email']";
	public static final String PHONE__XPATH = "//input[@name='account.phone']";
	public static final String ADDRESS1_XPATH = "//input[@name='account.address1']";
	public static final String ADDRESS2_XPATH = "//input[@name='account.address2']";
	public static final String CITY_XPATH = "//input[@name='account.city']";
	public static final String STATE_XPATH = "//input[@name='account.state']";
	public static final String ZIP_XPATH = "//input[@name='account.zip']";
	public static final String COUNTRY_XPATH = "//input[@name='account.country']";
	
	//profile information
	
	public static final String LANGUAGE_XPATH = "//select[@name='account.languagePreference']";
	public static final String FAVOURITECATEGORY_XPATH = "//select[@name='account.favouriteCategoryId']";
	public static final String ENABLEMYLIST_XPATH = "//input[@name='account.listOption']";
	public static final String ENABLEMYBANNER_XPATH = "//input[@name='account.bannerOption']";
	public static final String SAVEACCOUNTINFO_XPATH = "//input[@name='newAccount']";
	
	public static void clickRegUrl(WebDriver driver) {
		 driver.findElement(By.xpath("https://petstore.octoperf.com/actions/Account.action?newAccountForm=")).click();
	}
	public static WebElement getUserID(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
	}
	public static void clickUsernameTextBox(WebDriver driver) {
		getUserID(driver).click();
	}
	public static void inputUserID(WebDriver driver, String user) {
		getUserID(driver).sendKeys(user);
	}
	public static void deleteUserID(WebDriver driver) {
		getUserID(driver).clear();
	}
	
	public static WebElement getPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public static void clickPassword(WebDriver driver) {
		getPassword(driver).click();
	}
	public static void inputPassword(WebDriver driver, String pass) {
		getPassword(driver).sendKeys(pass);
	}
	public static void deletePassword(WebDriver driver) {
		getPassword(driver).clear();
	}
	
	public static WebElement getRepeatPassword(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='repeatedPassword']"));
	}
	public static void clickRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).click();
	}
	public static void inputRepeatPassword(WebDriver driver, String rpass) {
		getRepeatPassword(driver).sendKeys(rpass);
	}
	public static void deleteRepeatPassword(WebDriver driver) {
		getRepeatPassword(driver).clear();
	}
	
	public static WebElement getFName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.firstName']"));
	}
	public static void clickFName(WebDriver driver) {
		getFName(driver).click();
	}
	public static void inputFName(WebDriver driver, String name) {
		getFName(driver).sendKeys(name);
	}
	public static void deleteFName(WebDriver driver) {
		getFName(driver).clear();
	}
	
	public static WebElement getLName(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.lastName']"));
	}
	public static void clickLName(WebDriver driver) {
		getLName(driver).click();
	}
	public static void inputLName(WebDriver driver, String surname) {
		getLName(driver).sendKeys(surname);
	}
	public static void deleteLName(WebDriver driver) {
		getLName(driver).clear();
	}
	
	public static WebElement getEmail(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.email']"));
	}
	public static void clickEmail(WebDriver driver) {
		getEmail(driver).click();
	}
	public static void inputEmail(WebDriver driver, String mail) {
		getEmail(driver).sendKeys(mail);
	}
	public static void deleteEmail(WebDriver driver) {
		getEmail(driver).clear();
	}
	
	public static WebElement getPhone(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.phone']"));
	}
	public static void clickPhone(WebDriver driver) {
		getPhone(driver).click();
	}
	public static void inputPhone(WebDriver driver, String phone) {
		getPhone(driver).sendKeys(phone);
	}
	public static void deletePhone(WebDriver driver) {
		getPhone(driver).clear();
	}
	
	public static WebElement getAddress1(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.address1']"));
	}
	public static void clickAddress1(WebDriver driver) {
		getAddress1(driver).click();
	}
	public static void inputAddress1(WebDriver driver, String address) {
		getAddress1(driver).sendKeys(address);
	}
	public static void deleteAddress1(WebDriver driver) {
		getAddress1(driver).clear();
	}
	
	public static WebElement getAddress2(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.address2']"));
	}
	public static void clickAddress2(WebDriver driver) {
		getAddress2(driver).click();
	}
	public static void inputAddress2(WebDriver driver, String address) {
		getAddress2(driver).sendKeys(address);
	}
	public static void deleteAddress2(WebDriver driver) {
		getAddress2(driver).clear();
	}
	
	public static WebElement getCity(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.city']"));
	}
	public static void clickCity(WebDriver driver) {
		getCity(driver).click();
	}
	public static void inputCity(WebDriver driver, String city) {
		getCity(driver).sendKeys(city);
	}
	public static void deleteCity(WebDriver driver) {
		getCity(driver).clear();
	}
	
	public static WebElement getState(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.state']"));
	}
	public static void clickState(WebDriver driver) {
		getState(driver).click();
	}
	public static void inputState(WebDriver driver, String state) {
		getState(driver).sendKeys(state);
	}
	public static void deleteState(WebDriver driver) {
		getState(driver).clear();
	}
	
	
	public static WebElement getZip(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.zip']"));
	}
	public static void clickZip(WebDriver driver) {
		getZip(driver).click();
	}
	public static void inputZip(WebDriver driver, String zip) {
		getZip(driver).sendKeys(zip);
	}
	public static void deleteZip(WebDriver driver) {
		getZip(driver).clear();
	}

	public static WebElement getCountry(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.country']"));
	}
	public static void clickCountry(WebDriver driver) {
		getCountry(driver).click();
	}
	public static void inputCountry(WebDriver driver, String country) {
		getCountry(driver).sendKeys(country);
	}
	public static void deleteCountry(WebDriver driver) {
		getCountry(driver).clear();
	}
	
	public static Select getLanguage(WebDriver driver) {
		return new Select (driver.findElement(By.xpath("//select[@name='account.languagePreference']")));
	}
	public static void inputLanguage(WebDriver driver, String language) {
		getLanguage(driver).selectByVisibleText(language);
	}
	
	public static Select getFavouriteCategory(WebDriver driver) {
		return new Select (driver.findElement(By.xpath("//select[@name='account.favouriteCategoryId']")));
	}
	public static void inputFavouriteCategory(WebDriver driver, String favourite) {
		getFavouriteCategory(driver).selectByVisibleText(favourite);
	}
	
	public static WebElement getEnableList(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.listOption']"));
	}
	public static void clickEnableList(WebDriver driver) {
		getEnableList(driver).click();
	}
	
	public static WebElement getEnableBanner(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='account.bannerOption']"));
	}
	public static void clickEnableBanner(WebDriver driver) {
		getEnableBanner(driver).click();
	}
	
	public static WebElement getSaveAccount(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='newAccount']"));
	}
	public static void clickSaveAccount(WebDriver driver) {
		getSaveAccount(driver).click();
	}
}
