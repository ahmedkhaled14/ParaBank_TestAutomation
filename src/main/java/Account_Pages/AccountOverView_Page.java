package Account_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverView_Page {
    private WebDriver driver ;
    public static By AccountOverViewDisplayedLocator(){
        return By.xpath("//h1[contains(.,'Accounts Overview')]");
    }

    public AccountOverView_Page (WebDriver driver){
        this.driver = driver;
    }

}
