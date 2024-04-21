package com.herokuapp.tests;

import com.herokuapp.pages.BrokenImagesPage;
import com.herokuapp.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrokenImagesTests extends TestBase {

    @BeforeMethod
    public void precondition() {
        new Homepage(driver).selectBrokenImages();
    }

    @Test
    public void
     checkBrokenImagesTest() {
        new BrokenImagesPage(driver).checkBrokenImages();
    }
}

