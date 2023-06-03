package TestCases;

import org.testng.annotations.Test;

import Base.LoginBase;
import Pages.LoginPage;
import Pages.LoginWebdriver;
import Utilities.Utilsmethods;

public class TestCasewithutils extends LoginBase {

	public static Utilsmethods utils = new Utilsmethods(driver);
	public static LoginWebdriver lwd = new LoginWebdriver(driver);

	@Test
	public void verifyTitle() {
		utils.maximizeWindow();
		utils.implicitWait(5);
		lwd.windowContactus();
		lwd.tearDown();
		lwd.dropdowncheckboxesradiobuttons();
		lwd.tearDown();
		lwd.actions();
		lwd.tearDown();
		lwd.iframe();
		lwd.tearDown();
		lwd.popupalerts();
		lwd.tearDown();

	}
}
