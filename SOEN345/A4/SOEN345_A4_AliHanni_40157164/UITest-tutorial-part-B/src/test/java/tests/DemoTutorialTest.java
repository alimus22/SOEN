package test.java.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import test.java.seleniumtutorial.EnvironmentManager;
import test.java.seleniumtutorial.RunEnvironment;

import java.util.List;
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

    @Test
    public void testcase2() {
        driver.get("https://www.google.ca/");
        driver.manage().window().setSize(new Dimension(1140, 993));
        driver.findElement(By.name("q")).sendKeys("arbitrary stuff");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        {
            List<WebElement> elements = driver.findElements(By.linkText("Images"));
            assert(elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.linkText("Shopping"));
            assert(elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.linkText("Videos"));
            assert(elements.size() > 0);
        }
        {
            List<WebElement> elements = driver.findElements(By.linkText("News"));
            assert(elements.size() > 0);
        }
    }
}
