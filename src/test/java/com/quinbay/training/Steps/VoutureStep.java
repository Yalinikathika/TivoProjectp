package com.quinbay.training.Steps;

import com.quinbay.training.Actions.VoucherActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class VoutureStep {
    public WebDriver driver;
    VoucherActions action3;

    @Given("The user enters into the voucher managemnet page")
    public void theUserEntersIntoTheVoucherManagemnetPage() {
        driver= LoginSteps.driver;

    }

    @When("The user clicks on inventory management and clicks vouture")
    public void theUserClicksOnInventoryManagementAndClicksVouture() {
        action3=new VoucherActions(driver);
        action3.inve();
        action3.vo();
    }
    @And("The user needs to enter the id and click search")
    public void theUserNeedsToEnterTheIdAndClickSearch() {
        action3.type();
        action3.typeid("SIT-1000001");
        action3.search();
        action3.download();
        action3.yes();
    }

    @And("The user clicks the drop down and chooses value,types the batchid and then downloads the data")
    public void theUserClicksTheDropDownAndChoosesValueTypesTheBatchidAndThenDownloadsTheData() {
        action3.drop();
        action3.avai();
        action3.avaiclick();
        action3.typeavai("BAT-1000102");
        action3.ddata();
    }

    @Then("the user should be able to download the data")
    public void theUserShouldBeAbleToDownloadTheData() {System.out.println("\nThe voucher data is downloaded");
    }

    @When("The user clicks on inventory management and clicks vouture and enter the id and click search")
    public void theUserClicksOnInventoryManagementAndClicksVoutureAndEnterTheIdAndClickSearch() {
        action3=new VoucherActions(driver);
        action3.inve();
        action3.vo();
        action3.type();
        action3.typeid("SIT-1000001");
        action3.search();
    }

    @And("The user clicks upload  data and clicks save")
    public void theUserClicksUploadDataAndClicksSave() {
        action3=new VoucherActions(driver);
        action3.uploadvoucher();
        action3.voucherdrop();
        action3.noexpiry();
        action3.vouchertype();
        action3.url();
        //action3.uploadvoucher();

        action3.docupload();
    }

    @Then("Then user should be able to upload the data")
    public void thenUserShouldBeAbleToUploadTheData() {
        System.out.println("Document uploaded successfully");
        driver.quit();
    }
}
