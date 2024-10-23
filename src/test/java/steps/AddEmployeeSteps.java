package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.commons.collections4.functors.IfClosure;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {

    @Then("user is navigated to dashboard page")
    public void user_is_navigated_to_dashboard_page() {
        Assert.assertTrue(addEmployeePage.welcomeTX.isDisplayed());
    }
    @When("user adds Employee firsname, middlename and lastname")
    public void user_adds_employee_firsname_middlename_and_lastname() throws IOException {
        List<Map<String, String>> newEmployees= ExcelReader.read();
        for (Map<String, String> employee:newEmployees){
            addEmployeePage.firstNameLocator.sendKeys(employee.get("firstName"));
            addEmployeePage.middleNameLocator.sendKeys(employee.get("middleName"));
            addEmployeePage.lastNameLocator.sendKeys(employee.get("lastName"));

        }

    }
    @When("user see id was generated automatically")
    public void user_see_id_was_generated_automatically() {
        Assert.assertNotNull(addEmployeePage.idField);
    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        waitForElementToBeClickable(addEmployeePage.saveBT);
    }
    @Then("user is able to add new employee")
    public void user_is_able_to_add_new_employee() {
        Assert.assertTrue(addEmployeePage.isAdded.isDisplayed());
    }
    @When("user clear an adds id number")
    public void user_clear_an_adds_id_number() {
       String uniqId=addEmployeePage.idField.getText();
       addEmployeePage.idField.sendKeys(uniqId);
    }
    @Given("user adds Employee {string}, {string} and {string}")
    public void user_adds_employee_and(String firstname, String middlename, String lastname) {
      sendText(firstname, addEmployeePage.firstNameLocator);
      sendText(middlename, addEmployeePage.middleNameLocator);
      sendText(lastname, addEmployeePage.lastNameLocator);

    }
    @Then("user see can see error message in missing field")
    public void user_see_can_see_error_message_in_missing_field() {
       boolean isTrue=addEmployeePage.firstNameLocator.isDisplayed() || addEmployeePage.lastSpam.isDisplayed();
       Assert.assertTrue(isTrue);
        }
    @When("user adds existing ID number {string}")
    public void user_adds_existing_id_number(String existingID) {
        sendText(existingID, addEmployeePage.idField);
    }
    @Then("user can see existing id error")
    public void user_can_see_existing_id_error() {
        addEmployeePage.iderror.isDisplayed();
    }
    }








    

