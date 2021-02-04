package com.quinbay.training.Actions;
import com.quinbay.training.Pages.Margin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MarginActions {
    public Margin margin1;
    public MarginActions(WebDriver driver) {
        margin1 = PageFactory.initElements(driver, Margin.class);
    }

    public void ClickMargin()
    {
        margin1.ClickMargin();
    }
    public void MarginValue()
    {
        margin1.MarginValue();
    }

    public void ClickSave()
    {
        margin1.ClickSave();
    }

    public void ViewMargin()
    {
        margin1.ViewMargin();
    }
    public void ClickRadio()
    {
        margin1.ClickRadio();
    }

    public void ClickEdit()
    {
        margin1.ClickEdit();
    }
    public void MarginToast(){
        margin1.MarginToast();
    }
    public void ActualMargin(){
        margin1.ActualMargin();
    }
    public void marginrp()
    {
        margin1.ActualMargin();
    }
}
