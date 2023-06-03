package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import Base.LoginBase;
import Pages.LoginPage;

public class LoginTestCase extends LoginBase {
	static LoginPage lp = new LoginPage(driver);

	@Test
	public void login() {
		lp.validLogin();

	}

	@Test
	public void verifyTile() {
		String actual = lp.verifyTitle();
		Assert.assertEquals(actual, "Swag Labs");

	}

	@Test
	public void verifyLogo() {
		boolean actual = lp.verifyLogo();
		Assert.assertTrue(actual);
	}

	@Test
	public void verifyeNoOFProduct() {
		Integer size = lp.validateNoOFProduct();
		Assert.assertEquals(size, 6);
	}

	@Test
	public void verifyFilter() {
		String s = lp.verifyFilter().get(3).getText();
		Assert.assertEquals(s, "Price (high to low)");
	}
}
