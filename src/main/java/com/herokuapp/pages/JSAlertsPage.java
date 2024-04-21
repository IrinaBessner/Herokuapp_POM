package com.herokuapp.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;


public class JSAlertsPage extends BasePage {

    public JSAlertsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "button[onclick='jsAlert()']")
    WebElement jsAlert;

    public JSAlertsPage jsalert() {
        click(jsAlert);
        return this;
    }
    public JSAlertsPage acceptAlert(){
        Alert alert= driver.switchTo().alert();
        alert.accept();
        return this;
    }

    @FindBy(css = "button[onclick='jsConfirm()']")
    WebElement confirmButton;

    public JSAlertsPage jsConfirm(String confirm) {
        click(confirmButton);
        if (confirm != null && confirm.equals("OK")) {
            driver.switchTo().alert().accept();
        } else if (confirm != null && confirm.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(css = "button[onclick='jsPrompt()']")
    WebElement promtButton;

    public JSAlertsPage jsPromt(String message) {
        click(promtButton);
        if (message!=null){
            driver.switchTo().alert().sendKeys(message);
            driver.switchTo().alert().accept();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;

    public JSAlertsPage verifyResult(String text) {
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }


}
