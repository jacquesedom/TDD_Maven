package paryajpam;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestParyajPam {
	String driverPath = "D:\\Ressources_Project\\geckodriver-v0.23.0-win64\\geckodriver.exe";
	
	private WebDriver driver;

	
	@Test
	public void testEasy() {
		driver.get("https://paryajpam.ht/main");
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains("ParyajPam"));
		
		//"Demo Guru99 Page"
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", driverPath);
		driver = new FirefoxDriver();
	}

	@AfterTest
	public void afterTest() {
		//driver.quit();
	}

}
