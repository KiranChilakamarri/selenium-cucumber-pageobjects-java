package pageobjects;
import helpers.Log;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver){
		super(driver);
	}

	@FindBy(how=How.PARTIAL_LINK_TEXT, using="My Vodafone")
	public static WebElement myVodaFoneLink;

	@FindBy(how=How.PARTIAL_LINK_TEXT, using="Login")
	public static WebElement loginButton;


	@FindBy(how=How.ID, using="myvfLoginOnlineId")
	public static WebElement loginEntryField;
	
	@FindBy(how=How.ID, using="myvfLoginPassword")
	public static WebElement passwordEntryField;
	
	@FindBy(how=How.ID, using="sign-in-button")
	public static WebElement signin_button;
	

	@FindBy(how=How.CSS, using="div.submitError")
	public static WebElement submit_error;
		
	}
		

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
