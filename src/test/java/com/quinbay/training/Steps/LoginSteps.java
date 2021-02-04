package com.quinbay.training.Steps;

import com.quinbay.training.Actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static WebDriver driver;
    public LoginPageActions actions;

    @Given("User enters into Tivo login page")
    public void userEntersIntoTivoLoginPage() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/driver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://authenticationv2-uata.gdn-app.com/cas/login?service=http://tivocenter-qa1-gcp.gdn-app.com/auth/verify");
        actions = new LoginPageActions(driver);


    }


    @When("User enter username {string}")
    public void userEnterUsername(String arg0) {
        actions.UserName(arg0);
    }

    @And("User enter the password {string}")
    public void userEnterThePassword(String arg0) {

        actions.Password((arg0));
    }

    @And("User click login")
    public void userClickLogin() {

        actions.Password();
    }


    @Then("The user should be logged into the portal")
    public void theUserShouldBeLoggedIntoThePortal() {
        actions.checkTitle();
        System.out.print("LOGIN SUCCESSFUL");
    }
}
