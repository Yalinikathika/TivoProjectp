package com.quinbay.training.Pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.quinbay.training.Pages.Liveproduct;

public class Voucher {

    WebDriver driver;

    public Voucher(WebDriver webDriver) {
        driver = webDriver;
    }

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/nav/ul/li[2]/div/img")
    WebElement inve;

    @FindBy(xpath = "//*[@id=\"app\"]/div[2]/nav/ul/li[2]/div/div[3]/div/span")
    WebElement vo;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div/div/label")
    WebElement type;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div/div/input")
    WebElement typeid;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/button")
    WebElement search;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[5]/div[2]/div[1]/button[1]")
    WebElement download;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[3]/div/div[1]/div[2]/button[2]")
    WebElement yes;

    @FindBy(xpath = "//*[@id=\"app\"]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[2]")
    WebElement drop;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[2]/div/div[3]/ul/li[1]/button")
    WebElement avai;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[3]/textarea")
    WebElement avaiclick;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[3]/textarea")
    WebElement typeavai;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[2]/div/div[1]/div[4]/button[1]")
    WebElement ddata;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[5]/div[2]/div[1]/button[2]")
    WebElement uploadvoucher;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div[2]/div[1]/div/div/div/div")
    WebElement voucherdrop;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div[2]/div[1]/div/div/div/div/div[3]/ul/li[1]/button")
    WebElement noexpiry;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[1]/div/div[2]")
    WebElement vouchertype;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[1]/div/div[3]/ul/li[3]/button")
    WebElement url;

    @FindBy(xpath = "/html/body/div[1]/div[3]/div[2]/div/div[4]/div[2]/div[2]/div/div/div[2]/div[1]/label")
    WebElement docupload;

    public void inve()
    {
        inve.click();
    }
    public void vo(){
        vo.click();
    }
    public void type()
    {
        type.click();
    }
    public void typeid(String item)
    {

        typeid.sendKeys(item);
    }
    public void search()
    {
        search.click();
    }
    public void download()
    {
        download.click();
    }
    public void yes()
    {
        yes.click();
    }
    public void drop()
    {
        drop.click();
    }
    public void avai()
    {
        avai.click();
    }
    public void avaiclick()
    {
        avaiclick.click();
    }
    public void typeavai(String item)
    {
        typeavai.sendKeys(item);
    }
    public void ddata()
    {
        ddata.click();
    }
    public void uploadvoucher()
    {
        uploadvoucher.click();
    }
    public void voucherdrop()
    {
        voucherdrop.click();
    }
    public void noexpiry()
    {noexpiry.click();
    }
    public void vouchertype()
    {
        vouchertype.click();
    }
    public void url()
    {
        url.click();
    }
    public void docupload()
    {
        docupload.click();
        //docupload.sendKeys("/Users/yalinikarthika/Downloads/upload_voucher_file.csv");
    }



}