package com.quinbay.training.Pages;
import io.cucumber.java.bs.A;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;

import javax.xml.ws.WebEndpoint;
import java.security.PublicKey;
public class Profitmanagement {

    WebDriver driver1;
    public Profitmanagement(WebDriver driver) {
        driver1 = driver;
    }
    @FindBy(xpath = "/html/body/div[1]/div[2]/nav/ul/li[3]/div/img")
    WebElement profiticon;

    @FindBy(xpath = "/html/body/div[1]/div[2]/nav/ul/li[3]/div/div/span")
    WebElement profit;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[2]/button/div")
    WebElement addnew;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[2]")
    WebElement choosetype;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[3]/div[2]/div/div[3]/ul/li[1]/button")
    WebElement amount;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[3]/div[3]/div/input")
    WebElement typeamt;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[5]/div/div/label")
    WebElement activate;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[2]/button[1]")
    WebElement submit;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[1]/div/div/div[1]/div[2]/button[2]")
    WebElement save;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[2]/span")
    WebElement profitcheck;

    @FindBy(xpath = "//*[@id=\\\"app\\\"]/div[3]/div[1]")
    WebElement profittoast;

    public String expected_toast="Margin setup edited successfully.";
    public String Profit_element="Profit Management";
    public void profiticon()
    {
        profiticon.click();
    }
    public void profit()
    {
        profit.click();
    }
    public void addnew()
    {
        addnew.click();
    }
    public void choosetype()
    {
        choosetype.click();
    }
    public void amount()
    {
        amount.click();
    }
    public void typeamt(String item)
    {
        typeamt.sendKeys(item);
    }
    public void activate()
    {
        activate.click();
    }
    public void submit()
    {
        submit.click();
    }
    public void save()
    {
        save.click();
    }
    public void profitcheck()
    {
        Assert.assertEquals(profitcheck.getText(),Profit_element);
    }
    public void profittoast()
    {
        Assert.assertEquals(profittoast.getText(),expected_toast);
    }
}