package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class CheckboxesPage extends BasePage {
    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "[id='checkboxes'] input:nth-child(1)")
    WebElement checkbox1;
    @FindBy(css = "[id='checkboxes'] input:nth-child(2)")
    WebElement checkbox2;

    public CheckboxesPage selectCheckBox(String[] boxes) {
        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i].equals(" checkbox 1")) {
                click(checkbox1);
            }else if (boxes[i].equals(" checkbox 2")) {
                click(checkbox2);
            }
        }
        return this;
    }
//    public void verifyCheckbox(){
//        Assert.assertTrue();
//    }
}



