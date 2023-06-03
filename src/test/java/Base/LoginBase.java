package Base;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginBase {

	public static WebDriver driver;
	public static Properties pro = new Properties();

	@BeforeTest
	public void setUp() throws IOException {
		if (driver==null) {
			FileInputStream input = new FileInputStream ("C:\\Users\\bhatt\\eclipse-workspace\\POMone\\src\\test\\resources\\Config\\Browser.properties");
			pro.load(input);
			System.out.println(pro.getProperty("browser"));
		}
		if (pro.getProperty("browser").equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();
			driver.get(pro.getProperty("baseUrl"));
		}
		else if(pro.getProperty("browser").equals("Edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			driver.get(pro.getProperty("baseUrl"));
		}
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
