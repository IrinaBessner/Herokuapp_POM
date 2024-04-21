package com.herokuapp.tests;

import com.herokuapp.pages.CheckboxesPage;
import com.herokuapp.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckboxesTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new Homepage(driver).selectCheckboxes();
    }
    @Test
    public void checkBoxesTest(){
        new CheckboxesPage(driver).selectCheckBox(new String[]{ "checkbox 1", "checkbox 2"});
    }
}
