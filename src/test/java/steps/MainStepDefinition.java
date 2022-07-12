package steps;

import java.io.IOException;

import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.MainPage;
import pages.TestBase;

public class MainStepDefinition extends TestBase {
	
	MainPage mainPageobj;
	
//	Given "Set Skyblue Background" button exists
	@Given ("^Set Skyblue Background button exists$")
    public void set_skyblue_background_button_exists() throws InterruptedException	{
		initDriver();
		driver.get("http://techfios.com/test/102/");
		Thread.sleep(2000);
	}
//	When I click on the button;
	
	@When ("^I click on the button$")
	public void when_i_click_on_the_button() throws InterruptedException {
		MainPage mainPageobj = PageFactory.initElements(driver, MainPage.class);
		mainPageobj.validateSkyblueButton();
	
	}
	@Then ("^the background color will change to sky blue$")
	public void the_background_color_will_change_to_sky_blue() throws WebDriverException, IOException {
		takeScreenshot(driver);
	}
	@Given ("^Set SkyWhite Background button exists$")
	public void set_skyWhite_background_button_exists() {
		initDriver();
		driver.get("http://techfios.com/test/102/");
		
	}
	@When ("^I Click on the button$")
	public void when_i_Click_on_the_button() throws InterruptedException {
		MainPage mainPageobj = PageFactory.initElements(driver, MainPage.class);
		mainPageobj.validateSkyblueButton();
		Thread.sleep(2000);
		mainPageobj.validateSkywhiteButton();
	}
	@Then ("^the background color will change to white$")
	public void the_background_color_will_change_to_white() throws WebDriverException, IOException {
		takeScreenshot(driver);
		
		
		
	}
		
	}

