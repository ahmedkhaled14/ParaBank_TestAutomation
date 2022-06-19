package GUI_ParaBank_Tests;

import Register_Pages.ParaBank_Home_Page;
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

public class Gui_Register_Test {
    private WebDriver driver;
    private final JSONFileManager LoginTestData = new JSONFileManager(System.getProperty("LoginTestDataPath"));

    @BeforeMethod
    public void beforeMethod() {
        driver = DriverFactory.getDriver();

    }

    @Description("Given the browser is open, When i navigate to ParaBank URl ,And type the valid username and password, Then navigate to my account page")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Login")
    @Test(description = "User Login")
    public void UserLogin() {
        new ParaBank_SignIn_page(driver)
                .navigateToURl()
                .Valid_login(LoginTestData.getTestData("UserName"),LoginTestData.getTestData("Password"));

        Validations.assertThat()
                .element(driver, ParaBank_Home_Page.Welcome())
                .text()
                .contains("Ahmed khaled")
                .withCustomReportMessage("Verify that user is able to login successfully  in the ParaBank application after providing the valid username and password. ")
                .perform();
    }

    @AfterMethod
    public void afterMethod() {
        BrowserActions.closeCurrentWindow(driver);
    }


}
