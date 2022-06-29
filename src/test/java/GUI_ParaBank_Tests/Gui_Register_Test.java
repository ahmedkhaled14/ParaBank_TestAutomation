package GUI_ParaBank_Tests;

import Register_Pages.ParaBank_Home_Page;
import Register_Pages.ParaBank_SignIn_page;
import Utils.util;
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

public class Gui_Register_Test {
    private final JSONFileManager LoginTestData = new JSONFileManager(System.getProperty("LoginTestDataPath"));
    private final JSONFileManager RegisterTestData = new JSONFileManager(System.getProperty("RegisterTestDataPath"));
    private WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();
    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And Click On Register Link,And Add Valid Register Data, And Click On Register Button ,Then navigate to my account page")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Register")
    @Test
    public void Register() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .ClickOnRegisterLink()
                .ValidRegister(
                        RegisterTestData.getTestData("customer_firstName") + util.GenerateCurrentDateAndTime(),
                        RegisterTestData.getTestData("customer_lastName") + util.GenerateCurrentDateAndTime(),
                        RegisterTestData.getTestData("customer_address_street"),
                        RegisterTestData.getTestData("customer_address_city"),
                        RegisterTestData.getTestData("customer_address_state"),
                        Integer.parseInt(RegisterTestData.getTestData("customer_address_zipCode")),
                        Integer.parseInt(RegisterTestData.getTestData("customer_phoneNumber")),
                        Integer.parseInt(RegisterTestData.getTestData("customer_ssn")),
                        RegisterTestData.getTestData("customer_username"),
                        RegisterTestData.getTestData("customer_password"),
                        RegisterTestData.getTestData("repeatedPassword"))
                .ClickOnRegisterButton();

        Validations.assertThat()
                .element(driver, ParaBank_Home_Page.Welcome_afterRegister())
                .text()
                .contains("Welcome")
                .withCustomReportMessage("Verify that user is able to Register successfully in the ParaBank application after providing the valid Register Test Data. ")
                .perform();
        new ParaBank_Home_Page(driver)
                .ClickOnLogOut();
    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And type the valid username and password, Then navigate to my account page")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(description = "User Login", dependsOnMethods = "Register")
    public void UserLogin() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .Valid_login(
                        LoginTestData.getTestData("UserName"),
                        LoginTestData.getTestData("Password"));

        Validations.assertThat()
                .element(driver, ParaBank_Home_Page.Welcome_afterLogin())
                .text()
                .contains("Accounts Overview")
                .withCustomReportMessage("Verify that user is able to login successfully  in the ParaBank application after providing the valid username and password. ")
                .perform();
    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}
