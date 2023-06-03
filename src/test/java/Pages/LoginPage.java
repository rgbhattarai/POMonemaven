package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.LoginBase;

public class LoginPage extends LoginBase {

	public LoginPage(WebDriver driver) {
		LoginPage.driver = driver;
	}

	By username = By.cssSelector("#user-name");
	By password = By.cssSelector("#password");
	By login = By.cssSelector("#login-button");
	By errmsg = By.cssSelector("#login_button_container > div > form > div.error-message-container.error > h3");
	By logo = By.cssSelector("#header_container > div.primary_header > div.header_label > div");

	public void validLogin() {
		driver.findElement(username).sendKeys("standard_user");
		driver.findElement(password).sendKeys("secret_sauce");
		driver.findElement(login).click();
	}

	public boolean invalidLogin() {
		driver.findElement(username).sendKeys("standard_use");
		driver.findElement(password).sendKeys("secret_sauc");
		driver.findElement(login).click();
		return driver.findElement(errmsg).isDisplayed();
	}
	public String verifyTitle () {
		return driver.getTitle();
	}
	public boolean verifyLogo() {
		return driver.findElement(logo).isDisplayed();
	}
	public Integer validateNoOFProduct () {
		List <WebElement> e=driver.findElements(By.cssSelector("div[class='inventory_item']"));
		return e.size();
	}
	public List<WebElement> verifyFilter () {
		WebElement e=driver.findElement(By.cssSelector("select[class=product_sort_container]"));
		Select options = new Select (e);
		return options.getOptions();
		
	}
}