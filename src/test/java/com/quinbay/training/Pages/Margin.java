package com.quinbay.training.Pages;
import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class  Margin {

    WebDriver driver;

    public Margin(WebDriver webDriver) {
        driver = webDriver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[1]/nav/ul/li/a[3]")
    WebElement ClickMargin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div[1]/div/button[2]")
    WebElement ClickEdit;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[2]/input")
    WebElement MarginValue;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[1]/div[4]/div[1]/div[1]/div/div")
    WebElement ClickRadio;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[1]/div/div[1]/div/div[2]/div[2]/button[2]/div")
    WebElement ClickSave;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[1]/nav/ul/li/a[3]")
    WebElement ViewMargin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[1]")
    WebElement MarginToast;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[3]/div/div[2]/div[1]/div[1]/div[2]/div/span[2]")
    WebElement ActualMargin;

    public String MarginActualValue=": Rp 2.000";

    public void ClickMargin() {
        ClickMargin.click();
    }

    public void MarginValue() {
        MarginValue.clear();
        MarginValue.sendKeys("2000");
    }


    public void ClickSave() {
        ClickSave.click();
    }



    public void ViewMargin() {
        ViewMargin.click();
    }


    public void ClickRadio()  {
        ClickRadio.click();
    }

    public void ClickEdit()
    {
        ClickEdit.click();
    }
    public String ExpectedToast="Margin setup edited successfully.";
    public void MarginToast()
    {
        Assert.assertEquals(MarginToast.getText(),ExpectedToast);

    }
    public void ActualMargin()
    {
        Assert.assertEquals(ActualMargin.getText(),MarginActualValue);
    }

}
