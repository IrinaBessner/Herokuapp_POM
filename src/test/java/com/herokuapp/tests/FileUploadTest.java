package com.herokuapp.tests;

import com.herokuapp.pages.FileUploadPage;
import com.herokuapp.pages.Homepage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest extends TestBase{
    @BeforeMethod
    public void precondition() {
        new Homepage(driver).selectFileUpload();
    }
    @Test
    public void fileUploadTest(){
        new FileUploadPage(driver).uploadPage("C:/Tools/image.jpg").verifyTitleFile("File Uploaded!");
}
}
