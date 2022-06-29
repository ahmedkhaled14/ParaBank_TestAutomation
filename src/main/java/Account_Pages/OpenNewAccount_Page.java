package Account_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccount_Page {
    private WebDriver driver;

    public OpenNewAccount_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By WhatTypeOfAccountDisplayed() {
        return By.xpath("//b[contains(.,'What type of Account would you like to open?')]");
    }

    private By SubmitOpenNewAccount() {
        return By.xpath("//input[@type='submit']");
    }

    /**
     *
     * @return new AccountOpen_Page
     */
    public AccountOpen_Page ClickOnOpenNewAccountSubmitButton() {
        ElementActions.click(driver, SubmitOpenNewAccount());
        return new AccountOpen_Page(driver);
    }

}
