package com.quinbay.training.Actions;

import com.quinbay.training.Pages.Schedule;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ScheduleActions {
    public Schedule schedule;

    public ScheduleActions(WebDriver driver) {
        schedule = PageFactory.initElements(driver, Schedule.class);
    }

    public void ClickSettings() {
        schedule.ClickSettings();
    }

    public void EditDescription() {
        schedule.EditDescription();
    }

    public void AddDescription(String item) {

        schedule.AddDescription("NEW PROJECT");
    }

    public void SaveInfo() {
        schedule.SaveInfo();
    }

    public void ViewTerms() {
        schedule.ViewTerms();
    }

    public void CheckSchedulePage() {
        schedule.CheckSchedulePage();
    }

    public void ExpectedToast() {
        schedule.ExpectedToast();
    }
}









