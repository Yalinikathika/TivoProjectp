package com.quinbay.training.Pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.quinbay.training.Pages.Schedule;
import org.openqa.selenium.WebDriver;

public class Schedule {
    WebDriver driver;

    public Schedule(WebDriver webDriver) {
        driver = webDriver;
    }

    public String CheckSchedulePage = "Schedule (25837)";
    public String ExpectedToast = "Additional terms & conditions edited successfully";
    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[5]/div/table/tbody/tr/td[6]/div/button")
    WebElement ClickSettings;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[5]/div/table/tbody/tr/td[6]/div/div/span[2]")
    WebElement EditDescription;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[3]/div[2]/div[1]")
    WebElement AddDescription;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/button[2]")
    WebElement SaveInfo;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[3]/div/div[1]/nav/ul/li/a[2]")
    WebElement ViewTerms;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[1]/span")
    WebElement CheckActualSchedule;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[1]")
    WebElement ActualToast;

    public void ClickSettings() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ClickSettings.click();
    }

    public void EditDescription() {
        EditDescription.click();
    }

    public void AddDescription(String item) {
        AddDescription.clear();
        AddDescription.sendKeys(item);
    }

    public void SaveInfo() {
        SaveInfo.click();
    }

    public void ViewTerms() {
        ViewTerms.click();
    }

    public void CheckSchedulePage() {
        //System.out.println(CheckActualSchedule.getText());
        Assert.assertEquals(CheckSchedulePage, CheckActualSchedule.getText());
    }

    public void ExpectedToast() {
        Assert.assertEquals(ActualToast.getText(), ExpectedToast);
    }
}





