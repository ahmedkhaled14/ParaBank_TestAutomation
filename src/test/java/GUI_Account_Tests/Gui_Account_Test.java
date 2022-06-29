package GUI_Account_Tests;

import Account_Pages.AccountOpen_Page;
import Account_Pages.AccountOverView_Page;
import Account_Pages.OpenNewAccount_Page;
import Register_Pages.ParaBank_SignIn_page;
import com.shaft.driver.DriverFactory;
import com.shaft.gui.browser.BrowserActions;
import com.shaft.tools.io.JSONFileManager;
import com.shaft.validation.Validations;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Gui_Account_Test {
    private final JSONFileManager LoginTestData = new JSONFileManager(System.getProperty("LoginTestDataPath"));
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And type the valid username and password, And navigate to my account page ,And Click on Open New Account, Then Verify that field What type of Account would you like to open? is displayed ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Open New Account")
    @Test(description = "Open New Account")
    public void OpenNewAccount() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .Valid_login(LoginTestData.getTestData("UserName"), LoginTestData.getTestData("Password"))
                .ClickOnOpenNewAccount();

        Validations.assertThat()
                .element(driver, OpenNewAccount_Page.WhatTypeOfAccountDisplayed())
                .text()
                .contains("What type of Account would you like to open?")
                .withCustomReportMessage("Verify that field What type of Account would you like to open? is displayed ")
                .perform();
    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And type the valid username and password, And navigate to my account page ,And Click on Open New Account,And Click On Open New Account Submit Button, Then Verify that Account Overview page is displayed. ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Open New Account")
    @Test(description = "Click On Open New Account Button")
    public void OpenNewAccountButton() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .Valid_login(LoginTestData.getTestData("UserName"), LoginTestData.getTestData("Password"))
                .ClickOnOpenNewAccount()
                .ClickOnOpenNewAccountSubmitButton();

        Validations.assertThat()
                .element(driver, AccountOpen_Page.AccountOpenedDisplayed())
                .text()
                .contains("Account Opened!")
                .withCustomReportMessage("Verify that Account Overview page is displayed.")
                .perform();
    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And type the valid username and password, And navigate to my account page ,And Click on Open New Account,And Click On Open New Account Submit Button,And Click On Accounts OverView, Then Verify that User is able to view the Account Overview page. ")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Open New Account")
    @Test(description = "Account OverView")
    public void AccountOverView() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .Valid_login(LoginTestData.getTestData("UserName"), LoginTestData.getTestData("Password"))
                .ClickOnOpenNewAccount()
                .ClickOnOpenNewAccountSubmitButton()
                .ClickOnAccountsOverView();

        Validations.assertThat()
                .element(driver, AccountOverView_Page.AccountOverViewDisplayedLocator())
                .text()
                .contains("Accounts Overview")
                .withCustomReportMessage("Verify that User is able to view the Account Overview page.")
                .perform();

    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }

}
