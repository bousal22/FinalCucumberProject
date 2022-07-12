package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	public static WebDriver driver;
	
	public static void initDriver() {
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);;
		
		
	}
public void takeScreenshot(WebDriver driver) throws WebDriverException, IOException {
	TakesScreenshot ts = (TakesScreenshot)driver;
	ts.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ts.getScreenshotAs(OutputType.FILE), new File(System.getProperty("user.dir") + "/screenshotValidation/" +System.currentTimeMillis() + ".png") );
	
}
}
