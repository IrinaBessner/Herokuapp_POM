package com.herokuapp.tests;

import com.herokuapp.pages.Homepage;
import com.herokuapp.pages.NewTabPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewTabTest extends TestBase{
    @BeforeMethod
    public void precondition(){
        new Homepage(driver).selectMultipleWindows();

    }

    @Test
    public void newTabTest(){
        new NewTabPage(driver).switchToNextTab(1)
                .verifyNewTabMessage("New Window");
    }
}
