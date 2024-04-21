package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class FileUploadPage extends BasePage{
    public FileUploadPage(WebDriver driver) {
        super(driver);
    }
@FindBy(id="file-upload")
    WebElement chooseFile;
    @FindBy(id="file-submit")
    WebElement submitFileButton;

    public FileUploadPage uploadPage(String path){
        chooseFile.sendKeys(path);
        click(submitFileButton);
        return this;
    }
    @FindBy(id="content")
    WebElement uploadedFile;
    public void verifyTitleFile(String title){
        Assert.assertTrue(shouldHaveText(uploadedFile,title,15));
    }

}
