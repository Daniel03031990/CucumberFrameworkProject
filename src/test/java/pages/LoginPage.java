package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class LoginPage extends CommonMethods {

    @FindBy(id="txtPassword")
    public WebElement passwordField;

    @FindBy(id="btnLogin")
    public WebElement LoginBt;

    @FindBy(id="spanMessage")
    public WebElement userspamMessage;

    @FindBy(id="welcome")
    public WebElement WelcomeDash;


    @FindBy(id="txtUsername")
    public WebElement userField;


    public LoginPage(){
        PageFactory.initElements(driver,this);
    }










}
