package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="menu_pim_viewPimModule")
   public WebElement pimButton;

    @FindBy(id="menu_pim_addEmployee")
    public WebElement addEmployBt;

    @FindBy(id="firstName")
    public WebElement firstNameLocator;

    @FindBy(id="middleName")
    public WebElement middleNameLocator;

    @FindBy(id="lastName")
    public WebElement lastNameLocator;

    @FindBy(id="employeeId")
    public WebElement idField;

    public boolean fieldID(){
     addEmployeePage.idField.getText().isEmpty();
     return false;
    }
    @FindBy(id="btnSave")
    public WebElement saveBT;

    @FindBy(id="personal_txtNICNo")
    public WebElement IsAddes;

    @FindBy(id="welcome")
    public WebElement welcomeTX;

    @FindBy(id="empPic")
    public WebElement isAdded;

    @FindBy(xpath = "//span[@for='lastName']")
    public WebElement lastSpam;

 @FindBy(xpath = "//span[@for='firstName']")
 public WebElement firstSpam;

 @FindBy(xpath="//div[@class='message warning fadable']")
 public WebElement iderror;



    public AddEmployeePage(){
        PageFactory.initElements(driver,this);
    }

}
