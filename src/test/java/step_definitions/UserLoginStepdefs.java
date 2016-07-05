package step_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.LoginPage;

import static org.testng.AssertJUnit.assertEquals;

public class UserLoginStepdefs {

    private static Logger Log = Logger.getLogger(helpers.Log.class.getName());
    public WebDriver driver;
    Hooks hook = new Hooks();

    public UserLoginStepdefs()
    {
        driver = Hooks.driver;
    }
    @Given("^I launch Vodafone website$")
    public void iLaunchVodafoneWebsite() throws Throwable {
        hook.getDriverAndURL();
        Log.info("Successfully loaded application on to browser");
    }

    @When("^I click on my vodafone link$")
    public void iClickOnMyVodafoneLink() throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.myVodaFoneLink.click();
    }

    @Then("^I should see the url (.*)$")
    public void iShouldSeeTheUrlUrl(String url) throws Throwable {
        assertEquals("Use My Vodafone for easy access to your account and settings - Vodafone NZ",driver.getTitle());
        assertEquals(url,driver.getCurrentUrl());
    }

    @When("^I login as a invalid user with (.*) and (.*) and click on login button$")
    public void iLoginAsAInvalidUserWithUsernameAndPasswordAndClickOnLoginButton(String username, String password) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, LoginPage.class);
        LoginPage.myVodaFoneLink.click();
        LoginPage.loginButton.click();
        LoginPage.loginEntryField.sendKeys(username);
        LoginPage.passwordEntryField.sendKeys(password);
        LoginPage.signin_button.click();
    }

    @Then("^I should see error message below the username field as (.*)$")
    public void iShouldSeeErrorMessageBelowTheUsernameFieldAsErrorMessage(String errorMessage) throws Throwable {
        driver = Hooks.driver;
        PageFactory.initElements(driver, LoginPage.class);
        assertEquals(errorMessage,LoginPage.submit_error.getText().toString());
    }


}
