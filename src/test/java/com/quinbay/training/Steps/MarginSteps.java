package com.quinbay.training.Steps;

import com.quinbay.training.Actions.LiveproductAction;
import com.quinbay.training.Actions.MarginActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class MarginSteps {
    public WebDriver driver;
    LiveproductAction action1;
    public MarginActions action2;

    @Given("The user is on tivo homepage and user want to edit margin")
    public void theUserIsOnTivoHomepageAndUserWantToEditMargin() {

        driver= LoginSteps.driver;

    }


    @And("the user clicks on margin and updates margin")
    public void theUserClicksOnMarginAndUpdatesMargin() {
        action2=new MarginActions(driver);
        action2.ClickEdit();
        action2.ClickMargin();

    }
    @And("The user enters margin value")
    public void theUserEntersMarginValue() {
        action2.ClickRadio();
        action2.MarginValue();
    }
    @And("the user saves the margin")
    public void theUserSavesTheMargin() {

        action2.ClickSave();
        action2.ViewMargin();
    }


    @Then("the toast message should appear")
    public void theToastMessageShouldAppear() {
       action2.MarginToast();

    }

    @And("the margin value gets updated")
    public void theMarginValueGetsUpdated() {
        action2.ActualMargin();
        action2.marginrp();
        driver.quit();
    }



}
