package com.quinbay.training.Actions;


import com.quinbay.training.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPageActions {
    public LoginPage loginpage;
    public LoginPageActions(WebDriver driver) {
        loginpage = PageFactory.initElements(driver, LoginPage.class);
    }
    public void UserName(String s) {

        loginpage.UserName("tivo_superuser");
    }
    public void Password(String m)
    {
        loginpage.Password("tivo_superuser");
    }
    public void Password()
    {
        loginpage.Password();
    }
    public void checkTitle(){
        loginpage.checkTitle();
    }


}
