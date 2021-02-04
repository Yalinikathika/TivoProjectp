package com.quinbay.training.Actions;


import com.quinbay.training.Pages.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import static org.openqa.selenium.support.PageFactory.*;

public class VoucherActions {
    public Voucher voucher1;

    public VoucherActions(WebDriver driver) {
        voucher1 = initElements(driver, Voucher.class);
    }

    public void inve() {
        voucher1.inve();
    }
    public void vo()
    {
        voucher1.vo();
    }
    public void type()
    {
        voucher1.type();
    }
    public void typeid(String item)
    {

        voucher1.typeid("SIT-1000001");
    }
    public void search()
    {
        voucher1.search();
    }
    public void download()
    {
        voucher1.download();
    }
    public void yes()
    {
        voucher1.yes();
    }
    public void drop()
    {
        voucher1.drop();
    }
    public void avai()
    {
        voucher1.avai();
    }
    public void avaiclick()
    {
        voucher1.avaiclick();
    }
    public void typeavai(String item)
    {
        voucher1.typeavai("BAT-1000102");
    }
    public void ddata()
    {
        voucher1.ddata();
    }
    public void uploadvoucher()
    {
        voucher1.uploadvoucher();
    }
    public void voucherdrop()
    {
        voucher1.voucherdrop();
    }
    public void noexpiry()
    {
        voucher1.noexpiry();
    }
    public void vouchertype(){
        voucher1.vouchertype();
    }
    public void url(){
        voucher1.url();
    }
    public void docupload()
    {
        voucher1.docupload();
    }


}
