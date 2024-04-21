package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends BasePage {
    public Homepage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[href='/javascript_alerts']")
    WebElement javascriptAlerts;
    public Homepage selectJSAlerts() {
        clickWithJS(javascriptAlerts, 0, 300);
        return new Homepage(driver);
    }

    @FindBy(css = "a[href='/windows']")
    WebElement multipleWindows;
    public Homepage selectMultipleWindows() {
        clickWithJS(multipleWindows, 0, 3);
        return new  Homepage(driver);
    }

    @FindBy(css = "a[href='/dropdown']")
    WebElement dropDown;
    public Homepage selectDropDown() {
        click(dropDown);
        return new Homepage(driver);
    }

    @FindBy(css="[href='/checkboxes'] ")
    WebElement checkboxes;
    public Homepage selectCheckboxes(){
        click(checkboxes);
        return new Homepage(driver);
    }

    @FindBy(css="[href='/upload']")
    WebElement fileUpload;
    public Homepage selectFileUpload(){
        click(fileUpload);
        return new Homepage(driver);
    }
    @FindBy(css = "[href='/drag_and_drop']")
    WebElement dragAndDrop;
    public Homepage selectDragAndDropPage() {
        click(dragAndDrop);
        return new Homepage(driver);
    }

    @FindBy(css = "[href='/broken_images']")
    WebElement brokenImages;
    public Homepage selectBrokenImages() {
        click(brokenImages);
        return new Homepage(driver);
    }
}
