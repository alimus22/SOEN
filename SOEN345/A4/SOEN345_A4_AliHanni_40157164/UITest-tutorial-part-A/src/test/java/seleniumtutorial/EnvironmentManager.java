package test.java.seleniumtutorial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentManager {

	public static void initWebDriver() {
		// setting the driver executable
		// don't forget to change this if you change the browser driver location
		// also don't forget to download a driver...
		String path = "/Users/alihanni/GitHub/SOEN/SOEN345/A4/UITest-tutorial-part-A/driver/chromedriver";
		System.setProperty("webdriver.chrome.driver", path);

		// Initiating your chromedriver
		WebDriver driver = new ChromeDriver();

		RunEnvironment.setWebDriver(driver);
	}

	public static void shutDownDriver() {
		RunEnvironment.getWebDriver().quit();
	}
}
