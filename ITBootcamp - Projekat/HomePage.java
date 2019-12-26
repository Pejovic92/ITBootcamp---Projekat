package page.objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {

	
	// po konvenciji konstante se pisu velikim sloovom gde se reci odvajaju donjom crtom
	// to nije greska, vec ustaljena praksa
	public static final String MainUrl="https://petstore.octoperf.com/";
	public static final String MainUrl_XPath = "//a[contains(text(),'Enter the Store')]";
	public static final String HomePage_Url ="https://petstore.octoperf.com/actions/Catalog.action";
	
	public static WebElement getMainUrl(WebDriver driver) {
		return driver.findElement(By.xpath(MainUrl_XPath));
	}
	public static void enterStore(WebDriver driver)  {
		getMainUrl(driver).click();
	}
}
