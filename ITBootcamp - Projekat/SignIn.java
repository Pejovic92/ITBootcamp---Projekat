package page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn {
	public static final String SIGNIN_URL = "https://petstore.octoperf.com/actions/Account.action?signonForm=";
	
	public static final String USERNAMETEXTBOX_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"; 
	public static final String PASSWORDTEXTBOX_XPATH = "/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"; 
	public static final String LOGINBUTTON_XPATH = "//input[@name='signon']"; 
	public static final String REGISTERBUTTON_XPATH = "//a[contains(text(),'Register Now!')]";
	public static final String MYACCOUNT_XPATH = "/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]";
	
	public static void clickSignInUrl(WebDriver driver) {
		driver.findElement(By.xpath("https://petstore.octoperf.com/actions/Account.action?signonForm=")).click();;
	}
	public static void clickMyAccount(WebDriver driver) {
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/a[3]")).click();
	}
	
	public static WebElement getLogOut(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'Sign Out')]"));
	}
	public static void clickLogOut(WebDriver driver) {
		getLogOut(driver).click();
	}
	public static WebElement getUsernameTextBox(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[1]"));
	}
	public static void clickUsernameTextBox(WebDriver driver) {
		getUsernameTextBox(driver).click();
	}
	public static void inputUsername(WebDriver driver, String username) {
		getUsernameTextBox(driver).sendKeys(username);
	}
	public static void deleteUser(WebDriver driver) {
		getUsernameTextBox(driver).clear();
	}
	
	public static WebElement getPasswordTextBox(WebDriver driver) {
		return driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/form[1]/p[2]/input[2]"));
	}
	public static void clickPasswordTextBox(WebDriver driver) {
		getPasswordTextBox(driver).click();
	}
	public static void inputPassword(WebDriver driver, String password) {
		getPasswordTextBox(driver).sendKeys(password);
	}
	public static void deletePassword(WebDriver driver) {
		getPasswordTextBox(driver).clear();
	}
	
	public static WebElement getLoginButton(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='signon']"));
	}
	public static void clickLoginButton(WebDriver driver) {
		getLoginButton(driver).click();
	}
	public static WebElement getRegisterButton(WebDriver driver) {
		return driver.findElement(By.xpath("//a[contains(text(),'Register Now!')]"));
	}
	public static void clickRegisterButton(WebDriver driver) {
		getRegisterButton(driver).click();
	}
}
