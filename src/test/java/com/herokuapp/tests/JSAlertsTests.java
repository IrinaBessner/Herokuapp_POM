package com.herokuapp.tests;

import com.herokuapp.pages.Homepage;
import com.herokuapp.pages.JSAlertsPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JSAlertsTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new Homepage(driver).selectJSAlerts();
    }

    @Test
    public void JSAlert(){
        new JSAlertsPage(driver).jsalert().acceptAlert().verifyResult("You successfully clicked an alert");
    }

    @Test
    public void JSAConfirm() {
        new JSAlertsPage(driver).jsConfirm("Cancel").verifyResult("Cancel");
    }
    @Test
    public void JSPromt(){
        new JSAlertsPage(driver).jsPromt("Prima!").verifyResult("Prima!");
    }



}

