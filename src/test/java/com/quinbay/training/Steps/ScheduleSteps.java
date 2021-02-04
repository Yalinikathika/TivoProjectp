package com.quinbay.training.Steps;

import com.quinbay.training.Actions.LiveproductAction;
import com.quinbay.training.Actions.ScheduleActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class ScheduleSteps {
    public WebDriver driver;
    public ScheduleActions action5;
    public LiveproductAction action1;
    //String ScheduleToast="Additional terms & conditions edited successfully";


    @Given("The user is in homepage and navigates to schedule page")
    public void theUserIsInHomepageAndNavigatesToSchedulePage() {
        driver = LoginSteps.driver;


    }

    @When("The user clicks edit the option")
    public void theUserClicksEditTheOption() {
        action5 = new ScheduleActions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        action5.ClickSettings();
        action5.EditDescription();


    }

    @And("The user changes the description and click save")
    public void theUserChangesTheDescriptionAndClickSave() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        action5.AddDescription("NEW PROJECT");
        action5.SaveInfo();

    }

    @Then("The description is saved")
    public void theDescriptionIsSaved() {
        action5.CheckSchedulePage();
        action5.ExpectedToast();
        System.out.println("Description changed successfully");
        driver.quit();
    }
}
