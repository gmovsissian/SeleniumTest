package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement myPage;

    @FindBy(xpath = "//*[@id=\"ma\"]")
    WebElement userName;

    private WebDriver webdriver;

    public MainPage(WebDriver webdriver) {
        PageFactory.initElements(webdriver, this);
        this.webdriver = webdriver;
    }

    public void clickMyPage() {
        myPage.click();
    }
}
