package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfilePage {
    private WebDriver webdriver;
    public   ProfilePage(WebDriver webdriver){
        PageFactory.initElements(webdriver, this);
        this.webdriver=webdriver;
    }

    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement emailField;

    @FindBy(css = "#ap")
    WebElement addPost;

    public String checkEmailfield() {
        return emailField.getText();

    }
    public void clickAddpost(){
     addPost.click();
    }
}