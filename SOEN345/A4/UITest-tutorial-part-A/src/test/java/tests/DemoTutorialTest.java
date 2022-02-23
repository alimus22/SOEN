package test.java.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import test.java.seleniumtutorial.EnvironmentManager;
import test.java.seleniumtutorial.RunEnvironment;

import java.util.concurrent.TimeUnit;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class DemoTutorialTest {
	private WebDriver driver;
	 
    @Before
    public void startBrowser() {
        EnvironmentManager.initWebDriver();
        this.driver = RunEnvironment.getWebDriver();
    }

    @Test
    public void demoTest() {

    	//Applied wait time
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //maximize window
        driver.manage().window().maximize();

        //open browser with desried URL
        driver.get("https://www.google.com");
        
        //basic assertion
        assertThat(driver.getTitle(), is("Google"));
        
    }

    @After
    public void tearDown() {
        //shut down the driver
        EnvironmentManager.shutDownDriver();
    }
}
