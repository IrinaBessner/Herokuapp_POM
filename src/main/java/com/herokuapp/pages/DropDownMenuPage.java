package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class DropDownMenuPage extends BasePage{
    public DropDownMenuPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="dropdown")
    WebElement dropdown;
    public DropDownMenuPage selectOption(String option) {
        click(dropdown);

        Select select=new Select(dropdown);
        select.selectByVisibleText(option);

        List<WebElement> options=select.getOptions();
        System.out.println(select.getFirstSelectedOption().getText() + " is second option");
        System.out.println("-------------");
        for (int i = 0; i < options.size(); i++) {
            System.out.println(options.get(i).getText());
        }
        return this;
    }
@FindBy(id="dropdown")
    WebElement result;
    public DropDownMenuPage verifyResult(String text){
        Assert.assertTrue(result.getText().contains(text));
        return this;
    }

}
