package Register_Pages;

import Account_Pages.OpenNewAccount_Page;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank_Home_Page {
    WebDriver driver;

    public ParaBank_Home_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By Welcome_afterLogin() {
        return By.xpath("//h1[contains(.,'Accounts Overview')]");
    }

    public static By Welcome_afterRegister() {
        return By.xpath("//h1[@class='title']");
    }

    private By logOut() {
        return By.linkText("Log Out");
    }

    private By OpenNewAccount() {
        return By.xpath("//a[contains(.,'Open New Account')]");
    }

    /**
     *
     * @return new OpenNewAccount Page
     */
    public OpenNewAccount_Page ClickOnOpenNewAccount() {
        ElementActions.click(driver, OpenNewAccount());
        return new OpenNewAccount_Page(driver);
    }

    /**
     *
     * @return new ParaBank_SignIn_page
     */
    public ParaBank_SignIn_page ClickOnLogOut() {
        ElementActions.click(driver, logOut());
        return new ParaBank_SignIn_page(driver);
    }
}
