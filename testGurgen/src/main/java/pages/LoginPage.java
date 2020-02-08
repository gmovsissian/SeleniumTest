package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    private WebDriver webdriver;

    public LoginPage(WebDriver webdriver) {
        this.webdriver = webdriver;
        PageFactory.initElements(webdriver, this);
    }

    @FindBy(xpath = "//*[@id=\"_idyour_email\"]")
    WebElement loginField;
    @FindBy(xpath = "//*[@id=\"_idpassword\"]")
    WebElement passwordField;
    @FindBy(xpath = "//*[@id=\"loginaction__form_action0\"]")
    WebElement loginButton;

    public void setLoginField(String string) {
        loginField.sendKeys(string);
    }

    public void setPasswordField(String string) {
        passwordField.sendKeys(string);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
