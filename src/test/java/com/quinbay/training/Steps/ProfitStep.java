package com.quinbay.training.Steps;
import com.quinbay.training.Actions.ProfitmanagementActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class ProfitStep {
    public WebDriver driver;
    ProfitmanagementActions action4;
    @Given("The user is on the tivo homepage")
    public void theUserIsOnTheTivoHomepage() {
        driver= LoginSteps.driver;
    }

    @When("The user clicks on profit management page and clicks add new")
    public void theUserClicksOnProfitManagementPageAndClicksAddNew() {
        action4=new ProfitmanagementActions(driver);
        action4.profiticon();
        action4.profit();
        action4.addnew();
        action4.choosetype();
    }

    @And("The user enters the required data to be edited and clicks activate and clicks save")
    public void theUserEntersTheRequiredDataToBeEditedAndClicksActivateAndClicksSave() {
        action4.amount();
        action4.typeamt("4000");
        action4.activate();
        action4.submit();
        action4.save();
    }

    @Then("The margin value should be updated")
    public void theMarginValueShouldBeUpdated() {
        action4.profitcheck();
        action4.profittoast();
        System.out.println("Margin value has been updated successfully");
        driver.quit();
    }
}
