package com.herokuapp.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class NewTabPage extends BasePage{

    public NewTabPage(WebDriver driver) {
        super(driver);
    }

@FindBy(css = "[href='/windows/new']")
WebElement clickHereLink;
    public NewTabPage switchToNextTab(int index){
        click(clickHereLink);
        List<String> tab= new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tab.get(index));
        return this;
    }

@FindBy(css = "h3")
WebElement newTab;
    public BasePage verifyNewTabMessage(String text) {
        Assert.assertTrue((shouldHaveText(newTab,text,10)));
        return this;
    }
    }


