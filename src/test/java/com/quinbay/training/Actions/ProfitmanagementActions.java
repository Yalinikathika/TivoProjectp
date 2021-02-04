package com.quinbay.training.Actions;
import com.quinbay.training.Pages.Liveproduct;
import com.quinbay.training.Pages.Profitmanagement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
public class ProfitmanagementActions {
    public Profitmanagement profitmanagement;

    public ProfitmanagementActions(WebDriver driver) {
        profitmanagement = PageFactory.initElements(driver, Profitmanagement.class);
    }
    public void profiticon()
    {
        profitmanagement.profiticon();
    }
    public void profit()
    {
        profitmanagement.profit();
    }
    public void addnew()
    {
        profitmanagement.addnew();

    }
    public void choosetype()
    {
        profitmanagement.choosetype();
    }
    public void amount()
    {
    profitmanagement.amount();}
    public void typeamt(String item)
    {
        profitmanagement.typeamt("4000");
    }
    public void activate()
    {
        profitmanagement.activate();
    }
    public void submit()
    {
        profitmanagement.submit();
    }
    public void save()
    {
        profitmanagement.save();
    }
    public void profitcheck(){
        profitmanagement.profitcheck();
    }
    public void profittoast(){
        profitmanagement.profittoast();
    }
}
