package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.CommonMethods;
import utils.ConfigReader;


import java.io.IOException;
import java.time.Duration;

public class LoginSteps extends CommonMethods {
    //LoginPage loginPage=new LoginPage();

    @Given("user is able to access HRMS application")
    public void user_is_bale_to_access_hrms_application() {
        driver=new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
    }


    @When("user only enters {string} or {string} name or both but incorrect")
    public void user_only_enters_or_name_or_both_but_incorrect(String login, String password) {
        sendText(login, loginPage.userField);
        sendText(password, loginPage.passwordField);

    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        waitForElementToBeClickable(loginPage.LoginBt);
    }
    @Then("user can see proper {string} message and user can correct their input" )
    public void user_can_see_proper_message(String error) {
        loginPage.userspamMessage.isDisplayed();
        loginPage.LoginBt.isEnabled();
        loginPage.passwordField.isEnabled();
        loginPage.userField.isEnabled();
    }
    @When("user enters correct credentials")
    public void user_enters_correct_credentials() throws IOException {
        sendText(ConfigReader.read("password"),loginPage.passwordField);
        sendText(ConfigReader.read("userName"),loginPage.userField);
    }




}
