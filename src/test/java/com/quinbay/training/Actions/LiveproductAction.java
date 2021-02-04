package com.quinbay.training.Actions;


import com.quinbay.training.Pages.Liveproduct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LiveproductAction {
    public Liveproduct liveproduct1;

    public LiveproductAction(WebDriver driver) {
        liveproduct1 = PageFactory.initElements(driver, Liveproduct.class);
    }

    public void ClickCatalogue() {
        liveproduct1.ClickCatalogue();
    }

    public void ClickCatalogue1() {
        liveproduct1.ClickCatalogue1();
    }

    public void ClickLiveProduct() {
        liveproduct1.ClickLiveProduct();
    }

    public void EventId() {
        liveproduct1.EventId();
    }

    public void ClickSearchable() {
        liveproduct1.ClickSearchable();
    }

    public void ClickYesSearch() {
        liveproduct1.ClickYesSearch();
    }

    public void ClickEdit() {
        liveproduct1.ClickEdit();
    }

    public void AddDescription(String i) {
        liveproduct1.AddDescription(i);
    }

    public void ClickSave() {
        liveproduct1.ClickSave();
    }

    public void ViewDescription() {
        liveproduct1.ViewDescription();
    }

    public boolean CheckPage() {
        return liveproduct1.CheckPage();
    }

    public boolean searchable2() {
        return liveproduct1.searchanble2();
    }

    public void ActualToast() {
        liveproduct1.ActualToast();
    }

    public void UserDescription() {
        liveproduct1.UserDescription();
    }

}