package com.quinbay.training.Pages;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver webDriver){
        driver=webDriver;
    }
    @FindBy(xpath ="//*[@id=\"username\"]")
    WebElement UserName;

    @FindBy(xpath ="//*[@id=\"password\"]")
    WebElement Password;

    @FindBy(xpath ="//*[@id=\"fm1\"]/div[2]/input[1]")
    WebElement Submit;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/h2")
    WebElement checkTitle;

    public void UserName(String item) {
        UserName.sendKeys(item);
    }
    public void Password(String item) {
        Password.sendKeys(item);
    }
    public void Password()
    {
        Submit.click();
    }
    public String t="Contents";
    public void checkTitle()
    {
        Assert.assertEquals(checkTitle.getText(),t);
    }


}
