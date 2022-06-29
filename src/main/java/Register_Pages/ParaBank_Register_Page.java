package Register_Pages;

import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ParaBank_Register_Page {
    private WebDriver driver;

    public ParaBank_Register_Page(WebDriver driver) {
        this.driver = driver;
    }

    private By customer_firstName() {
        return By.id("customer.firstName");
    }

    private By customer_lastName() {
        return By.id("customer.lastName");
    }

    private By customer_address_street() {
        return By.id("customer.address.street");
    }

    private By customer_address_city() {
        return By.id("customer.address.city");
    }

    private By customer_address_state() {
        return By.id("customer.address.state");
    }

    private By customer_address_zipCode() {
        return By.id("customer.address.zipCode");
    }

    private By customer_phoneNumber() {
        return By.id("customer.phoneNumber");
    }

    private By customer_ssn() {
        return By.id("customer.ssn");
    }

    private By customer_username() {
        return By.id("customer.username");
    }

    private By customer_password() {
        return By.id("customer.password");
    }

    private By repeatedPassword() {
        return By.id("repeatedPassword");
    }

    private By submit_Register() {
        return By.xpath("//input[@value='Register']");
    }

    /**
     *
     * @param customer_firstName String Value
     * @param customer_lastName String Value
     * @param customer_address_street String Value
     * @param customer_address_city String Value
     * @param customer_address_state String Value
     * @param customer_address_zipCode Int Value
     * @param customer_phoneNumber Int Value
     * @param customer_ssn Int Value
     * @param customer_username String Value
     * @param customer_password String Value
     * @param repeatedPassword String Value
     * @return Valid Register
     */
    public ParaBank_Register_Page ValidRegister(String customer_firstName, String customer_lastName, String customer_address_street,
                                                String customer_address_city, String customer_address_state, int customer_address_zipCode,
                                                int customer_phoneNumber, int customer_ssn, String customer_username,
                                                String customer_password, String repeatedPassword) {
        ElementActions.type(driver, customer_firstName(), customer_firstName);
        ElementActions.type(driver, customer_lastName(), customer_lastName);
        ElementActions.type(driver, customer_address_street(), customer_address_street);
        ElementActions.type(driver, customer_address_city(), customer_address_city);
        ElementActions.type(driver, customer_address_state(), customer_address_state);
        ElementActions.type(driver, customer_address_zipCode(), String.valueOf(customer_address_zipCode));
        ElementActions.type(driver, customer_phoneNumber(), String.valueOf(customer_phoneNumber));
        ElementActions.type(driver, customer_ssn(), String.valueOf(customer_ssn));
        ElementActions.type(driver, customer_username(), customer_username);
        ElementActions.type(driver, customer_password(), customer_password);
        ElementActions.type(driver, repeatedPassword(), repeatedPassword);
        return this;
    }

    /**
     *
     * @return new ParaBank_Home_Page
     */
    public ParaBank_Home_Page ClickOnRegisterButton() {
        ElementActions.click(driver, submit_Register());
        return new ParaBank_Home_Page(driver);
    }

}
