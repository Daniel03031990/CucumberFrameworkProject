package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utils.CommonMethods;

public class DashBoardSteps extends CommonMethods {
    @When("user clicks on PIM button")
    public void user_clicks_on_pim_button() {
        waitForElementToBeClickable(addEmployeePage.pimButton);
    }
    @When("user clicks on AddEmploee")
    public void user_clicks_on_add_emploee() {
        waitForElementToBeClickable(addEmployeePage.addEmployBt);
    }
    @Then("user can see AddEmployee option")
    public void user_can_see_add_employee_option() {
        addEmployeePage.saveBT.isEnabled();
        addEmployeePage.saveBT.isDisplayed();
    }
}
