package com.quinbay.training.Pages;

import io.cucumber.java.bs.A;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.quinbay.training.Pages.Liveproduct;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class Liveproduct {

    WebDriver driver1;

    public Liveproduct(WebDriver driver) {
        driver1 = driver;
    }


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/nav/ul/li[1]/div/img")
    WebElement ClickCatalogue;


    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/nav/ul/li[1]/div/div[2]/div/span")
    WebElement ClickLiveProduct;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[4]/div/table/tbody/tr[1]/td[1]/span")
    WebElement EventId;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/nav/ul/li[1]/div/div[1]/span")
    WebElement ClickCatalogue1;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[2]/div[3]/div[1]/label/span")
    WebElement ClickSearchable;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[1]/div/div[1]/div[2]/button[2]/div")
    WebElement ClickYesSearch;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div[1]/div/button[2]")
    WebElement ClickEdit;

    @FindBy(xpath = "//*[@id=\"eventTextEditor\"]/div[1]")
    WebElement AddDescription;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div/div[4]/button[2]/div")
    WebElement ClickSave;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[2]/div[3]/p")
    WebElement check;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[2]/div/div[2]/div[3]/p")
    WebElement CheckDescription;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[1]/nav/ul/li/a[2]")
    WebElement ViewDescription;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div[2]/span[2]")
    WebElement CheckPage;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[1]")
    WebElement ActualToast;

    public String ExpectedToast = "Additional description edited successfully";
    public String UserDescription = "NEW PROJECT";

    public void ClickCatalogue() {
        ClickCatalogue.click();
    }

    public void ClickCatalogue1() {
        ClickCatalogue1.click();
    }

    public void ClickLiveProduct() {
        ClickLiveProduct.click();
    }

    public void EventId() {
        EventId.click();
    }

    public void ClickSearchable() {

        if (!ClickSearchable.isSelected())
            ClickSearchable.click();
    }

    public void ClickYesSearch() {
        ClickYesSearch.click();
    }

    public void ClickEdit() {
        ClickEdit.click();
    }

    public void AddDescription(String m) {
        AddDescription.clear();
        AddDescription.sendKeys(m);
    }

    public void ClickSave() {
        ClickSave.click();
    }


    public String rt = "Event (P-1003342)";

    public void ViewDescription() {

        ViewDescription.click();
    }

    public boolean CheckPage() {
        boolean status = false;
        if (rt.equals(CheckPage.getText())) {
            status = true;
        }
        return status;
    }

    public boolean searchanble2() {
        boolean status = false;
        if (ClickSearchable.isSelected())
            status = true;
        return status;

    }

    public void ActualToast() {
        //boolean status =false;
        Assert.assertEquals(ActualToast.getText(), (ExpectedToast));
    }

    public void UserDescription() {
        Assert.assertEquals(UserDescription, CheckDescription.getText());
    }

}