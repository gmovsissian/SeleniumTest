package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PreviewPage {
    WebDriver webDriver1;

    public PreviewPage(WebDriver webDriver) {
        this.webDriver1 = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(css = "#postaction__form_action1")
    WebElement addPost;

    @FindBy(css = "#postaction__form_action2")
    WebElement changePost;

    @FindBy(css = ".btncancel")
    WebElement cancelPost;
    @FindBy(css = ".vih > h1:nth-child(1)")
    WebElement postHeader;


    public void clickAddpost() {
        addPost.click();
    }

    public void clickChangepost() {
        changePost.click();
    }

    public void clickCancelpost() {
        cancelPost.click();
    }

    public boolean isChangeButtonVisible() {
        return changePost.isDisplayed();
    }

    public boolean isAddPostVisible() {
        return addPost.isDisplayed();
    }

    public boolean isCancelPostVisiblw() {
        return cancelPost.isDisplayed();
    }

    public String getHeader() {
        return postHeader.getText();

    }
}
