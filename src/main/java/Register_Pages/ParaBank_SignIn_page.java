package Register_Pages;

import com.shaft.gui.browser.BrowserActions;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank_SignIn_page {
    private final String URL = System.getProperty("URL") ;
    private WebDriver driver;

    public ParaBank_SignIn_page(WebDriver driver) {
        this.driver = driver;
    }

    private By UserName() {
        return By.name("username");
    }

    private By Password() {
        return By.name("password");
    }

    private By login() {
        return By.xpath("//input[@type='submit']");
    }

    private By Register_Button() {
        return By.linkText("Register");
    }

    /**
     *
     * @return navigate to ParaBank URL
     */
    public ParaBank_SignIn_page navigateToURl() {
        BrowserActions.navigateToURL(driver, URL);
        return this;
    }

    /**
     *
     * @param UserName String Value From this path ==> src/test/resources/testDataFiles/Login.json
     * @param Password String Value From this path ==> src/test/resources/testDataFiles/Login.json
     * @return Valid Login With Valid Test Data
     */
    public ParaBank_Home_Page Valid_login(String UserName, String Password) {
        ElementActions.type(driver, UserName(), UserName);
        ElementActions.type(driver, Password(), Password);
        ElementActions.click(driver, login());
        return new ParaBank_Home_Page(driver);
    }

    /**
     *
     * @return new ParaBank_Register_Page
     */
    public ParaBank_Register_Page ClickOnRegisterLink() {
        ElementActions.click(driver, Register_Button());
        return new ParaBank_Register_Page(driver);
    }


}
