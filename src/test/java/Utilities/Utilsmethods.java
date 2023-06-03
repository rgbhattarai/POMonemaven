package Utilities;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.LoginBase;

public class Utilsmethods extends LoginBase {

	public Utilsmethods(WebDriver driver) {
		Utilsmethods.driver = driver;

	}

	public String verifyTitle() {
		try {
			System.out.println("This is the Title: " + driver.getTitle());
			return driver.getTitle();
		} catch (Exception e) {
			throw new Error("Title not found");
		}
	}

	public WebElement getElement(By locator) {
		try {
			return driver.findElement(locator);
		} catch (Exception e) {
			throw new Error("Element not found");
			// return null;
		}
	}

	public void clearText(By locator) {
		try {
			getElement(locator).clear();
		} catch (Exception e) {
			throw new Error("Element not found");
		}
	}

	public void sendKeys(By locator, String text) {
		try {
			clearText(locator);
			getElement(locator).sendKeys(text);
		} catch (Exception e) {
			throw new Error("Element not found");
		}
	}

	public void maximizeWindow() {
		try {
			driver.manage().window().maximize();
		} catch (Exception e) {
			throw new Error("Not able to maximize");
		}
	}

	public void switchToAlert() {
		try {
			driver.switchTo().alert();
		} catch (Exception e) {
			throw new Error("No Alert to switch");
		}
	}

	public void implicitWait(int sec) {
		try {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		} catch (Exception e) {
			throw new Error("Error:Timeout ");
		}

	}

	public void fluentWaitclickable(int withtimeout, int pollingtime, By locator) {
		try {
			Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(withtimeout))
					.pollingEvery(Duration.ZERO.ofSeconds(pollingtime)).withMessage("Hello")
					.ignoring(NoSuchElementException.class);
			WebElement C = getElement(locator);
			wait.until(ExpectedConditions.elementToBeClickable(C));
		} catch (Exception e) {
			throw new Error("Error:Timeout ");
		}
	}

	public void explicitWaittobeClicable(int sec, By locator) {
		try {
			WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(sec));
			WebElement C = getElement(locator);
			explicitWait.until(ExpectedConditions.elementToBeClickable(C));
		} catch (Exception e) {
			throw new Error("Error:Timeout");
		}
	}

	public List<WebElement> getElements(By locator) {
		try {
			return driver.findElements(locator);
		} catch (Exception e) {
			throw new Error("Elements not found");
			// return null;
		}
	}

	public boolean isDisplayed(By locator) {
		try {
			getElement(locator).isDisplayed();
			return true;
		} catch (Exception e) {
			throw new Error("Element not found");
			// return null;
		}
	}

	public boolean isEnable(By locator) {
		try {
			getElement(locator).isEnabled();
			return true;
		} catch (Exception e) {
			throw new Error("Element not found");
			// return null;
		}
	}

	public boolean isSelected(By locator) {
		try {
			getElement(locator).isSelected();
			return true;
		} catch (Exception e) {
			throw new Error("Element not found");
			// return null;
		}
	}

	public List<WebElement> dropDownoptions(By locator) {
				
		Select s = new Select (getElement (locator));
		 return s.getOptions();
	}
}
