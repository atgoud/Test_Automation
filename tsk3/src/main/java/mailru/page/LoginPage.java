package mailru.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    private static final By LOGIN_INBOX_LOCATOR = By.xpath("//input[@id='mailbox__login']");
    private static final By PASSWORD_INBOX_LOCATOR = By.xpath("//input[@id='mailbox__password']");
    private static final By LOGIN_SUBMIT_BUTTON = By.xpath("//input[@id='mailbox__auth__button']");
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private void tryLogin(String mail, String password) {
        driver.findElement(LOGIN_INBOX_LOCATOR).sendKeys(mail);
        driver.findElement(PASSWORD_INBOX_LOCATOR).sendKeys(password);
        driver.findElement(LOGIN_SUBMIT_BUTTON).click();
    }

    public void login(String mail, String password) {
        tryLogin(mail, password);
    }

    public ErrorLoginPage errorLoginPage(String mail, String password) {
        tryLogin(mail, password);
        return PageFactory.initElements(driver, ErrorLoginPage.class);
    }
}
