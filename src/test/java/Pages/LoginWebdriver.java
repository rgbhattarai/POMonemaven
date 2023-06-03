package Pages;


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Base.LoginBase;
public class LoginWebdriver extends LoginBase {
	
		public LoginWebdriver (WebDriver driver) {
			LoginWebdriver.driver = driver;
		}

		By contactus = By.cssSelector("#contact-us");
		By dropdowncheckboxesradiobuttons = By.cssSelector("#dropdown-checkboxes-radiobuttons");
		By actions = By.cssSelector("#actions");
		By popupalerts = By.cssSelector("#popup-alerts");
		By iframe = By.cssSelector("#iframe");


		public void windowContactus() {
			//String ParentTab = driver.getWindowHandle();
			driver.findElement(contactus).click();
			Set<String> ChildTab = driver.getWindowHandles();
			System.out.println(ChildTab);
			driver.findElement(contactus).click();
			Iterator <String> ii = ChildTab.iterator();
			String ParentT = ii.next();
			String ChildT = ii.next();
			driver.switchTo().window(ChildT);
		}
		public void dropdowncheckboxesradiobuttons() {
			//String ParentTab = driver.getWindowHandle();
			driver.findElement(dropdowncheckboxesradiobuttons).click();
			Set<String> ChildTab = driver.getWindowHandles();
			System.out.println(ChildTab);
			driver.findElement(dropdowncheckboxesradiobuttons).click();
			Iterator <String> ii = ChildTab.iterator();
			String ParentT = ii.next();
			String ChildT = ii.next();
			driver.switchTo().window(ChildT);
		}
		public void actions() {
			//String ParentTab = driver.getWindowHandle();
			driver.findElement(actions).click();
			Set<String> ChildTab = driver.getWindowHandles();
			System.out.println(ChildTab);
			driver.findElement(actions).click();
			Iterator <String> ii = ChildTab.iterator();
			String ParentT = ii.next();
			String ChildT = ii.next();
			driver.switchTo().window(ChildT);
		}
		public void popupalerts() {
			
			//String ParentTab = driver.getWindowHandle();
			driver.findElement(popupalerts).click();
			Set<String> ChildTab = driver.getWindowHandles();
			System.out.println(ChildTab);
			driver.findElement(popupalerts).click();
			Iterator <String> ii = ChildTab.iterator();
			String ParentT = ii.next();
			String ChildT = ii.next();
			driver.switchTo().window(ChildT);
		}
	public void iframe() {
			
			//String ParentTab = driver.getWindowHandle();
			driver.findElement(iframe).click();
			Set<String> ChildTab = driver.getWindowHandles();
			System.out.println(ChildTab);
			driver.findElement(iframe).click();
			Iterator <String> ii = ChildTab.iterator();
			String ParentT = ii.next();
			String ChildT = ii.next();
			driver.switchTo().window(ChildT);
		}
}
