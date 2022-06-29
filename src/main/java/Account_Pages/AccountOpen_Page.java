package Account_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpen_Page {
    private WebDriver driver;

    public AccountOpen_Page(WebDriver driver) {
        this.driver = driver;
    }

    public static By AccountOpenedDisplayed() {
        return By.xpath("//h1[contains(.,'Account Opened!')]");
    }

    public By Accounts_Overview() {
        return By.xpath("//a[contains(.,'Accounts Overview')]");
    }

    /**
     *
     * @return new AccountOverView_Page
     */
    public AccountOverView_Page ClickOnAccountsOverView() {
        ElementActions.click(driver, Accounts_Overview());
        return new AccountOverView_Page(driver);
    }
}
