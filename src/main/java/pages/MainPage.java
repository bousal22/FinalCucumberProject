package pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MainPage {
	WebDriver driver;

	public MainPage(WebDriver driver) {

		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement SkyblueButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[2]")
	WebElement SkywhiteButton;

	// Methods to interact with the elements
	public void validateSkyblueButton() {
		SkyblueButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void validateSkywhiteButton() {
		SkywhiteButton.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	
	
		public void validatebackground(){
			 
			{
			   
			
		}
	
		}
	
		
	}


