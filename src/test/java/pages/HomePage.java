package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {

	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(xpath = "//div[@class='account-cart-wrapper']/a")
	private WebElement account;
	@FindBy(xpath="//div[@id='header-account']/div[@class='links']/ul/li/a")
	private List<WebElement> listofAccountHeaders;
	
	public void clickOnAccountHeader(String menu) {
		account.click();
		int sizeOfMenu = listofAccountHeaders.size();
		for(int i=0; i<sizeOfMenu;i++) {
			if(listofAccountHeaders.get(i).getText().equalsIgnoreCase(menu))
				listofAccountHeaders.get(i).click();
			
		}
		
			
	}

}
