package com.herokuapp.tests;

import com.herokuapp.pages.DropDownMenuPage;
import com.herokuapp.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownMenuPageTest extends TestBase {
    @BeforeMethod
    public void precondition() {
        new Homepage(driver).selectDropDown();
    }

    @Test
    public void DropDownListTest(){
        new DropDownMenuPage(driver).selectOption("Option 2").verifyResult("Option 2");

    }
}



