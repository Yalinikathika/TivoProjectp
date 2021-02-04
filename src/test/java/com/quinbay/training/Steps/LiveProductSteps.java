package com.quinbay.training.Steps;
import com.quinbay.training.Actions.LoginPageActions;
import org.openqa.selenium.WebDriver;
import com.quinbay.training.Actions.LiveproductAction;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LiveProductSteps {
    WebDriver driver;

    public LiveproductAction action1;


    @Given("The user is in homepage")
    public void theUserIsInHomepage() {
        driver = LoginSteps.driver;
        action1 = new LiveproductAction(driver);
    }

    @When("The user click on catalogue management")
    public void theUserClickOnCatalogueManagement() {
        action1.ClickCatalogue();
    }


    @And("The user click on live product")
    public void theUserClickOnLiveproduct() {
        action1.ClickCatalogue1();
    }

    @When("The user clicks on live management")
    public void theUserClicksOnLivemanagement() {
        action1.ClickLiveProduct();
    }

    @And("The user click on event id")
    public void theUserClickOnEventid() {
        action1.EventId();
    }


    @Given("The User is in the event page")
    public void theUserIsInTheEventPage() {
    }

    @When("The user clicks searchable")
    public void theUserClicksSearchable() {

        action1.ClickSearchable();
    }

    @And("the user clicks yes")
    public void theUserClicksYes() {
        action1.ClickYesSearch();
    }

    @Then("The searchable should be changed")
    public void theSearchableShouldBeChanged() {
        //assertThat("Searchbox should be checked",action1.searchable2(),equalTo(true));
        System.out.println("Searchable is done");
    }

    @Given("The user is in event page")
    public void theUserIsInEventPage() {

    }

    @When("The user click edit")
    public void theUserClickEdit() {

        action1.ClickEdit();
    }

    @And("The user changes the description as {string} and clicks save")
    public void theUserChangesTheDescriptionAsAndClicksSave(String arg0) {

        action1.AddDescription(arg0);
        action1.ClickSave();
        action1.ViewDescription();
    }

    @Then("The toast should be displayed as {string}")
    public void theToastShouldBeDisplayedAs(String arg0) {
        action1.ActualToast();
        System.out.println(arg0);
    }

    @Then("The description should be added successfully")
    public void theDescriptionShouldBeAddedSuccessfully() {
        action1.UserDescription();
        driver.quit();
    }


}
